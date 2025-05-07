package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class Testing_Project {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetEmployee() throws Exception {
        mockMvc.perform(get("/employee"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employees[0].first_name").exists());


    }

    @Test
    public void testAddEmployee() throws Exception {
        String newEmployeeJson = """
        {
            "employee_id": "E004",
            "first_name": "Bob",
            "last_name": "Marley",
            "email": "bob.marley@example.com",
            "title": "QA Engineer"
        }
        """;

        mockMvc.perform(post("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(newEmployeeJson))
                        .andExpect(status().isOk());

        // Optionally test if the list now contains the new employee
       mockMvc.perform(get("/employee"))
                .andExpect(jsonPath("$.employees[?(@.employee_id == 'E004')]").exists());
    }
}



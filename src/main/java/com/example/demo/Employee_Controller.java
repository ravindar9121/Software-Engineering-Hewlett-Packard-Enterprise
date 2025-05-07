package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Controller {
    @GetMapping("/employee")
    public Employees getEmployees() {
        return Employee_Manager.getAllEmployees();
    }

    @PostMapping("/employees")
    public void addEmployees(@RequestBody Employee newEmployee){
        Employee_Manager.addEmployee(newEmployee);
    }

}

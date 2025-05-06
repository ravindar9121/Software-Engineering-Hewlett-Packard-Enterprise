package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Controller {
    @GetMapping("/employee")
    public Employees getEmployees(){
        return Employee_Manager.getallEmployees();
    }


}

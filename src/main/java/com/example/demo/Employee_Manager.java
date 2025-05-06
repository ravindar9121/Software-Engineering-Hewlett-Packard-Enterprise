package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee_Manager {


    public static Employees getallEmployees() {
        List<Employee> list = Arrays.asList(
                new Employee("E001", "John", "Doe", "john.doe@example.com", "Software Engineer"),
                new Employee("E002", "Jane", "Smith", "jane.smith@example.com", "Product Manager"),
                new Employee("E003", "Alice", "Johnson", "alice.johnson@example.com", "Designer")
        );
        return new Employees(list);
    }
}

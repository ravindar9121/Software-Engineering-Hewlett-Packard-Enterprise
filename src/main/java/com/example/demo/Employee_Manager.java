package com.example.demo;

import java.util.ArrayList;

public class Employee_Manager {
    private static Employees employees = new Employees(new ArrayList<>());

    static {
        employees.addEmployee(new Employee("E001", "John", "Doe", "john@example.com", "Engineer"));
        employees.addEmployee(new Employee("E002", "Jane", "Smith", "jane@example.com", "Manager"));
    }

    public static Employees getAllEmployees() {
        return employees;
    }

    public static void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}

package com.example.demo;

import java.util.List;

public class Employees {

    private List<Employee> Employees;

    public Employees(List<Employee> Employees) {
        this.Employees = Employees;
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;
    }

}

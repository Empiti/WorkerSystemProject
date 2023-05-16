package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        HashMap<Integer, Employee> employees = new HashMap<>();
        EmployeeManager employeeManager = new EmployeeManager(employees);

        employeeManager.addEmployee();
        employeeManager.addEmployee();

        employeeManager.listAllEmployees();

    }
}

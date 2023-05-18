package com.company;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private int employeeID;
    private int salary;
    private static int nextEmployeeID;

    public Employee(String firstName, String lastName, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.employeeID = nextEmployeeID;
        this.salary = salary;
        nextEmployeeID++;
    }
    public int getEmployeeID() {
        return employeeID;
    }

    public String getPosition() {
        return position;
    }

    public String getLastName() {
        return lastName;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "com.company.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {this.position = position;}
}

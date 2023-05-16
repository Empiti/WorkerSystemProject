package com.company;

import java.util.*;

public class EmployeeManager {
    private final HashMap<Integer,Employee> employees;

    public EmployeeManager(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię pracownika: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko pracownika: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj pozycję pracownika: ");
        String position = scanner.nextLine();
        System.out.print("Podaj zarobki pracownika: ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        Employee newEmployee = new Employee(firstName, lastName, position, salary);
        int employeeID = newEmployee.getEmployeeID();
        employees.put(employeeID, newEmployee);

    }
    public void removeEmployee(Employee employee){
        if(employees.containsKey(employee.getEmployeeID()))
            employees.remove(employee.getEmployeeID());
        else
            System.out.println("Pracownik o takim ID nie istnieje");
    }

    public void updateEmployee(int employeeID, Employee newEmployee){
        if(employees.containsKey(employeeID))
        {
            employees.put(employeeID,newEmployee);
        }
        else
            System.out.println("Pracownik o takim ID nie istnieje");
    }
    public Employee searchEmployeeByID(int employeeID) {
        if(employees.containsKey(employeeID)){
            return employees.get(employeeID);
        }
        else
            System.out.println("Nie znaleziono pracownika o danym ID");
        return null;
    }
    public void listAllEmployees(){
        ArrayList<Employee> employeeList = new ArrayList<>(employees.values());
        for (Employee employee: employeeList
        ) {
            System.out.println(employee);
        }
    }
    public HashSet<Employee> searchEmployeesByPosition(String position){
        HashSet<Employee> employeeList = new HashSet<>(employees.values());
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext())
        {
            Employee employee = employeeIterator.next();
            if(!employee.getPosition().equals(position))
                employeeIterator.remove();
        }
        return employeeList;
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");

        HashMap<Integer, Employee> employees = new HashMap<>();
        EmployeeManager employeeManager = new EmployeeManager(employees);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.println("1.Dodaj pracownika");
            System.out.println("2.Usuń pracownika");
            System.out.println("3.Zaktualizuj dane o pracowniku");
            System.out.println("4.Wyświetl liste wszystkich pracownikow");
            System.out.println("5.Wyszukaj pracownika po pozycji");
            System.out.println("Inna wartosc zakonczy program");
            int input = Integer.parseInt(bufferedReader.readLine());
            switch (input){
                case 1:
                    employeeManager.addEmployee();
                    break;
                case 2:
                {
                    int id = Integer.parseInt(bufferedReader.readLine());
                    employeeManager.removeEmployee(employeeManager.searchEmployeeByID(id));
                    break;
                }
                case 3:
                {
                    System.out.print("Podaj ID pracownika: ");
                    int id = Integer.parseInt(bufferedReader.readLine());
                    Employee employee = employeeManager.searchEmployeeByID(id);

                    if (employee != null) {

                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Podaj nową pozycje pracownika : ");
                        String position = scanner.nextLine();
                        System.out.print("Podaj nową wypłatę pracownika : ");
                        int salary = scanner.nextInt();
                        employeeManager.updateEmployee(id, position, salary);
                    }
                    break;
                }
                case 4:
                {
                    employeeManager.listAllEmployees();
                    break;
                }
                case 5:
                {
                    String position = bufferedReader.readLine();
                    HashSet<Employee> employeeHashSet = employeeManager.searchEmployeesByPosition(position);
                    for (Employee employee: employeeHashSet
                    ) {
                        System.out.println(employee);
                    }
                    break;

                }
                default:
                    System.exit(0);
            }
        }

    }
}

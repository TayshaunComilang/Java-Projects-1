//Comilang, Tayshaun M.
//CITCS 1N-A

package com.mycompany.employeepayroll;
import java.util.Scanner;

class Employee {
    private String employeeID, name;
    private double hourlyWage, hoursWorked;

    // Constructor
    public Employee(String employeeID, String name, double hourlyWage, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Calculate monthly salary
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        double salary = calculateSalary();
        System.out.printf("ID: %s, Name: %s, Wage: %.2f, Hours Worked: %.2f, Salary: %.2f%n",
                employeeID, name, hourlyWage, hoursWorked, calculateSalary());
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String id, name; 
        double wage, hours;
        
        Employee[] employees = new Employee[2];

        // Create Employee objects
        for (int i = 0; i < 2; i++) { 
            System.out.printf("Employee %d:%n", i + 1);
            System.out.print("ID: ");
            id = scanner.nextLine();
            
            System.out.print("Name: ");
            name = scanner.nextLine();
            
            System.out.print("Hourly Wage: ");
            wage = scanner.nextDouble();
            
            System.out.print("Hours Worked: ");
            hours = scanner.nextDouble();
            scanner.nextLine(); 
            
            employees[i] = new Employee(id, name, wage, hours);
        }

        System.out.println("\nCalculating salaries...\n");

        // Display employee details and salaries
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }

        scanner.close();
    }
}

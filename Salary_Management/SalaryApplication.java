package Salary_Management;

import java.util.Scanner;

public class SalaryApplication {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Employee employee = null;
        Salary salary = null;

        int choice;

        displayWelcome();

        do {

            displayMenu();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                employee = createEmployee();
                System.out.println("\nEmployee created successfully!");
                break;

            case 2:
                if (employee != null) {
                    salary = enterSalaryDetails();
                    System.out.println("\nSalary details added successfully!");
                } else {
                    System.out.println("\nPlease create an employee first.");
                }
                break;

            case 3:
                if (employee != null && salary != null) {
                    salary.displaySalaryDetails(employee);
                } else {
                    System.out.println("\nPlease create employee and salary details first.");
                }
                break;

            case 4:
                if (employee != null) {
                    displayEmployeeDetails(employee);
                } else {
                    System.out.println("\nPlease create an employee first.");
                }
                break;

            case 5:
                if (employee != null && salary != null) {
                    salary.displaySalaryDetails(employee);
                } else {
                    System.out.println("\nPlease enter salary details first.");
                }
                break;

            case 6:
                System.out.println("\nThank you for using Salary Management System!");
                break;

            default:
                System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }


    // Welcome message
    public static void displayWelcome() {

       
        System.out.println("       EMPLOYEE SALARY SYSTEM");
        
    }


    // Display menu
    public static void displayMenu() {

        
        System.out.println("1. Create Employee");
        System.out.println("2. Enter Salary Details");
        System.out.println("3. Calculate Salary");
        System.out.println("4. Employee Details");
        System.out.println("5. Salary Details");
        System.out.println("6. Exit");
        
    }


    // Create employee
    public static Employee createEmployee() {

        

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Experience (years): ");
        int experience = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        return new Employee(
                employeeId,
                employeeName,
                experience,
                basicSalary
        );
    }


    // Enter salary details
    public static Salary enterSalaryDetails() {

        

        System.out.print("Enter HR Expense: ");
        double hrExpense = sc.nextDouble();

        System.out.print("Enter TL Expense: ");
        double tlExpense = sc.nextDouble();

        System.out.print("Enter Other Expense: ");
        double otherExpense = sc.nextDouble();

        return new Salary(
                hrExpense,
                tlExpense,
                otherExpense
        );
    }


    // Display employee details
    public static void displayEmployeeDetails(Employee employee) {

        

        System.out.println("Employee ID     : " + employee.getEmployeeId());
        System.out.println("Employee Name   : " + employee.getEmployeeName());
        System.out.println("Experience      : " + employee.getExperience() + " years");
        System.out.println("Basic Salary    : " + employee.getBasicSalary());
    }
}


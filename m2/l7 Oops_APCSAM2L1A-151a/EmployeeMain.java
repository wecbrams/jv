// Class to represent an Employee
class Employee {
    int empno;        // Employee Number
    String name;      // Employee Name
    float sal;        // Employee Salary

    // Constructor to initialize employee details
    Employee() {
        System.out.println("*****"); // Prints a separator line
        empno = 101;    // Default employee number
        name = "Aashish"; // Default employee name
        sal = 5000f;    // Default salary
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println(empno + " | " + name + " | " + sal);
    }
}

// Main class to test Employee objects
public class EmployeeMain {
    public static void main(String[] args) {
        // Create three Employee objects
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        // Display details for each Employee
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}

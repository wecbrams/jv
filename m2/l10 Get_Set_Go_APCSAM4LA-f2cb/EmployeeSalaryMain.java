import java.util.Scanner;

public class EmployeeSalaryMain {

    public static Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        double salary;

        // Driver input
        System.out.println("Enter Id:");
        id = scanner.nextInt();

        System.out.println("Enter Name:");
        name = scanner.next();

        System.out.println("Enter Salary:");
        salary = scanner.nextDouble();

        Employee employee = new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);

        return employee;
    }

    public static int getPFPercentage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Driver program
        Employee employee = getEmployeeDetails();
        int pfp = getPFPercentage();
        employee.calculateNetSalary(pfp);

        System.out.println("Id: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Net Salary: " + employee.getNetSalary());
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    private double netSalary;

    // Getters and Setters
    public int getEmployeeId() {
        return id;
    }

    public void setEmployeeId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return name;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    // Method to calculate Net Salary
    public void calculateNetSalary(int pfPercentage) {
        double pfAmount = (salary * pfPercentage) / 100;
        this.netSalary = salary - pfAmount;
    }
}

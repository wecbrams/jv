public class StudentRegister {
    
}
import java.util.Scanner;

public class StudentRegister {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.class);

        System.out.println("=== Student Register System ===");

        // Collecting student information
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Course/Major: ");
        String major = scanner.nextLine();

        System.out.print("Enter Student GPA: ");
        double gpa = scanner.nextDouble();

        // Displaying the captured student details
        System.out.println("\n=== Registered Student Details ===");
        System.out.println("Name:     " + name);
        System.out.println("ID:       " + studentId);
        System.out.println("Major:    " + major);
        System.out.println("GPA:      " + gpa);

        // Close the scanner resource
        scanner.close();
    }
}

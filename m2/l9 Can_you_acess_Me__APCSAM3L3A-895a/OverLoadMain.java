// Class to represent a Student
class Student {
    int id;           // Student ID
    String name;      // Student Name
    float stipend;    // Student Stipend

    // Default constructor
    Student() {}

    // Constructor with 2 parameters
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with 3 parameters
    Student(int id, String name, float stipend) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);
    }
}

// Main class to test the Student class
public class OverLoadMain {
    public static void main(String[] args) {
        // Using default constructor
        Student st1 = new Student();

        // Using overloaded constructor with 2 parameters
        Student st2 = new Student(45, "Aashish");

        // Using overloaded constructor with 3 parameters
        Student st3 = new Student(234, "Cody", 1000);

        // Display details of all students
        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
    }
}

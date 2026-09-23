// This activity is mainly to understand the concept of inheritance

// Parent Class
class Parent {
    int age, id;          // Parent class variables
    String name;          // Parent class variable

    void naming(String name) {   // Method to display the name
        System.out.println("Name: " + name);
    }
}

// Child Class
class Child extends Parent {
    void ageN(int age) {         // Method to display the age
        System.out.println("Age of student is: " + age);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        // Creating an object of the child class
        Child s = new Child();
        
        // Calling methods from Parent and Child classes
        s.naming("Aashish");
        s.ageN(14);
    }
}

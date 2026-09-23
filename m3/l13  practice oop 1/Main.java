class Student {
    String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("John");
        s.display();
    }
}
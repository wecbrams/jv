class Student {
    private String name; // Private variable to store the name

    // Getter method to retrieve the name
    public String getName() {
        return name;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }
}

public class GetSet {
    public static void main(String[] args) { 
        Student s = new Student(); // Create a new Student object
        s.setName("Aashish @Codingal"); // Set the name using the setter method
        System.out.println(s.getName()); // Get and print the name using the getter method
    }
}

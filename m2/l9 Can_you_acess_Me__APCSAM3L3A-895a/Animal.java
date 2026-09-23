// Base class to demonstrate method overriding
class Animal {
    // This method will be overridden by the Child class
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Child class to demonstrate both overriding and overloading
class Dog extends Animal {
    
    // 1. METHOD OVERRIDING (Runtime Polymorphism)
    // Same name, same parameters, but in a child class
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }

    // 2. METHOD OVERLOADING (Compile-time Polymorphism)
    // Same method name, but different parameter list
    public void displayInfo(String name) {
        System.out.println("Dog's Name: " + name);
    }

    // Overloaded version: takes two parameters instead of one
    public void displayInfo(String name, int age) {
        System.out.println("Dog's Name: " + name + ", Age: " + age + " years old");
    }
}

// Main class to run and test the program
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println("--- Testing Method Overriding ---");
        // Calls the overridden method in the Dog class, not the Animal class
        myDog.makeSound(); 

        System.out.println("\n--- Testing Method Overloading ---");
        // Calls the first version of displayInfo (1 parameter)
        myDog.displayInfo("Buddy"); 
        
        // Calls the second version of displayInfo (2 parameters)
        myDog.displayInfo("Max", 3); 
    }
}

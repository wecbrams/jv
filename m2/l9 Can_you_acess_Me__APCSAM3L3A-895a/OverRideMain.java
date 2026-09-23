class Parent {
    public void sayHello() { // Method in the Parent class
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    public void sayHello() { // Overriding the method in the Child class
        System.out.println("Hello from Child");
    }
}

public class OverRideMain {
    public static void main(String[] args) {
        // Using polymorphism to call the overridden method
        Parent p = new Child(); // For calling "Hello from Child"
        // Parent p = new Parent(); // Uncomment for calling "Hello from Parent"
        p.sayHello();
    }
}

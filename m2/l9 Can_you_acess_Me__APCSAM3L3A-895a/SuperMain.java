// Superclass
class Superclass {
    int number = 56; // Variable in the Superclass
}

// Child class or subclass (derived class)
class Subclass extends Superclass {
    /*
     * The same variable 'number' is declared in the Subclass
     * which is already present in the Superclass
     */
    int number = 96; // Variable in the Subclass

    void printNumber() {
        System.out.println(number); // Prints the 'number' in the Subclass
        // Uncomment the following line to print the 'number' from Superclass
        // System.out.println(super.number);
    }
}

public class SuperMain {
    public static void main(String[] args) {
        Subclass sub = new Subclass(); // Create an object of Subclass
        sub.printNumber(); // Call the method to print numbers
    }
}

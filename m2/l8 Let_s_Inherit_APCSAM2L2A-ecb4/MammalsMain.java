// This activity is mainly to explain Hierarchical Inheritance

// Parent class
class Mammals {
    void mam() { // Parent class method
        System.out.println("Inside Mammals Class");
    }
}

// Child class 1
class Lion extends Mammals {
    void roar() { // Method in the Lion class
        System.out.println("Inside Lion class");
    }
}

// Child class 2
class Human extends Mammals {
    void hum() { // Method in the Human class
        System.out.println("Inside Human");
    }
}

// Main class to test Hierarchical Inheritance
public class MammalsMain {
    public static void main(String[] args) {
        // Object of Lion class
        Lion obj = new Lion(); 
        obj.roar(); // Calling Lion's method
        obj.mam();  // Calling inherited method from Mammals

        // Uncomment the following to test Human class
        // Human obj2 = new Human(); 
        // obj2.hum(); // Calling Human's method
        // obj2.mam(); // Calling inherited method from Mammals
    }
}

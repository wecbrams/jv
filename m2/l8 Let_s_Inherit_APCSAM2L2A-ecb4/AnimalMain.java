// This activity is mainly to explain multi-level inheritance

// Parent class
class Animal {
    void eat() { // Parent class method
        System.out.println("eating...Animal class...eat method");
    }
}

// Child class
class Lion extends Animal {
    void roar() { // Child class method
        System.out.println("Roar...Lion class...roar method");
    }
}

// Child of child
class BabyLion extends Lion {
    void weep() { // Method in the child of the child class
        System.out.println("weeping...BabyLion class...weep method");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        // Object of child of child class
        BabyLion obj = new BabyLion();
        
        // Calling methods from BabyLion, Lion, and Animal classes
        obj.weep(); // Calls BabyLion's method
        obj.roar(); // Calls Lion's method (inherited)
        obj.eat();  // Calls Animal's method (inherited)
    }
}

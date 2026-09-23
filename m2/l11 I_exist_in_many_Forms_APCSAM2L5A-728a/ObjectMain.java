// This program is created to teach the concept of abstraction

abstract class Objects {
    // Abstract method declaration
    abstract void showShape();

    public void shape() {
        System.out.println("I'm from abstract class");
    }
}

class Sphere extends Objects {
    /**
     * This is indirectly an overridden showShape method by making use of
     * the abstract class
     */
    void showShape() {
        System.out.println("Object type is Sphere.");
    }
}

class Cuboid extends Objects {
    /**
     * This is indirectly an overridden showShape method by making use of
     * the abstract class
     */
    void showShape() {
        System.out.println("Object type is Cuboid.");
    }
}

class Prism extends Objects {
    /**
     * This is indirectly an overridden showShape method by making use of
     * the abstract class
     */
    void showShape() {
        System.out.println("Object type is Prism.");
    }
}

public class ObjectMain {
    public static void main(String[] args) {
        Objects obj = new Sphere(); // Object of Sphere
        obj.showShape();
        obj = new Cuboid(); // Object of Cuboid
        obj.showShape();
        obj = new Prism(); // Object of Prism
        obj.showShape();
    }
}

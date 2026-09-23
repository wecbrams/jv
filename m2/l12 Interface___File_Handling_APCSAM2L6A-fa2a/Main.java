interface MyInterface {
    /* Compiler will treat them as:
     * public abstract void method1();
     * public abstract void method2();
     */
    public void method1();
    public void method2();
}

public class Main implements MyInterface {
    /* This class must implement both abstract methods
     * or you will get a compilation error.
     * Try removing one method and see the error.
     */
    public void method1() {
        System.out.println("Implementation of method1");
    }

    public void method2() {
        System.out.println("Implementation of method2");
    }

    public static void main(String[] args) {
        MyInterface obj = new Main(); // Create an object of the class implementing the interface
        obj.method1(); // Call method1
        obj.method2(); // Call method2
    }
}

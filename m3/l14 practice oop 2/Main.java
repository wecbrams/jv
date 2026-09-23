class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(); // Instance

        int result = c.add(10, 20); // Method/function

        System.out.println("Sum: " + result);
    }
}
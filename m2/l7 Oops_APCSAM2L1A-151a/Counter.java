class Counter {
    static int number = 10; // Shared 'number' among all objects

    void increment() {
        number = number + 1; // Increment the shared 'number'
    }

    public static void main(String[] args) {
        // Create three Counter objects
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        // Call increment for each object
        obj1.increment();
        obj2.increment();
        obj3.increment();

        // Print the value of 'number' for all objects
        System.out.println("Value in obj1: " + obj1.number);
        System.out.println("Value in obj2: " + obj2.number);
        System.out.println("Value in obj3: " + obj3.number);
    }
}

// A sample class Shape which provides a method to get the Shape's area
class Shape {
    public double getArea() {
        return 0; // Default area is 0
    }
}

// A triangle with base and height
class Triangle extends Shape { // Extended from the Shape class
    private double base;
    private double height;

    public Triangle(double base, double height) { // Constructor to initialize base and height
        this.base = base;
        this.height = height;
    }

    public double getArea() { // Area of triangle 1/2 * b * h
        // Area using Heron's formula can also be used here
        return 0.5 * base * height;
    }
}

// A SQUARE is a Shape with a specific side
class Square extends Shape {
    private double side;

    public Square(double side) { // Constructor to initialize the side
        this.side = side;
    }

    public double getArea() { // Area of the square: side * side
        return side * side;
    }
}

class Area {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2]; // Creating shape array of size 2
        // Instead of hardcoding the input, we can take input from the user also
        // A switch case could be created to choose between shapes

        shape[0] = new Square(5); // Creating Square object at index 0
        shape[1] = new Triangle(2, 2); // Creating Triangle object at index 1

        // Shape object is calling children classes' methods
        System.out.println("Area of the Square: " + shape[0].getArea());
        System.out.println("Area of the Triangle: " + shape[1].getArea());
    }
}

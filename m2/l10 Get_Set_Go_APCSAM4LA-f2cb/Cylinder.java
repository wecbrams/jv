// File: Cylinder.java
public class Cylinder {
    // Private fields restrict direct access from outside the class (Encapsulation)
    private double radius;
    private double height;

    // Constructor to initialize the object
    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius with data validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive. Setting to default 1.0");
            this.radius = 1.0;
        }
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height with data validation
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be positive. Setting to default 1.0");
            this.height = 1.0;
        }
    }

    // Method to calculate volume
    public double calculateVolume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
}

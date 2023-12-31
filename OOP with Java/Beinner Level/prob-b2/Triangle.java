public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter and setter methods
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Calculate area using Heron's formula
    @Override
    public double calculateArea() {
        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2.0;
        // Calculate the area using Heron's formula
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Calculate perimeter
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

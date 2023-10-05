public class Main {
    
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle("Red", true, 10, 5);
        // Create a Circle object
        Circle circle = new Circle(null, false, 12);
        // Create a Triangle object
        Triangle triangle = new Triangle("Green", true, 5.0, 6.0, 7.0);

        // Display information about the rectangle
        System.out.println("\nRectangle Properties:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        
        // Display information about the triangle
        System.out.println("\nTriangle Properties:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println("Side 1: " + triangle.getSide1());
        System.out.println("Side 2: " + triangle.getSide2());
        System.out.println("Side 3: " + triangle.getSide3());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        // Display information about the circle
        System.out.println("\nCircle Properties:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

    }
}

public class Circle extends Shape{
    private double radius;
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    //getter and setter method
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    // caculate area and perimeter
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean isFilled(){
        return filled;
    }

}

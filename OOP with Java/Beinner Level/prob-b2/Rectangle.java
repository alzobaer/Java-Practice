public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(String color, boolean filled, double length, double width){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    // getter and setter method
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    // calculate area and primeter
    @Override
    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }
}

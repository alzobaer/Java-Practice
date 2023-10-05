public class Shape{
    // common property
    private String color;
    protected boolean filled;

    // constructor
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    // getter and setter methsod
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // calculate area and perimeter
    public double calculateArea(){
        return 0.0;
    }

    public double calculatePerimeter(){
        return 0.0;
    }

    public boolean isFilled(){
        return filled;
    }

}
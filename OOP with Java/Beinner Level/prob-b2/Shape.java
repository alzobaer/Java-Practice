public class Shape{
    // common property
    private String color;
    private boolean filled;

    // constructor
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
}
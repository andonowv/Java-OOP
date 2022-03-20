package Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle (double height, double width){
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    protected void calculatePerimeter() {
        double result = 2 * height + 2 * height;
        super.setPerimeter(result);
    }

    @Override
    protected void calculateArea() {
        double result = height * width;
        super.setArea(result);
    }
}

package Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    protected void calculatePerimeter() {
        double result = 2 * Math.PI * radius;
        super.setPerimeter(result);
    }

    @Override
    protected void calculateArea() {
        double result = Math.PI * radius * radius;
        super.setArea(result);
    }
}

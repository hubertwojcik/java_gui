package T02.Geometry;

public class Circle extends Figure{
    private double radius;

    Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI*radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString();
    }
}

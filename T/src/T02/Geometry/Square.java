package T02.Geometry;

public class Square extends Figure{

    private double side;

    Square(double side, String color){
        super(color);
        this.side=side;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }

    @Override
    public double calculateSurface() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Kwadrat: " + super.toString();
    }
}

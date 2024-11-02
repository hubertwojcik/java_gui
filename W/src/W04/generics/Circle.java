package W04.generics;

public class Circle implements Figure{
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double getPerimitier() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle - radius = "+radius;
    }
}

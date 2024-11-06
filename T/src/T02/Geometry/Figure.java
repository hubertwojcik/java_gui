package T02.Geometry;

public abstract class Figure {


    private String color;

    Figure(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public abstract double calculateSurface();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Color: " + color + " | Surface: " + calculateSurface() + " | Perimeter: " + calculatePerimeter();
    }
}

package T02.Geometry;

public class Main {
    public static void main(String[] args){
        Square sq1 = new Square(2.5,"orange");
        Circle c1 = new Circle(2.4,"red");


        Figure[] figures = {sq1,c1};

        for (Figure fig : figures){
            System.out.println(fig.toString());
        }
    }
}

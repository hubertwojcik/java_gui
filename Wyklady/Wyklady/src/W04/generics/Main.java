package W04.generics;

public class Main {
    public static void main(String[] args){
        Square square = new Square(10);
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(3,5,8);

        FigureBox<Square> squareFigureBox= new FigureBox<>(square);
        FigureBox<Circle> circleFigureBox = new FigureBox<>(circle);
        FigureBox<Triangle> triangleFigureBox = new FigureBox<>(triangle);

        Inscribed<Square,Circle> inscribed = new Inscribed<>(square,circle);
        Inscribed<FigureBox<Square>,FigureBox<Triangle>> inscribedOne=new Inscribed<>(squareFigureBox,triangleFigureBox);
        System.out.println(squareFigureBox);
        System.out.println(circleFigureBox);
        System.out.println(triangleFigureBox);
        System.out.println(inscribed);
        System.out.println(inscribedOne);

        wildcardStandard(squareFigureBox);
        wildcardStandard(circleFigureBox);
        wildcardStandard(triangleFigureBox);

        wildcardUpperBound(squareFigureBox);
        wildcardUpperBound(circleFigureBox);
        wildcardUpperBound(triangleFigureBox);

//        wildcardLowerBound(squareFigureBox);
        wildcardLowerBound(circleFigureBox);
//        wildcardLowerBound(triangleFigureBox);
    }

    public static void wildcardStandard(FigureBox<?> figureBox){
        System.out.println(figureBox);
    }

    public static void wildcardUpperBound(FigureBox<? extends Figure> figureBox){
        System.out.println(figureBox);
    }

    public static void wildcardLowerBound(FigureBox<? super Circle> figureBox){
        System.out.println(figureBox);
    }
}

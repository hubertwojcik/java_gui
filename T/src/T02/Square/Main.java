package T02.Square;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Square> squares = new ArrayList<>();
        squares.add(new Square(4));
        squares.add(new Square(2));
        squares.add(new Square(5));
        squares.add(new Square(3));
        squares.add(new Square(1));

        System.out.println("Pre sorted value");
        for (Square sq : squares){
            System.out.println(sq);
        }

        Collections.sort(squares);

        System.out.println("sorted value");
        for (Square sq : squares){
            System.out.println(sq);
        }

    }
}

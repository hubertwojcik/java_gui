package W04.generics;

public class Square implements Figure{
    private int base;

    public Square(int base){
        this.base=base;
    }



    @Override
    public String toString() {
        return "Square - base = "+ base;
    }

    @Override
    public double getPerimitier() {
        return 4* base;
    }
}
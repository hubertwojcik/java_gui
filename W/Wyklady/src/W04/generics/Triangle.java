package W04.generics;

public class Triangle implements Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getPerimitier() {
        return a +b+c;
    }

    @Override
    public String toString() {
        return "Triangle - a = " + a +"; b = " + b +"; c = " +c;
    }
}

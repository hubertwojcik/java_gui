package T02.Square;

public class Square implements Comparable<Square>{
    private int length;
    private int number;
    private static int counter;

    Square(int length){
            this.length=length;
            this.number=counter++;
    }

    public int getArea(){
        return  length * length;
    };

    @Override
    public String toString() {
        return "(" + number + "): " + getArea();
    }

    @Override
    public int compareTo(Square sq) {
        return Integer.compare(this.getArea(),sq.getArea());
    }
}

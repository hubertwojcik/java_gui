package T02.Figure;

public class Square implements Figure{
    private int length;
    Square(int length) throws TooBigSquareException{
        if (length > Figure.max){
            throw new TooBigSquareException("Maximum lenght is "+Figure.max);
        }
        this.length=length;
    }

    @Override
    public int getArea() {
         return length*length;
    }

    @Override
    public int getPerimeter() {
        return 4*length;
    }
}

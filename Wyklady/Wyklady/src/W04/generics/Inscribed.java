package W04.generics;

public class Inscribed <T,K>{
    private T figureOne;
    private K figureTwo;

    public Inscribed(T figureOne,K figureTwo){
        this.figureOne=figureOne;
        this.figureTwo=figureTwo;
    }

    public K getFigureTwo() {
        return figureTwo;
    }

    public T getFigureOne() {
        return figureOne;
    }

    @Override
    public String toString() {
        return figureOne + " insribed in " + figureTwo;
    }
}

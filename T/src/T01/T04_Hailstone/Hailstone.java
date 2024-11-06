package T01.T04_Hailstone;
import java.util.Iterator;

public class Hailstone implements Iterable<Integer> {
    private int start;

    Hailstone(int start){
        this.start=start;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            private int current = start;

            @Override
            public boolean hasNext(){
                return current != 1;
            }

            @Override
            public Integer next(){
                int value = current;
                if ( current % 2 ==0){
                    current /= 2;}
                else{
                        current = 3 * current + 1;
                }
                return value;
            }
        };
    }

}

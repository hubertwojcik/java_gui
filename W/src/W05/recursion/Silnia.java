package W05.recursion;

public class Silnia {
    public static int recursive(int n){
        if (n==1){
            return 1;
        }
        return n*recursive(n-1);
    }
}

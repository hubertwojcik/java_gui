package W02_inheritance;

public class Piekarnik implements Urzadzenie{
    private boolean stan;

    Piekarnik(){
        stan = false;

    }
    @Override
    public void wlacz(){
        if(stan){
            System.out.println("Piekanrik jużwłączony, uważaj");
        }
        else{
            System.out.println("Piekarnik włączony");
        }
    }
    @Override
    public void wylacz(){
        if(stan){
            System.out.println("Piekarnik wylaczony");
        }else{
            System.out.println("Piekarnik już wylączony");
        }
    }
}

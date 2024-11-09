package T02.Devices;

public class Console  extends Device implements Playing,Surfing{
    private boolean isConnected;

    public Console(String producent, double cena, boolean isConnected) {
        super(producent, cena);
        this.isConnected = isConnected;
    }


    @Override
    public void play() {
        System.out.println("PLaying");
    }

    @Override
    public void surf() {
        if(isConnected){
            System.out.println("Surfing...");
        }else{
            System.out.println("Canot surf, no internet connection");
        }
    }


    @Override
    public String toString() {
        return "Console: " + super.toString();
    }
}

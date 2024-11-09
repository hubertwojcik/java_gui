package T02.Devices;

public class StationaryTelephone extends Device implements Calling{
    public StationaryTelephone(String producent, double price){
        super(producent,price);
    }

    @Override
    public void call() {
        System.out.println("Stationary telephon is calling...");
    }

    @Override
    public String toString() {
        return "Stationary telephone: "+ super.toString();
    }
}

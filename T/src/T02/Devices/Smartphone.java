package T02.Devices;

public class Smartphone extends Device implements Calling,Texting,Surfing,Playing {
    private boolean hasSim;
    private boolean isConnected;

    public Smartphone(String producent, double cena, boolean hasSim, boolean isConnected) {
        super(producent, cena);
        this.hasSim = hasSim;
        this.isConnected = isConnected;
    }

    @Override
    public void call() {
        if (hasSim) {
            System.out.println("Calling on smartphone...");
        } else {
            System.out.println("No SIM card - cannot call.");
        }
    }

    @Override
    public void text() {
        if (hasSim) {
            System.out.println("Texting...");
        } else {
            System.out.println("No SIM card - cannot text.");
        }
    }

    @Override
    public void play() {
        System.out.println("Playing on smartphone...");
    }

    @Override
    public void surf() {
        if (isConnected) {
            System.out.println("Surfing on smartphone...");
        } else {
            System.out.println("No connection, cannot surf.");
        }
    }

    @Override
    public String toString() {
        return "Smartphone - " + super.toString();
    }

}

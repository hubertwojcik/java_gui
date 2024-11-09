package T02.Devices;

public abstract class Device {
    private String producent;
    private double price;

    public Device(String producent,double price){
        this.producent=producent;
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

    public String getProducent() {
        return producent;
    }

    @Override
    public String toString() {
        return "Producent: " + producent + ", Price: " + price;
    }
}

package T04.T01;

public class Car {
    public enum Brand {
        SKODA,
        MAZDA,
        BMW,
        VOLVO
    }

    private Brand brand;
    private String number;

    Car(String number,Brand brand){
        this.brand=brand;
        this.number=number;
    }


    public Brand getBrand() {
        return brand;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return brand + " " + number;
    }
}

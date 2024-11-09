package T02.Devices;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Device[] devices = {
                new StationaryTelephone("Panasonic", 100),
                new Mobilephone("Nokia", 200, true),
                new Mobilephone("Sony", 250, false),
                new Console("PlayStation", 1500, true),
                new Console("Xbox", 1400, false),
                new Smartphone("Samsung", 1200, true, true),
                new Smartphone("Apple", 1800, false, true)
        };

        System.out.println("Testowanie funkcjonalności urządzeń:");
        for (Device device : devices) {
            System.out.println(device);

            if (device instanceof Calling) {
                ((Calling) device).call();
            }
            if (device instanceof Texting) {
                ((Texting) device).text();
            }
            if (device instanceof Surfing) {
                ((Surfing) device).surf();
            }
            if (device instanceof Playing) {
                ((Playing) device).play();
            }
            System.out.println();
        }

        Arrays.sort(devices, (d1, d2) -> Double.compare(d1.getPrice(), d2.getPrice()));

        System.out.println("Sorted by price:");
        for (Device device : devices) {
            System.out.println(device);
        }
    }
}

package T04.T01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        Map<Person,List<Car>> owners = new HashMap<>();
        List<Car> kowalskiCars = new ArrayList<>();
        List<Car> nowakCars = new ArrayList<>();
        List<Car> krawczykCars = new ArrayList<>();
        List<Car> heniekCars = new ArrayList<>();

        Person kowalski = new Person("Jan","Kowalski");
        Person nowak = new Person("Adam","Nowka");
        Person krawczyk = new Person("Bartosz","Krawczyn");
        Person heniek = new Person("kierownik","Hniem");

        Car skoda1 = new Car("WA0001",Car.Brand.SKODA);
        Car skoda2 = new Car("SC36010",Car.Brand.SKODA);
        Car mazda1 = new Car("WA01234",Car.Brand.MAZDA);
        Car mazda2 = new Car("DW01ASD",Car.Brand.MAZDA);
        Car bmw = new Car("WA12690",Car.Brand.BMW);
        Car volvo  = new Car("KR60606",Car.Brand.VOLVO);

        kowalskiCars.add(skoda1);
        kowalskiCars.add(bmw);
        nowakCars.add(mazda2);
        krawczykCars.add(volvo);
        krawczykCars.add(skoda2);



        owners.put(kowalski,kowalskiCars);
        owners.put(nowak,nowakCars);
        owners.put(krawczyk,krawczykCars);
        owners.put(heniek,heniekCars);

        for(Person person : owners.keySet()){
            List<Car> cars = owners.get(person);
            System.out.println(person.toString()+ " posiada " +cars.size() + "pojazdy");
        }

        for (List<Car> cars : owners.values()){
            for (Car car : cars){
                if(car.getNumber().startsWith("WA")){
                    System.out.println(car);
                }
            }
        }
    }
}

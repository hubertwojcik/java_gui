package T04.T02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Map<String,List<Person>> offices = new HashMap<>();

        String [] arr = {
                " office A", " John ", "Doe ",
                " office B", " John ", " Brown ",
                " office C", " Mary ", " Jones ",
                " office B", " Adam ", " Rust ",
                " office C", " Cindy ", " Frost ",
                " office A", " Kate ", "Coe ",
                " office A", " Bill ", " Brown "
        };

        for(int i = 0; i <arr.length; i+=3){
            String firstName=arr[i+1];
            String lastName=arr[i+2];
            String office=arr[i];
            Person person = new Person(firstName,lastName);

            if(!offices.containsKey(office)){
                List<Person> persons = new ArrayList<>();
                persons.add(person);
                offices.put(office,persons);
            }else {
                List<Person> persons = offices.get(office);
                persons.add(person);
                offices.put(office,persons);
            }
        }

        System.out.println(offices);
        String largestOffice = null;
        int maxEmployees = 0;
        for (Map.Entry<String, List<Person>> entry : offices.entrySet()) {
            if (entry.getValue().size() > maxEmployees) {
                maxEmployees = entry.getValue().size();
                largestOffice = entry.getKey();
            }
        }

        if (largestOffice != null) {
            System.out.println(largestOffice + ": " + maxEmployees + " users");
        }
    }


}

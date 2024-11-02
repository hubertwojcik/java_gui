package W04.collections;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList=new LinkedList<>();

     linkedList.add("ma");
        linkedList.add(0,"Ala");
        linkedList.add("3");
        linkedList.add("koty");
        linkedList.add("Ala");
//        linkedList.remove(2);

        arrayList.addAll(linkedList);

       Set<String> stringSet = new HashSet<>();
        stringSet.add("Ala");
        stringSet.add("3");
        stringSet.add("Ala");





        Map<String,String> miastaPanstwa = new HashMap<>();
        miastaPanstwa.put("Warszawa","Polska");
        miastaPanstwa.put("Kraków","Polska");
        miastaPanstwa.put("Berlin","Niemcy");

        for (String s : linkedList){
            System.out.println("Item: "+ s);
        }

        for (String s : stringSet){
            System.out.println("Item: "+ s);
        }

        for( String key : miastaPanstwa.keySet()){
            System.out.println("key: "+key);
        }

        for (String value : miastaPanstwa.values()){
            System.out.println("value: "+value);
        }

        for (Map.Entry<String,String> entry : miastaPanstwa.entrySet()){
            System.out.println(entry.getKey()+"  -  "+entry.getKey());
        }
    }
}

package T01.T02_List_collections;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
        List<Integer> numbers = new ArrayList<>();
        String currentDir = System.getProperty("user.dir");
        String filePath = currentDir + "/tab.txt";

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;

            while((line = br.readLine()) != null ){
                String[] parts = line.trim().split("\\s+");
                for(String part : parts){
                    numbers.add(Integer.parseInt(part));
                }
            }
            for (Integer n : numbers){
                System.out.print(n+" ");
            }
            System.out.println();
            Integer maxValue = Collections.max(numbers);
            System.out.println(maxValue);

            for (Integer n : numbers){
                if(n.equals(maxValue))
                    System.out.print(n+" ");
            }
        }
        finally {
                if(br!=null){
                    br.close();
                }
            }
    }
}

package W03.Strumienie.ObjectInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
//        String s = new String("Jakiś natext będzie ");
        Osoba osoba = new Osoba("Hubert","Poniatowski",28);
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try{
            oos  = new ObjectOutputStream(new FileOutputStream("/Users/hubertwojcik/Desktop/GUI/W/src/W03/Strumienie/ObjectInputStream/oosFile.txt"));
//            oos.writeObject(s);
            oos.writeObject(osoba);
            ois  = new ObjectInputStream(new FileInputStream("/Users/hubertwojcik/Desktop/GUI/W/src/W03/Strumienie/ObjectInputStream/oosFile.txt"));
            Osoba o = (Osoba) ois.readObject();
            System.out.println(o);
            // String text = (String) ois.readObject();
            // System.out.println(text);
        }finally {
            if(oos!=null){
                oos.close();
            }
        }
    }

}

package W03.Strumienie.FileInputFileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=null;
        FileOutputStream fos = null;
        try{
             fis = new FileInputStream("/Users/hubertwojcik/Desktop/GUI/W/src/W03/Strumienie/FileInputFileOutputStream/file.txt");
             fos = new FileOutputStream("/Users/hubertwojcik/Desktop/GUI/W/src/W03/Strumienie/FileInputFileOutputStream/fosFile.txt");
             int c;
             while((c=fis.read()) != -1){
                 System.out.println((char ) c);
                 fos.write(c);
             }
        }finally {
                if(fis!= null){
                    fis.close();
                }
            if(fos!= null){
                fos.close();
            }
        }
    }

}

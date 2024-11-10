package W03.Strumienie.BufferReaderWriter;


import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try{
            br = new BufferedReader(new FileReader("/Users/hubertwojcik/Desktop/GUI/W/src/W03/Strumienie/BufferReaderWriter/file.txt"));
//            bw = new BufferedWriter(new FileWriter("/Users/hubertwojcik/Desktop/GUI/W/src/W03/Strumienie/BufferReaderWriter/bwFile.txt"));
            pw = new PrintWriter("/Users/hubertwojcik/Desktop/GUI/W/src/W03/Strumienie/BufferReaderWriter/pwFile.txt");

            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
//                bw.write(s);
//                bw.newLine();
                pw.println(s);
            }
        }finally {
            if ( br!=null){
                br.close();
            }
//            if (bw !=null){
//                bw.close();
//            }
            if( pw !=null){
                pw.close();
            }
        }
    }

}

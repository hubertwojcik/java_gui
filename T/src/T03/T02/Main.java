package T03.T02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BallpointPen ballpointPen = new BallpointPen("Ballpoint Pen","red");
        Pen pen = new Pen("Pen","black");
        Scissors scissors = new Scissors("Scissors","sharp");
        Pencil pencil = new Pencil("Pencil","blue");

        PencilCase pencilCase = new PencilCase();
        pencilCase.addToCase(ballpointPen);
        pencilCase.addToCase(pen);
        pencilCase.addToCase(scissors);
        pencilCase.addToCase(pencil);


        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try{
            oos = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir")+"/src/T03/T02/file.txt"));

            oos.writeObject(pencilCase);

            ois = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir")+"/src/T03/T02/file.txt"));


            PencilCase readPencil = (PencilCase) ois.readObject();
            readPencil.showWhatIsInside();
        }
        finally {
            if( ois != null){
                ois.close();
            }
            if(oos != null){
                oos.close();
            }
        }

    }
}

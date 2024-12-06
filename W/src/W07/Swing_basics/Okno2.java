package W07.Swing_basics;

import javax.swing.*;
import java.awt.*;

public class Okno2 extends JFrame{
    public Okno2(){

        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        String rodzajPisma = Font.SANS_SERIF;
        int rozmiar = 24;
        int typ = Font.BOLD | Font.ITALIC;

        Font f = new Font(rodzajPisma,typ,rozmiar);
        jTextArea.setFont(f);
        add(jScrollPane);

        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

package W07.Swing_basics;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame{
    public Okno(){
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);

                int width = getWidth()-1;
                int height = getHeight()-1;

                g.setColor(Color.CYAN);

                for( int i= 10; i<=width/2; i+=10){
                    g.drawRect(i,i,width-i*2,height-i*2);
                }

            }
        };

        panel.setBackground(Color.yellow);

        add(panel);
        setSize(200,200);
//        Centered
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

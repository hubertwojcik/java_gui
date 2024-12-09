package W10.delegate;

import javax.swing.*;
import java.awt.event.*;

public class Okno extends JFrame {

    public Okno(){
        generateFrame();
    }

    public void generateFrame(){

        JButton jButton = new JButton("Ala ma kota");

//        jButton.setActionCommand("Michał");

        jButton.putClientProperty("typWitania", "Dzień dobry");
        jButton.putClientProperty("imie", "Michał");



//        jButton.addActionListener(new MyButtonActionListener());
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Wciśnięto przycisk (AKW)!");

                JButton b = (JButton) e.getSource();
//                b.setText("Wciśnięto!");
//                b.setText("Witaj " + b.getActionCommand() + "!");
//                System.out.println(b.getActionCommand());
                b.setText(b.getClientProperty("typWitania") + " "
                        + b.getClientProperty("imie") + "!");
            }
        });

        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked");
                System.out.println("Wspłrzędne:\n" +
                        "X = " + e.getX() + "\n" +
                        "Y = " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited");
            }
        });

        jButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("keyTyped");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("keyPressed");
                System.out.println("Wciśnięto klawicz: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased");
            }
        });



        this.getContentPane().add(jButton);


        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

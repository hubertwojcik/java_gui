package W07.Swing_basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class Okno3 extends JFrame {
    public Okno3() {
        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());

        JButton jButton1 = new JButton("Start");
        JButton jButton2 = new JButton("End");
        JButton jButton3 = new JButton("LineStart");
        JButton jButton4 = new JButton("LineEnd");
        JButton jButton5 = new JButton("Center");

        JPanel panelPageStart = new JPanel();
        panelPageStart.setLayout(new FlowLayout());
        panelPageStart.add(jButton1);
        panelPageStart.add(new JButton("AAA"));

        panel.add(panelPageStart, BorderLayout.PAGE_START);
        panel.add(jButton2, BorderLayout.PAGE_END);
        panel.add(jButton3, BorderLayout.LINE_START);
        panel.add(jButton4, BorderLayout.LINE_END);
        panel.add(jButton5, BorderLayout.CENTER);

        // Dodanie panelu do JFrame
        add(panel);

        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton5.setText("Text Clicked");
            }
        });

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

package W10.delegate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Wciśnięto przycisk (MyButtonActionListener)!");
    }
}

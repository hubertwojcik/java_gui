package W10.delegate;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*
        ActionListener
        AdjustmentListener
        FocusListener
        ItemListener
        WindowListener
        MouseListener
        MouseMotionListener
        KeyListener

        addXListener(słuchacz);
        addXListener(słuchacz);

        removeXListener(słuchacz);
        */

        SwingUtilities.invokeLater(()->new Okno());

    }

}

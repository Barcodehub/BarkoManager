
package restaurant;

import javax.swing.*;
import javax.swing.ImageIcon;

public class ClienteGUI extends JLabel {
    public ClienteGUI() {
        setIcon(new ImageIcon(getClass().getResource("/images/goku.png")));
        setSize(getPreferredSize());
    }

    public void moverA(int x, int y) {
        setLocation(x, y);
    }
    public void sefue() {
        setVisible(false);
    }
}

package restaurant;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MeseroGUI extends JLabel {
    public MeseroGUI() {
        setIcon(new ImageIcon(getClass().getResource("/images/megumin.png")));
        setSize(getPreferredSize());
    }

    public void moverA(int x, int y) {
        setLocation(x, y);
    }
    
    
}
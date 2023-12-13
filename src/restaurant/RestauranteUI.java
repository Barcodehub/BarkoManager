
package restaurant;


import javax.swing.*;
import java.awt.*;

public class RestauranteUI extends JFrame {
    private Restaurante restaurante;
    private JTextArea textArea;

    public RestauranteUI() {
        this.restaurante = restaurante;
        this.textArea = new JTextArea();

        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarMensaje(String mensaje) {
        textArea.append(mensaje + "\n");
    }
}
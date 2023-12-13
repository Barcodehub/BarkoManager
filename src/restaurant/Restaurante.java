package restaurant;

import java.awt.Color;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class Restaurante {
    private static final int NUM_MESEROS = 3;
    private static final int NUM_CLIENTES = 10;
    private JButton stopButton;
    private Queue<Cliente> colaClientes = new LinkedList<>();
    private Object lock = new Object();

    private Thread[] meseros;
    private JFrame frame;
    private ClienteGUI[] clientesGUI;
    private MeseroGUI[] meserosGUI;

    public Restaurante() {
        meseros = new Thread[NUM_MESEROS];
        for (int i = 0; i < NUM_MESEROS; i++) {
            meseros[i] = new Thread(new Mesero(this, "mesero" + (i + 1), i));
        }
        
        frame = new JFrame("Restaurante");
        frame.setLayout(null);
        frame.setSize(800, 600);
        
         frame = new JFrame("Restaurante");
        frame.setLayout(null);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.MAGENTA);
        
        clientesGUI = new ClienteGUI[NUM_CLIENTES];
        for (int i = 0; i < NUM_CLIENTES; i++) {
            clientesGUI[i] = new ClienteGUI();
            clientesGUI[i].moverA(50 * i, 50);
            frame.add(clientesGUI[i]);
        }
        
        meserosGUI = new MeseroGUI[NUM_MESEROS];
        for (int i = 0; i < NUM_MESEROS; i++) {
            meserosGUI[i] = new MeseroGUI();
            meserosGUI[i].moverA(50 * i, 100);
            frame.add(meserosGUI[i]);
        }
        stopButton = new JButton("Detener");
        stopButton.setBounds(50, 500, 100, 50);
        stopButton.addActionListener(e -> detenerMeseros());
        frame.add(stopButton);
        frame.setVisible(true);
    }

    public void iniciar() {
    for (Thread mesero : meseros) {
        mesero.start();
    }

    for (int i = 1; i <= NUM_CLIENTES; i++) {
        Cliente cliente = new Cliente("Cliente" + i, i - 1);
        agregarCliente(cliente);
    }
}

    public void agregarCliente(Cliente cliente) {
        synchronized (lock) {
            colaClientes.offer(cliente);
            lock.notify();
        }
    }

    public Cliente obtenerCliente() {
        synchronized (lock) {
            while (colaClientes.isEmpty()) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    // El hilo fue interrumpido, devuelve null
                    return null;
                }
            }
            return colaClientes.poll();
        }
    }
    

    public ClienteGUI obtenerClienteGUI(int index) {
        return clientesGUI[index];
    }

    public MeseroGUI obtenerMeseroGUI(int index) {
        return meserosGUI[index];
    }
    
    public void eliminarClienteGUI(int index) {
    frame.remove(clientesGUI[index]);
    frame.revalidate();
    frame.repaint();
}
    
    
     private int clientesAtendidos = 0;
    public void clienteAtendido() {
        synchronized (lock) {
            clientesAtendidos++;
            if (clientesAtendidos == NUM_CLIENTES) {
                JOptionPane.showMessageDialog(frame, "Todos los clientes fueron atendidos");
                for (Thread mesero : meseros) {
                    mesero.interrupt();
                }
               
            }
            if (clientesAtendidos >= 50000) {
                for (Thread mesero : meseros) {
                    mesero.interrupt();
                } 
        }
            
    }
    }
    
       public void detenerMeseros() {
        for (Thread mesero : meseros) {
            mesero.interrupt();
            clientesAtendidos = 53000;
        }
        frame.dispose();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.BarkoManager.main(new String[]{});
    }

}
package restaurant;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
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
        stopButton.setBounds(50, 250, 100, 50);
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
                Thread.currentThread().interrupt(); // Restablece el estado de interrupción
                return null;
            }
        }
        // Comprueba si el hilo ha sido interrumpido después de esperar
        if (Thread.currentThread().isInterrupted()) {
            return null;
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
    
    
    private List<Integer> espaciosVacios = new ArrayList<>();

       int clientesAtendidos;
public void clienteAtendido(int indexClienteAtendido) {
    synchronized (lock) {
        clientesAtendidos++;
        // Agrega el índice del cliente atendido a la lista de espacios vacíos
        espaciosVacios.add(indexClienteAtendido);
        
        // Crea un nuevo cliente después de que uno ha sido atendido
        if (!espaciosVacios.isEmpty()) {
            try {
                // Espera 5 segundos
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            if (clientesAtendidos >=1000){
            for (Thread mesero : meseros) {
            mesero.interrupt();
            clientesAtendidos = 9999;
        }
            }
            // Toma un índice de la lista de espacios vacíos
            int indexNuevoCliente = espaciosVacios.remove(0);
            // Crea un nuevo cliente
            Cliente nuevoCliente = new Cliente("Cliente" + (clientesAtendidos + 1), indexNuevoCliente);
            // Agrega el nuevo cliente a la cola
            agregarCliente(nuevoCliente);
            // Crea y agrega un nuevo ClienteGUI al frame
            ClienteGUI nuevoClienteGUI = new ClienteGUI();
            nuevoClienteGUI.moverA(50 * indexNuevoCliente, 50);
            frame.add(nuevoClienteGUI);
            // Actualiza el array clientesGUI
            clientesGUI[indexNuevoCliente] = nuevoClienteGUI;
            frame.revalidate();
            frame.repaint();
        }
    }
}
    
       public void detenerMeseros() {
        for (Thread mesero : meseros) {
            mesero.interrupt();
            clientesAtendidos = 9999;
        }
        frame.dispose();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.BarkoManager.main(new String[]{});
    }

}
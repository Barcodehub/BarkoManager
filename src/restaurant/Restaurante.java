package restaurant;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Restaurante {
    private static final int NUM_MESEROS = 3;
    private static final int NUM_CLIENTES = 10;
    
    //botones
    private JButton stopButton;
    private JButton stopfButton;
    private JButton replayButton;
    private JButton backButton;
    private JButton infoButton;
    
    private Queue<Cliente> colaClientes = new LinkedList<>();
    private List<Integer> espaciosVacios = new ArrayList<>();
    private Object lock = new Object();
    private final Mesero mesero = null;

    private Thread[] meseros;
    private JFrame frame;
    private ClienteGUI[] clientesGUI;
    private MeseroGUI[] meserosGUI;
    
    //Contadores
    int clientesAtendidos;
    int limiteClientes = 20;
    int contadorCola=0;

    public Restaurante() {
        meseros = new Thread[NUM_MESEROS];
        for (int i = 0; i < NUM_MESEROS; i++) {
            meseros[i] = new Thread(new Mesero(this, "mesero" + (i + 1), i));
        }
        
        
        frame = new JFrame("Simulador Restaurante");
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
        
        //info
        infoButton = new JButton("Info");
        infoButton.setBounds(10, 10, 50, 25);
        infoButton.addActionListener(e -> mensaje());
        frame.add(infoButton);
        frame.setVisible(true);
        
        
        
        //Boton detener forzada ejecucion de hilos
        stopfButton = new JButton("Detener forzado");
        stopfButton.setBounds(50, 250, 180, 50);
        stopfButton.addActionListener(e -> cerrarRestaurante());
        frame.add(stopfButton);
        frame.setVisible(true);
        
         //Boton detener ejecucion de hilos
        stopButton = new JButton("Detener (Interrumpir)");
        stopButton.setBounds(230, 250, 190, 50);
        stopButton.addActionListener(e -> cerrarRestaurante2());
        frame.add(stopButton);
        frame.setVisible(true);
        
        //Boton Replay
        replayButton = new JButton("Replay");
        replayButton.setBounds(50, 325, 100, 50);
        replayButton.addActionListener(e -> replay());
        frame.add(replayButton);
        frame.setVisible(true);
        
        //Boton gresar
        backButton = new JButton("Regresar");
        backButton.setBounds(430, 250, 100, 50);
        backButton.addActionListener(e -> regresar());
        frame.add(backButton);
        frame.setVisible(true);
        
        
    frame.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        detenerMeseros();
        System.exit(0);
    }
});
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
            contadorCola++;
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
    
        
        
        boolean t = false;
public void clienteAtendido(int indexClienteAtendido) {
    synchronized (lock) {
        
        System.out.println("a\n");
             if(t == true){
                for (Thread mesero : meseros) {
            mesero.interrupt();
        }
            }else{
             // Agrega el índice del cliente atendido a la lista de espacios vacíos
        espaciosVacios.add(indexClienteAtendido);
        // Crea un nuevo cliente después de que uno ha sido atendido
        if (!espaciosVacios.isEmpty()) {
            try {
                // Espera 5 segundos
                Thread.sleep(1100);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
                 
                 
                 if (clientesAtendidos ==limiteClientes){
           JOptionPane.showMessageDialog(null, "El restaurante ha cerrado sus puertas\n"
                    + "Numero de Clientes atendidos: "+clientesAtendidos);
            }
            
            else if (contadorCola != limiteClientes){
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
    }
}
    
       public void detenerMeseros() {
        for (Thread mesero : meseros) {
            mesero.stop();
        }
        //frame.dispose();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

     public void replay(){
         detenerMeseros();
         frame.dispose();
         RestauranteApp.main(new String[]{});
     }  
     
     public void regresar(){
         detenerMeseros();
         frame.dispose();
         calculadora.BarkoManager.main(new String[]{});
     }  
     
     //detencion forzada
     public void cerrarRestaurante(){
         detenerMeseros();
         JOptionPane.showMessageDialog(null, "El restaurante ha cerrado inesperadamente temprano\n"
                    + "Numero de Clientes atendidos: "+clientesAtendidos);
         t = true;
     }
     
       //interrupcion
     public void cerrarRestaurante2(){
          for (Thread mesero : meseros) {
            mesero.interrupt();
        }
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JOptionPane.showMessageDialog(null, "El restaurante ha cerrado inesperadamente temprano\n"
                    + "Numero de Clientes atendidos: "+clientesAtendidos);
         t = true;
     }
     
     public void mensaje(){
         JOptionPane.showMessageDialog(null, "Detener forzado: en Java, no hay una forma segura y recomendada de detener un hilo "
                 + "\nde manera inmediata y forzada. El método Thread.stop() se proporcionó en versiones anteriores de Java "
                 + "\npara este propósito, pero ha sido deprecado debido a su inseguridad.\n" +
"\n" +
"\nDetener: La forma recomendada de detener un hilo en Java es mediante la interrupción\n"
                 + "\nSin embargo interrumpir un hilo no necesariamente detiene el hilo inmediatamente.\n"
                 + "Si un hilo no comprueba su estado de interrupción, no deja de ejecutarse incluso cuando se llama a"
                 + "\n interrupt() en él.");
     }
     
     
     
}
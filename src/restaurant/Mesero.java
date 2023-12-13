package restaurant;

import javax.swing.*;
import java.util.Random;

public class Mesero implements Runnable {
    private final Restaurante restaurante;
    private final String nombre;
    private final int index;

    public Mesero(Restaurante restaurante, String nombre, int index) {
        this.restaurante = restaurante;
        this.nombre = nombre;
        this.index = index;
    }

    public void atenderCliente(Cliente cliente) throws InterruptedException {
        
        ClienteGUI clienteGUI = restaurante.obtenerClienteGUI(cliente.getIndex());
        MeseroGUI meseroGUI = restaurante.obtenerMeseroGUI(index);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
             return;
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                meseroGUI.moverA(clienteGUI.getX(), clienteGUI.getY());
            }
        });

        Random random = new Random();
        int tiempoAtencion = random.nextInt(10) + 1;
        try{
            Thread.sleep(tiempoAtencion * 1000);
        } catch (InterruptedException e) {
             return;
        }
        

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                meseroGUI.moverA(50 * index, 100);
            }
        });
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Cliente cliente = restaurante.obtenerCliente();
                if (cliente == null) {
                // El hilo fue interrumpido, termina la ejecución
                break;
            }
                atenderCliente(cliente);
                restaurante.eliminarClienteGUI(cliente.getIndex());
                 restaurante.clienteAtendido();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
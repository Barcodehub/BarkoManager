package restaurant;

import javax.swing.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        if(restaurante.t==false){
        
        ClienteGUI clienteGUI = restaurante.obtenerClienteGUI(cliente.getIndex());
        MeseroGUI meseroGUI = restaurante.obtenerMeseroGUI(index);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
             return;
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                meseroGUI.moverA(clienteGUI.getX()-8, clienteGUI.getY()-8);
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
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
            }
        });
        restaurante.clientesAtendidos++;
        }
       
        
                
    }

    @Override
    public void run() {
        try {
             if (restaurante.t==false){
            while (restaurante.t==false) {
                Cliente cliente = restaurante.obtenerCliente();
                if (cliente == null) {
                // El hilo fue interrumpido, termina la ejecución
                break;
            }
               if (restaurante.t==false){
                   
                atenderCliente(cliente);
                restaurante.eliminarClienteGUI(cliente.getIndex());
                restaurante.clienteAtendido(cliente.getIndex());
                
                }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
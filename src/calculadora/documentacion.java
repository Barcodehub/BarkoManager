/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;


import java.awt.Toolkit;

/**
 *
 * @author BRAYAN
 */
public class documentacion extends javax.swing.JFrame {

    /**
     * 
     */
    public documentacion() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icono.png")));
    }
String definicion = "";


 private void text(String definicion){
        
        areatext.setText("");
        areatext.setLineWrap(true);
        areatext.setWrapStyleWord(true);
        areatext.setText(definicion);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatext = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BarkoManager_Documentacion");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        areatext.setColumns(20);
        areatext.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        areatext.setRows(5);
        jScrollPane1.setViewportView(areatext);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton1.setText("Reparar Archivos del SO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton2.setText("Optimizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton3.setText("Chequear y Restaurar la ISO del S.O");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton4.setText("Analisis de malware");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton5.setText("Chequear unidad de DISCO y arreglar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton6.setText("Analisis del so");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton8.setText("Hilos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 255, 255));
        jButton10.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton10.setText("Regresar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 255, 255));
        jButton13.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton13.setText("Rendimiento/Apariencia");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton6))
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton13)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton8))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        
        definicion = "SFC/scannow: \n\n"
                + "es el parámetro más usado y se encarga de analizar la integridad de todos los\n" +
"archivos del sistema y repara los archivos con algún tipo de error";
        
        text(definicion);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         definicion = "Elimina la cache internet y archivos temporales: \n"
                 +"\nElimina la cache internet: \n"
                 + "ipconfig /flushdns\n"
                 + "\n Elimina los archivos temporales aplicativos\n" +
" cd c:\\\n" +
"del *.tmp /s /f /q\n" +
"\n" +
" Elimina archivos logs\n" +
" cd c:\\\n" +
"del *.log /s /f /q\n" +
"\n" +
"Elimina archivos temporales del sistema\n" +
"del c:\\windows\\temp\\ /s /f /q\n" +
"\n" +
" Elimina archivos temporales del usuario\n" +
" del %temp% /s /f /q\n" +
"\n" +
"Elimina archivos prefetch\n" +
"del c:\\windows\\prefetch\\ /s /f /q \n"
                 ;
         
        
        text(definicion);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            definicion = "Analisis de Malware\n"
                 + "\nComando mrt \n"
                 + "\nCuando ejecutas mrt en la línea de comandos, se abrirá la interfaz gráfica de usuario de la herramienta de eliminación de software malintencionado. A partir de ahí, puedes elegir entre varios tipos de escaneos, incluyendo un escaneo rápido, un escaneo completo o un escaneo personalizado de ciertas carpetas en tu sistema.";
        
        text(definicion);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            definicion = "Para comprobar si una imagen es reparable\n" +
"\n" +
"Examine la imagen para comprobar si hay daños. Esta operación puede tardar varios minutos. Por ejemplo, en el símbolo del sistema, escriba el siguiente comando:\n" +
"\n" +
"\n" +
"Dism /Online /Cleanup-Image /ScanHealth\n" +
"Compruebe la imagen para ver si se ha detectado algún daño. Por ejemplo, en el símbolo del sistema, escribe:\n" +
"\n" +
"\n" +
"Dism /Online /Cleanup-Image /CheckHealth\n" +
"Al usar el argumento /CheckHealth sfc, la herramienta DISM notificará si la imagen es correcta, reparable o no reparable. Si la imagen no es reparable, debe descartar la imagen e iniciarla de nuevo. Si la imagen es reparable, puede usar el argumento /RestoreHealth para repararla.\n" +
"\n" +
"Para reparar una imagen\n" +
"\n" +
"Use el argumento /RestoreHealth para reparar la imagen. Por ejemplo, para reparar una imagen sin conexión mediante una imagen montada como origen de reparación, en un símbolo del sistema, escriba el siguiente comando:\n" +
"\n" +
"\n" +
"Dism /Image:C:\\offline /Cleanup-Image /RestoreHealth";
        
        text(definicion);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        definicion = "Cuando ejecutas chkdsk c: /f /r, le estás pidiendo a tu computadora que haga lo siguiente:\n" +
"\n" +
"\nInicia la utilidad Check Disk (chkdsk): Esta utilidad examina el disco duro en busca de errores.\n" +
"\nSelecciona el disco C (c:): Le dice a la utilidad que quieres examinar y reparar el disco C.\n" +
"\nCorrige los errores que encuentra (/f): Si la utilidad encuentra errores en el disco, intentará corregirlos automáticamente.\n" +
"\nLocaliza los sectores defectuosos y recupera la información que se puede leer (/r): Además de corregir los errores, la utilidad también intentará recuperar la información de los sectores defectuosos del disco.\n" +
"\nPor lo tanto, el comando completo chkdsk c: /f /r le pide a tu computadora que examine el disco C, corrija cualquier error que encuentre y recupere la información de los sectores defectuosos. Es una forma de mantener la salud de tu disco duro y prevenir la pérdida de datos";
        
        text(definicion);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
definicion = "al ejecutar winsat formal -v, está solicitando una evaluación completa del rendimiento de tu sistema "
        + "con una salida detallada.\n"
        + " Esto puede incluir pruebas de rendimiento para la CPU, la memoria, "
        + "el disco duro, la tarjeta gráfica, entre otros.\n"
        + "\nwinsat: Es la abreviatura de “Windows System Assessment Tool”. Esta utilidad evalúa las características y capacidades de rendimiento de los componentes de hardware de un sistema.\n" +
"formal: Este es un parámetro que le dice a WinSAT que ejecute una evaluación formal. Una evaluación formal ejecuta una serie de pruebas en los componentes de hardware de tu sistema y registra los resultados en un archivo de registro.\n" +
"-v: Este es un parámetro que le dice a WinSAT que muestre información detallada (verbose) mientras ejecuta las pruebas.\n" +
"Por lo tanto, el comando completo winsat formal -v inicia la utilidad WinSAT, le dice que ejecute una evaluación formal y que muestre información detallada mientras ejecuta las pruebas. Esta es una forma de evaluar el rendimiento de los componentes de hardware de tu sistema y obtener información detallada sobre cómo se están desempeñando." ;
         
        
        text(definicion); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
              definicion = "Este apartado es una simulacion de como funcionan los hilos de forma grafica, lo que hace es que hay 3 meseros y 10 clientes, cada mesero es un hilo y se ejecuta al mismo tiempo debido a la concurrencia\n"
                      + "\nLuego de atender a los primeros 10 clientes, el programa ahora crea un nuevo cliente cada 1 segundo después que un cliente es atendido justo en los espacios vacíos dejados por los clientes satisfechos, "
                      + "simulando asi la llegada de un nuevo Cliente"
                      + "\n\nhay un limite de Clientes(20) que llegan al Restaurante, una vez todos han sido atendidos, el Restaurante cierra sus puertas\n" +
"Se implementa un botón de Re-play que detiene la ejecución y vuelve a empezar; además de un botón de Regresar para volver a la pantalla del BarkoManager y el botón detener se divide en 2, uno de detención forzada y detención "
                      + "por medio de la interrupción a los hilos, ahora te dice cuántos clientes alcanzaron a ser atendidos.";
        
        text(definicion);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       BarkoManager b = new BarkoManager();
       this.dispose();
       b.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         definicion = "Apartado visual de Windows\nComando con el cual carga el apartado para priorizar ya sea el rendimiento o la apariencia de Windows, lo normal es en default"
                + "\nSystemPropertiesPerformance.exe";
        
        text(definicion);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new documentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areatext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

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
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jButton2.setText("Optimizar Windows");
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

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton7.setText("Servicios Innecesarios");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addComponent(jButton10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        
        definicion = "SFC\n" +
"/scannow: es el parámetro más usado y se encarga de analizar la integridad de todos los\n" +
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
                 + "Comando mrt \n"
                 + "Cuando ejecutas mrt en la línea de comandos, se abrirá la interfaz gráfica de usuario de la herramienta de eliminación de software malintencionado. A partir de ahí, puedes elegir entre varios tipos de escaneos, incluyendo un escaneo rápido, un escaneo completo o un escaneo personalizado de ciertas carpetas en tu sistema.";
        
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    definicion = "Se desactiva o activa los servicios de xbox, cola de impresion y control parental\n"
        + "\nPara iniciar un servicio es:\n" +
"\nsc start wuauserv && sc config wuauserv start = auto"
        + "\nPara desactivar disable" ;
         
        
        text(definicion); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
              definicion = "Este apartado lo que hace es que hay 3 meseros y 10 clientes, cada mesero es un hilo y se ejecuta al mismo tiempo debido a la concurrencia\n";
        
        text(definicion);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       BarkoManager b = new BarkoManager();
       this.dispose();
       b.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

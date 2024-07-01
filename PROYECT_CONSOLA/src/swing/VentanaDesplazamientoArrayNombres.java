/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

/**
 *
 * @author Jorge
 */
public class VentanaDesplazamientoArrayNombres extends javax.swing.JFrame {
    //BASE DE DATOS//
                    //  0         1     2         3         4
    String[] nombres ={"Luis","Miguel","Carlos","Maria","Vanesa","Melisa","Luisa","Gerson"};
    public VentanaDesplazamientoArrayNombres() {
        initComponents();
        txtNombre.setText(nombres[0]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdIzquierda = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        cmdDerecha = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmdInicio = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdAleatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdIzquierda.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdIzquierda.setText("<<");
        cmdIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIzquierdaActionPerformed(evt);
            }
        });

        txtIndice.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(255, 51, 51));
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndice.setText("0");
        txtIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndiceActionPerformed(evt);
            }
        });

        cmdDerecha.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdDerecha.setText(">>");
        cmdDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDerechaActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BOTON DESPLAZAMIENTO IZQUIERDA-DERECHA");
        lblTitulo.setOpaque(true);

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdInicio.setText("INICIO");
        cmdInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInicioActionPerformed(evt);
            }
        });

        cmdUltimo.setText("ÚLTIMO");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });

        cmdAleatorio.setText("ALEATORIO");
        cmdAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdInicio)
                            .addComponent(cmdIzquierda))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(cmdDerecha))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(cmdAleatorio)
                                .addGap(34, 34, 34)
                                .addComponent(cmdUltimo)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdIzquierda)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdInicio)
                    .addComponent(cmdUltimo)
                    .addComponent(cmdAleatorio))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIzquierdaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei > 0){
        indicei--;
        txtIndice.setText(indicei+"");
        txtNombre.setText(nombres[indicei]);
        }
    }//GEN-LAST:event_cmdIzquierdaActionPerformed

    private void txtIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndiceActionPerformed

    private void cmdDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDerechaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei <nombres.length-1){
        indicei++;
        txtIndice.setText(indicei+"");
        txtNombre.setText(nombres[indicei]);//pinta el nombre
        }
        
    }//GEN-LAST:event_cmdDerechaActionPerformed

    private void cmdInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInicioActionPerformed
     txtIndice.setText("0");
     txtNombre.setText(nombres[0]);
    }//GEN-LAST:event_cmdInicioActionPerformed

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
    txtIndice.setText((nombres.length-1)+"");
    txtNombre.setText(nombres[nombres.length-1]);
    }//GEN-LAST:event_cmdUltimoActionPerformed

    private void cmdAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAleatorioActionPerformed
        int aleatorio = (int)(Math.random()*nombres.length);
        txtIndice.setText(aleatorio + "");
        txtNombre.setText(nombres[aleatorio]);
    }//GEN-LAST:event_cmdAleatorioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDesplazamientoArrayNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAleatorio;
    private javax.swing.JButton cmdDerecha;
    private javax.swing.JButton cmdInicio;
    private javax.swing.JButton cmdIzquierda;
    private javax.swing.JButton cmdUltimo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

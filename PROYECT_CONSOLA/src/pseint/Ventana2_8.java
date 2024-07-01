/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ventana2_8 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2_8
     */
    public Ventana2_8() {
        initComponents();
        personalizarVentana();
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTITULO = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cboCategoria = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblSuelso = new javax.swing.JLabel();
        txtSueldoAumento = new javax.swing.JTextField();
        lblSueldoAumento = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(398, 340));
        setMinimumSize(new java.awt.Dimension(398, 340));
        setPreferredSize(new java.awt.Dimension(398, 340));
        setSize(new java.awt.Dimension(398, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTITULO.setBackground(new java.awt.Color(0, 0, 0));
        lblTITULO.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTITULO.setForeground(new java.awt.Color(255, 255, 255));
        lblTITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTITULO.setText("AUMENTO DE SUELDO 15% 10% 8% 5%");
        lblTITULO.setOpaque(true);
        getContentPane().add(lblTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 22));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 10));

        cboCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cboCategoria.setForeground(new java.awt.Color(51, 51, 255));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1", "2", "3", "4" }));
        cboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoriaItemStateChanged(evt);
            }
        });
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtSueldo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtSueldo.setForeground(new java.awt.Color(0, 51, 255));
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 95, 28));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 117, 400, 10));

        lblCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblCategoria.setText("SELECCIONAR CATEGORIA");
        getContentPane().add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 30));

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(0, 51, 255));
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 30));

        lblSuelso.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblSuelso.setText("INGRESAR SUELDO");
        getContentPane().add(lblSuelso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 110, -1));

        txtSueldoAumento.setEditable(false);
        txtSueldoAumento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtSueldoAumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoAumentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 30));

        lblSueldoAumento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblSueldoAumento.setText("SUELDO CON AUMENTO");
        getContentPane().add(lblSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 400, 10));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtSueldo.setText("");
        txtSueldoAumento.setText("");
        cboCategoria.setSelectedIndex(0);
        txtCategoria.setText("");
        
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        try {
            String sueldos = txtSueldo.getText();
            double sueldod = Double.parseDouble(sueldos);

            String porcentajes = txtCategoria.getText();
            String porcentajes1 = porcentajes.substring(0, porcentajes.length() - 1);
            int porcentajei = Integer.parseInt(porcentajes1);

            double sueldoAumento = sueldod * (1 + porcentajei / 100.0);
            txtSueldoAumento.setText(sueldoAumento + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void txtSueldoAumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoAumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoAumentoActionPerformed

    private void cboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaItemStateChanged
        String items = (String) cboCategoria.getSelectedItem();
        if (!items.equals("SELECCIONE")) {
            int itemi = Integer.parseInt(items);
            switch (itemi) {
                case 1:
                    txtCategoria.setText("15%");
                    break;
                case 2:
                    txtCategoria.setText("10%");
                    break;
                case 3:
                    txtCategoria.setText("8%");
                    break;
                case 4:
                    txtCategoria.setText("5%");
                    break;
            }
        } else {
            txtCategoria.setText("");
        }

    }//GEN-LAST:event_cboCategoriaItemStateChanged

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
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2_8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblSueldoAumento;
    private javax.swing.JLabel lblSuelso;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoAumento;
    // End of variables declaration//GEN-END:variables
}

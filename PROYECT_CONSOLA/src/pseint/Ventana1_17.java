package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana1_17 extends javax.swing.JFrame {

    public Ventana1_17() {
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblB5 = new javax.swing.JLabel();
        lblB21 = new javax.swing.JLabel();
        lblB1 = new javax.swing.JLabel();
        lblB10 = new javax.swing.JLabel();
        txtBilletes10 = new javax.swing.JTextField();
        txtBilletes5 = new javax.swing.JTextField();
        txtBilletes1 = new javax.swing.JTextField();
        txtBilletes20 = new javax.swing.JTextField();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 340));
        setMinimumSize(new java.awt.Dimension(400, 340));
        setPreferredSize(new java.awt.Dimension(400, 340));
        setSize(new java.awt.Dimension(400, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTITULO.setBackground(new java.awt.Color(0, 0, 0));
        lblTITULO.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTITULO.setForeground(new java.awt.Color(255, 255, 255));
        lblTITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTITULO.setText("CONVERSIÓN DE BILLETES 20 - 10 - 5 - 1");
        lblTITULO.setOpaque(true);
        getContentPane().add(lblTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 22));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 400, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 400, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 226, 400, 10));

        lblCantidad.setText("INGRESE CANTIDAD EN EUROS A CONVERTIR");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 40, 256, -1));

        txtCantidad.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(51, 51, 255));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 71, 71, -1));

        lblB5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB5.setText("Billetes 5");
        getContentPane().add(lblB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 90, -1));

        lblB21.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB21.setText("Billetes 20");
        getContentPane().add(lblB21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, -1));

        lblB1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB1.setText("Billetes 1");
        getContentPane().add(lblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 90, -1));

        lblB10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB10.setText("Billetes 10");
        getContentPane().add(lblB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, -1));

        txtBilletes10.setEditable(false);
        txtBilletes10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtBilletes10.setForeground(new java.awt.Color(255, 0, 51));
        txtBilletes10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBilletes10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBilletes10ActionPerformed(evt);
            }
        });
        getContentPane().add(txtBilletes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 80, -1));

        txtBilletes5.setEditable(false);
        txtBilletes5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtBilletes5.setForeground(new java.awt.Color(255, 0, 51));
        txtBilletes5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBilletes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBilletes5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtBilletes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 80, -1));

        txtBilletes1.setEditable(false);
        txtBilletes1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtBilletes1.setForeground(new java.awt.Color(255, 0, 51));
        txtBilletes1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBilletes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBilletes1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtBilletes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 80, -1));

        txtBilletes20.setEditable(false);
        txtBilletes20.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtBilletes20.setForeground(new java.awt.Color(255, 0, 51));
        txtBilletes20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBilletes20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBilletes20ActionPerformed(evt);
            }
        });
        getContentPane().add(txtBilletes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtBilletes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBilletes10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBilletes10ActionPerformed

    private void txtBilletes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBilletes5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBilletes5ActionPerformed

    private void txtBilletes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBilletes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBilletes1ActionPerformed

    private void txtBilletes20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBilletes20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBilletes20ActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        try {
            String cantidads = txtCantidad.getText();
            int cantidadi = Integer.parseInt(cantidads);
            int b20, b10, b5, b1;
            int residuo20, residuo10, residuo5, residuo1;
            b20 = cantidadi / 20;
            residuo20 = cantidadi % 20;
            
            b10 = residuo20 / 10;
            residuo10 = residuo20 % 10;
            
            b5 = residuo10 / 5;
            residuo5 = residuo10 % 5;
            
            b1 = residuo5 / 1;
            residuo1 = residuo5 % 1;

            txtBilletes20.setText(b20 + "");
            txtBilletes10.setText(b10 + "");
            txtBilletes5.setText(b5 + "");
            txtBilletes1.setText(b1 + "");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMÉRICO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtCantidad.setText("");
        txtBilletes20.setText("");
        txtBilletes10.setText("");
        txtBilletes5.setText("");
        txtBilletes1.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1_17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB10;
    private javax.swing.JLabel lblB21;
    private javax.swing.JLabel lblB5;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JTextField txtBilletes1;
    private javax.swing.JTextField txtBilletes10;
    private javax.swing.JTextField txtBilletes20;
    private javax.swing.JTextField txtBilletes5;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}

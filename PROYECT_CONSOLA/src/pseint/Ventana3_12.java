
package pseint;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ventana3_12 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    public Ventana3_12() {
        initComponents();
        personalizarVentana();
        
        lstTablaMultiplicar.setModel(dlm);
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
        lblk = new javax.swing.JLabel();
        txtk = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTablaMultiplicar = new javax.swing.JList<>();
        jSeparator3 = new javax.swing.JSeparator();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(412, 440));
        setMinimumSize(new java.awt.Dimension(412, 440));
        setPreferredSize(new java.awt.Dimension(412, 440));
        setSize(new java.awt.Dimension(412, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTITULO.setBackground(new java.awt.Color(0, 0, 0));
        lblTITULO.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTITULO.setForeground(new java.awt.Color(255, 255, 255));
        lblTITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTITULO.setText("TABLA DE MULTIPLICAR");
        lblTITULO.setOpaque(true);
        getContentPane().add(lblTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 22));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 400, 10));

        lblk.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblk.setText("\"INGRESAR VALOR K NUMERO TABLA MULTIPLICAR?\"");
        getContentPane().add(lblk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 35));

        txtk.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtk.setForeground(new java.awt.Color(51, 51, 255));
        txtk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkActionPerformed(evt);
            }
        });
        getContentPane().add(txtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 71, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 400, 10));

        lstTablaMultiplicar.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lstTablaMultiplicar.setForeground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(lstTablaMultiplicar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, 160));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 412, -1));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
    txtk.setText("");
    dlm.clear();
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
      try {
      dlm.clear();
      String ks = txtk.getText();
      int ki =Integer.parseInt(ks);
      for(int i=1; i<=ki; i++){
          //System.out.println(i + "x" + ki + " = " + (i*ki));
          String texto = i + "x" + ki + " = " + (i*ki);
          dlm.addElement(texto);
      }
      }catch (Exception e){
           JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMÉRICO", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_cmdCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JLabel lblk;
    private javax.swing.JList<String> lstTablaMultiplicar;
    private javax.swing.JTextField txtk;
    // End of variables declaration//GEN-END:variables
}


package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;

public class VentanaBotonRadio extends javax.swing.JFrame {
    
    ButtonGroup estilo = new ButtonGroup();
    EventoRadioButton erb = new EventoRadioButton(); 
            
    public VentanaBotonRadio() {
        initComponents();
        estilo.add(rdo0);
        estilo.add(rdo1);
        estilo.add(rdo2);
        estilo.add(rdo3); 
        CrearFecha();
        rdo0.addActionListener(erb);
        rdo1.addActionListener(erb);
        rdo2.addActionListener(erb);
        rdo3.addActionListener(erb);
    }
    public void CrearFecha(){
        DateFormat formatear = DateFormat.getDateInstance(DateFormat.FULL);
        Date fecha = new Date();//RECUPERA LA FECHA DEL SISTEMA
        String s = formatear.format(fecha).toUpperCase();
        lblFecha.setText(s);
    }
    public void CambiarEstilo(int estilo){
            lblMensaje.setFont(new java.awt.Font("Cournier New", estilo, 24));
            this.repaint();
            }
    public class EventoRadioButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== rdo0) {
                CambiarEstilo(0);
            }
            if(e.getSource()== rdo1) {
                CambiarEstilo(1);
            }
            if(e.getSource()== rdo2) {
                CambiarEstilo(2);
            }
            if(e.getSource()== rdo3) {
                CambiarEstilo(3);
            }
           
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        rdo0 = new javax.swing.JRadioButton();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        rdo3 = new javax.swing.JRadioButton();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAMBIAR EL ESTILO DE LETRA DINÁMICAMENTE");
        lblTitulo.setOpaque(true);

        lblMensaje.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 51, 51));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("SOLO SE QUE NO SE NADA");

        rdo0.setText("Plain");

        rdo1.setText("Bold");

        rdo2.setText("Italic");

        rdo3.setText("Bold Italic");

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(51, 51, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rdo0)
                .addGap(46, 46, 46)
                .addComponent(rdo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdo2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(rdo3)
                .addGap(30, 30, 30))
            .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo0)
                    .addComponent(rdo2)
                    .addComponent(rdo1)
                    .addComponent(rdo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBotonRadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdo0;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    // End of variables declaration//GEN-END:variables
}

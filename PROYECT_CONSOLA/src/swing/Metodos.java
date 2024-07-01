
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Metodos {

   
 public static void personalizarVentana(JFrame vo){
     
        vo.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("cross1.png"))); // Pone una imagen icono al JFrame//Cambiar el icono de la ventana
        vo.setResizable(false);
        vo.setLocationRelativeTo(null);
        vo.setFont(new java.awt.Font("Cournier New", 2, 12));
        vo.setTitle("GUI SWING");
        vo.setSize(400,300);
        vo.setVisible(true);
        
     
 } 
  public static void personalizarJTextArea(JTextArea txaContenido, JScrollPane sp){
      
        txaContenido.setBackground(Color.WHITE);//color del fondo
        txaContenido.setFont(new Font("Courier New",Font.PLAIN,14));//fuente de letra
        txaContenido.setForeground(Color.BLUE);//color de letra
        
        sp.setViewportView(txaContenido);//permite escribir en el scrollpane --->permite poner un Scroll
        
    }

}


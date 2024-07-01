
package fecha;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class VentanaSalida extends JFrame {
    //VARIABLES DE INSTANCIA

    private static String String;
    Container contenedor = getContentPane();
    JTextArea txaContenido = new JTextArea();
    JScrollPane scrollpane = new JScrollPane();
    String titulo;
   
    //CONTRUCTORES
    public VentanaSalida(String titulo){
        this.titulo = titulo;
        personalizarVentana(); 
        personalizarTextArea();
        
    }
    public void personalizarTextArea(){
        txaContenido.setBackground(Color.WHITE);//color del fondo
        txaContenido.setFont(new Font("Courier New",Font.PLAIN,14));//fuente de letra
        txaContenido.setForeground(Color.BLUE);//color de letra
        scrollpane.setViewportView(txaContenido);//permite escribir en el scrollpane --->permite poner un Scroll
        
        contenedor.add(scrollpane);//Poner el scrollpane(txaContenido)
        
    }
    public void personalizarVentana(){
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        this.setTitle(this.titulo);//poner titulo
        this.setSize(350,200);//Poner un ancho y un alto de la ventana
        this.setResizable(false);//No se redimensione
        this.setLocationRelativeTo(null);//localizar en el centro
        this.setVisible(true);//Mostrar ventana
    }
    
    public JTextArea getTextArea(){
        return this.txaContenido;
        
    }
    
    public static void main(String[] args){
 
        VentanaSalida vs = new VentanaSalida("titulo");
    }
    
    
    
}

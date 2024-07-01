
package swing;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class VentanaImagen extends JFrame {
    //VARIABLES DE INSTANCIA
    Container contenedor = getContentPane();
    BufferedImage imagenes;
    JLabel lblImagen;
    String nombreFoto;
    
    //CONSTRUCTOR
    public VentanaImagen(String nombreFoto){
        this.nombreFoto = nombreFoto;
        personalizarVentana();
        personalizarImagen();
    
    }
    public void personalizarVentana(){
     
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("cross1.png"))); // Pone una imagen icono al JFrame//Cambiar el icono de la ventana
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setFont(new java.awt.Font("Cournier New", 2, 12));
        this.setTitle("GUI SWING");
        this.setSize(400,300);
        this.setVisible(true);

 }
    public void personalizarImagen(){
         try {
            //CONFIGURAR LA IMAGEN PARA LEERLA
            File f = new File("imagenes/" + nombreFoto);//poner nombre de la carpeta
            imagenes = ImageIO.read(f);
            Image escalarImagen = imagenes.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
            //COLOCA LA IMAGEN EN LA ETIQUETA
            lblImagen = new JLabel(new ImageIcon(escalarImagen));
            ///AÑADIR LA ETIQUETA AL CONTENEDOR
            contenedor.add(lblImagen); 
            //REVALIDAR Y REPINTAR EL CONTENEDOR
            contenedor.revalidate();
            contenedor.repaint();            
        } catch (IOException e) {

        }
        
    }
}


package misrc;

import circulo.Libreria;

public class Principal5 {

    public static void main(String[] args) {
       String texto = "en un pueblo italiano";
       //char charAt(int index)
       char letra = texto.charAt(0);
      //static String valueOf(int i)
       int entero = 1234;
       String cadena = String.valueOf(entero);
       char digito = cadena.charAt(3);
       
       double numero = 1343.355545544554;
       System.out.println(Libreria.redondear(numero));
       Libreria x = new Libreria();
       System.out.println(x.redondear1(numero));
       
    } 
    
}

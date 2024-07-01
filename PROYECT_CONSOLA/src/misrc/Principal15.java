
package misrc;

import java.util.Scanner;

public class Principal15 {

   
    public static void main(String[] args) {
        //programa conocer un nuemero entero
        Scanner sc = new Scanner(System.in);
        //declarar varibles
        int entero_numero;
        String entero_texto;//
        String patron = "[0-9]+";
        //Entrada
        System.out.println("Ingrese su edad ?");
        entero_texto = sc.next();
        if (entero_texto.matches(patron)){
           System.out.println("ES UN NUMERO ENTERO");
           entero_numero = Integer.parseInt(entero_texto);
           if (entero_numero >=18){
               System.out.println("ES MAYOR DE EDAD");
           }else {
               System.out.println("es menor de edad");
           }
        }else {
            System.out.println("NO ES UN NUMERO ENTERO");
        }
                
    }
    
}


package misrc;

import java.util.Scanner;


public class Principal17 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     //1.75 1.4 1.55 1.42 "[0-2]{1}\\.[0-9]{2}"
     //DECLARAR VARIABLES
     String estatura_texto;
     String patron = "[0-2]{1}\\.[0-9]{2}";
     //ENTRADA
     System.out.println("INGRESE SU ESTATURA ?");
     estatura_texto = sc.next();
     //VALIDAR ENTRADA
     if (estatura_texto.matches(patron)){
         System.out.println("ESTATURA CORRECTA");
     }else {
         System.out.println("ESTATURA NO VALIDA");
    }
   }
}

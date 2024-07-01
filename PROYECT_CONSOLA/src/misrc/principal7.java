
package misrc;

import java.util.Scanner;

 
public class principal7 {

    
    public static void main(String[] args) {
        
     //scanner es una clase, variable sc 
     //sc es una variable
     //next es un
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Ingrese un número real? ");
     String numero = sc.next();
     //Math es una clase 
     //pow es un método
     //
     double cuadrado = Math.pow(Double.parseDouble(numero),2);
     System.out.println("cuadrado: " + cuadrado);
     
     
     
     
     
     
    } 
}

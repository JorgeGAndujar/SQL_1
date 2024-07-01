
package misrc;

import java.util.Scanner;


public class Principal16 {

    public static void main(String[] args) {
             //programa conocer un nuemero entero
        Scanner sc = new Scanner(System.in);
        //declarar varibles
        int entero_numero;
        //Entrada
        System.out.println("Ingrese la edad? ");
        entero_numero = sc.nextInt();
        
           if (entero_numero >=18){
               System.out.println("ES MAYOR DE EDAD");
           }else {
               System.out.println("es menor de edad");
           }
        }
                
    }
   
    


package pseint;

import java.util.Scanner;

public class Principal_Ejemplo_1_3 {

   
    public static void main(String[] args) {
        versionPOO();
       
    }
    public static void versionEstructurada(){
        
         // DECLARAR VARIABLES
         int a ,b; 
         double r;
         // Crear un objeto Scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // ENTRADA
        System.out.print("INGRESAR a? ");
        a = sc.nextInt();
        
        System.out.print("INGRESAR b? ");
        b = sc.nextInt();
        //PROCESO
        r = Math.pow((a+b),2)/3;//Math.pow(a+b,2)/3
        //SALIDA
        System.out.printf("RESULTADO: %.2f",+r);
         
    }
     public static void versionPOO(){
       Ejemplo1_3 objeto = new Ejemplo1_3();
       objeto.entrada();
       objeto.imprimirResultado();
       
         
     }
    
}

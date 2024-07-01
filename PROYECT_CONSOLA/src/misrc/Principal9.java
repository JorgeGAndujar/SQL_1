
package misrc;

import java.util.Scanner;


public class Principal9 {
    
   

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("INGRESSE UNA NOTA ? ");
     double nota;
     nota = sc.nextDouble();
     if ( nota >= 5) {
        System.out.println("Aprobado");
     }else 
         System.out.println("Suspenso"); 
     
     
   
    //OPERAOR BINARIO 
     System.out.println("OPERADOR BINARIO 1");
     System.out.println((nota >= 5)? "APROBADO":"SUSPENSO" );
     System.out.println("OPERADOR BINARIO 2");
     String resultado = ((nota >= 5)? "APROBADO":"SUSPENSO");
     System.out.println("resultado");
     
      
    
     
    }
}
    

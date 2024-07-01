
package pseint;

import java.util.Scanner;

public class Minutos {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 . DECLARACIÓN DE VARIABLES
        int minutos;
        int dinero;
        System.out.println("Ingrese mintos?");
        minutos = sc.nextInt(); 
        //PROCESO
        if (minutos <= 5) {
            dinero = minutos *1;
        }else {
            dinero = minutos *2;}
        //SALIDA
        System.out.println("debe en euros: " + dinero );
       
        
        }
        
        
        
        
    }
    

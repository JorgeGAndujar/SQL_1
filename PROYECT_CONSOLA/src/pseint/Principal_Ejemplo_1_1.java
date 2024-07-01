
package pseint;

import java.util.Scanner;

public class Principal_Ejemplo_1_1 {

    public static void main(String[] args) {
        version1();
       
    }
    public static void versionEstructurada(){
         Scanner sc = new Scanner(System.in);
        //DECLARACION DE VARIABLES
        int b,h,a;
        //ENTRADA
        System.out.print("INGRESE BASE? ");
        b = sc.nextInt();
        System.out.print("INGRESE ALTURA? ");
        h = sc.nextInt();
        //PROCESO
        a = b*h/2;
        //SALIDA
        System.out.println("AREA: "+ a);
        
    }
    public static void version1(){
        
        Scanner sc = new Scanner(System.in);
        //ENTRADA
        
        System.out.print("INGRESE BASE "); 
        int b = sc.nextInt();
        System.out.print("INGRESE ALTURA ");
        int h = sc.nextInt();
        //PROCESO
        
        //SALIDA
        Ejemplo1_1 objeto = new Ejemplo1_1(b,h);
        System.out.println("AREA: " + objeto.area());
    }
}


package misrc;

import java.util.Scanner;


public class Principal13 {


    public static void main(String[] args) {
        //Grados Fahrenheit = (grados centígrados × 9/5) +32.
        Scanner sc = new Scanner(System.in);
        //1.DECLARAR VARIABLES
        double f, c;
        //2.ENTRADA
        System.out.println("INGRESE GRADOS Fahrenheit? ");
        f = sc.nextDouble();
        //3.PROCESO
        //c = (f * 32)*(5/9);//ERROR SEMÁNTICO 45 no 45.0
        c = (f * 32)*(5/9.0);
        c = (f * 32)* 5/9;
        //4.SALIDA
        System.out.println("Centigrados: " + c);
        
    }
    
}

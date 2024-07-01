
package misrc;

import java.util.Scanner;

public class Principal14 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //declarar variables
      double s,r;
      //entrada
      System.out.println("INGRESE GRADOS SEXAGESIMALES ? ");
      s = sc.nextDouble();
      //PROCESO
      r = s * Math.PI/180;
      //r = Math.toRadrians(s)
      //SALIDA
      System.out.println("Radianes: "+ r);
      
      
    }
    
}

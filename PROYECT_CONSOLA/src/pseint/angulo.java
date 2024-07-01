
package pseint;

import static java.lang.Math.PI;
import java.util.Scanner;

public class angulo {

   
    public static void main(String[] args) {
    //DEFINIR VARIABLES
    Scanner s = new Scanner(System.in);
    System.out.println("INGRESE UN ÁNGULO SEXADECIMAL ?");
    double anguloEnGrados = s.nextDouble();
        //PROCCESO
      double radianes = Math.toRadians(anguloEnGrados);
        
      System.out.println(anguloEnGrados + " grados son " + radianes + " radianes");
      }
}

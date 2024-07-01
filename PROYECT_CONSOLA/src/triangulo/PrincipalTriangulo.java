
package triangulo;

import java.util.Scanner;

public class PrincipalTriangulo {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //DECLARACION DE VARIABLES
        double base, altura;
        //ENTRADA
        System.out.println("Ingrese base?");
        base = sc.nextDouble();
        System.out.println("Ingrese altura?");
        altura = sc.nextDouble();
        
        //CREA UN OBJETO
        //Scanner    sc    = new Scanner(System.in);
        Triang triangulo = new Triang(base,altura);
        Triang triangulo1 = new Triang();
        System.out.println(triangulo);
        triangulo1.setBase(8);
        triangulo1.setAltura(6);
        System.out.println(triangulo.area());
        System.out.println(triangulo1.area());
      
    }
    
}

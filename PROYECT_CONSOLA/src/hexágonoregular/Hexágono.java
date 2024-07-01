
package hexágonoregular;

import circulo.Libreria;
import java.util.Scanner;

public class Hexágono {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // 1 . DECLARACIÓN DE VARIABLES
        double altura,lado, perimetro;
        //2. ENTRADA
        System.out.println("Ingrese altura?");
        altura= sc.nextDouble();
        System.out.println("Ingrese lado?");
        
        lado= sc.nextDouble();
                
        //3.proceso
        perimetro = lado * 6;
        double area = perimetro * altura;
        //4. SALIDA
        System.out.println("Area: " + Libreria.redondear(area));
        
    }
    
}

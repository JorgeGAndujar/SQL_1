
package triangulo;


import circulo.Libreria;
import java.util.Scanner; 

public class triangulo {
    


    public static void main(String[] args) {
   
        
        Scanner sc = new Scanner(System.in);
        //DECLARACION DE VARIABLES
        double area, base, altura;
        //ENTRADA
        System.out.println("Ingrese base?");
        base = sc.nextDouble();
        System.out.println("Ingrese altura?");
        altura = sc.nextDouble();
        //PROCESO
        area = (base * altura)/2;
        //SALIDA
        System.out.println("Area: " + Libreria.redondear(area));
        
      
        
        
                
    }
    
    
}

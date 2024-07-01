
package pseint;

import java.util.Scanner;

public class Ejemplo1_3 {
    //VARIABLES DE INSTANCIA(ATRIBUTOS)
    int a,b;
    //CONSTRUCTORES

    public Ejemplo1_3() {
        this.a = 0;
        this.b = 0;
        
    }

    public Ejemplo1_3(int a, int b) {
        this.a = a;
        this.b = b;
      
    }
    ////METODOS SET Y GET

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    //METODOS TOSTRING

    @Override
    public String toString() {
        return "Ejemplo1_3{" + "a=" + a + ", b=" + b + '}';
    }

    //METODOS OTROS
    public double resolver(){
        return Math.pow((a+b),2)/3;
    }
    public void imprimirResultado(){
        System.out.printf("%.2f", resolver());
    }
    public void entrada(){
        a = Entrada.leerInteger("INGRESE A?");
        b = Entrada.leerInteger("INGRESAR B?");
    
    }
        
    
    
}

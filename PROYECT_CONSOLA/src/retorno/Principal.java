package retorno;

import Calculadora.Calculadora1;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("BLOQUE 1");
        {
            int[] vector = retornarVector1();
            for (int numero : vector) {
                System.out.println(numero);
            }
        }
        System.out.println("BLOQUE 2");
        {
            int[] vector = {4, 5, 6};
            System.out.println(Arrays.toString(vector));
        }
        System.out.println("BLOQUE 3");
        {
            String[] vector = retornarVector2();
            System.out.println(Arrays.toString(vector));
            for(String texto: vector) { //foreach, recorrer por elemento
               System.out.println(texto + " " + texto.length() + " " + texto.toUpperCase());
            }
        }
        System.out.println("BLOQUE 4");
        {
              Calculadora1 c = retornoObjeto1();
              c.setNumero1(5);
              c.setNumero2(6);
              c.setOperador("+");
              Calculadora1.cabecera();
              c.cuerpo();
              
              Calculadora1 c1 = retornoObjeto2();
              Calculadora1.cabecera();
              c.cuerpo();
              
        }
         System.out.println("BLOQUE 4");
         {
            System.out.println("Ingrese un entero? ");
            int numero = getEntero(); //sc.nextInt();
            System.out.println("Ingreso " + numero);
         }

        /*
        //TIPOS DE DATOS PRIMITIVOS
        int          int x = 5; //Valor
        double       double y = 1.3; //Valor
        String       String z = "Hola"; //Objeto
        boolean      
        
        //TIPOS DE DATOS OBJETOS
        Calculadora
        Triangulo
        int[]
         */
    }

    public static int[] retornarVector1() {
        int[] vector = {1, 3, 5};
        return vector;
    }
    
    public static String[] retornarVector2() {
        String[] vector = {"Luis","Miguel"};
        return vector;
    }

    public static Calculadora1 retornoObjeto1() {
        return new Calculadora1();
    }  
    
    public static Calculadora1 retornoObjeto2() {
        Calculadora1 c = new Calculadora1(8,9,"*");
        return c;
    } 
    
    public static int retornoValor1() {
        return 5;
    }
    
    public static int retornoValor2() {
        int numero = 5;
        return numero;
    } 
    
    public static int getEntero() {
        Scanner sc = new Scanner(System.in);
        int entero = sc.nextInt();
        return entero;
    }

}
    

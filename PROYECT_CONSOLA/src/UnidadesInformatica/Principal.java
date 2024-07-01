
package UnidadesInformatica;

import java.util.Scanner;


public class Principal {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1DECLARAR VARIABLES
        double cantidad;
        int opcioni, opcionf,saltos;
        double base = 1024;
        int[] posiciones = new int[9];
        
        System.out.println("*(1) BYTE");
        System.out.println("*(2)KILO BYTE");
        System.out.println("*(3)MEGA BYTE");
        System.out.println("*(4)GYGA BYTE");
        System.out.println("*(5)TERA BYTE");
        System.out.println("*(6)PENTA BYTE");
        System.out.println("*(7)EXA BYTE");
        System.out.println("*(8)ZETTA BYTE");
        System.out.println("*(9)YOTA BYTE");
        
        
        System.out.println("INGRESE UNIDAD DE PARTIDA? ");
        opcioni = sc.nextInt();
        System.out.println("INGRESE UNIDAD DE LLEGADA? ");
        opcionf = sc.nextInt();
        System.out.println("Ingrese la cantidad? ");
        cantidad = sc.nextInt();
        
        //PROCESO
        opcioni = opcioni - 1;
        opcionf = opcionf - 1;
        saltos = opcionf - opcioni;//POSITIVO DIVIDIR Y NEGATIVO MULTIPLICAR
        for (int i = 0; i<Math.abs(saltos);i++){
            
            if(saltos > 0){
             cantidad = cantidad / base;
            }else {
             cantidad = cantidad * base;
        }
        //SALIDA
         System.out.println("RESULTADO "+ cantidad);
    }
    
    }
}

          
 

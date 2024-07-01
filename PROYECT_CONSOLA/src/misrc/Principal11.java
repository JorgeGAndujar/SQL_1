
package misrc;

import java.util.Scanner;


public class Principal11 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //DECLARACIÓN DE VARIABLES
      double nota = 0.0;
      String evaluar;
      //ENTRADA
      System.out.println("INGRESE LA NOTA ?");
      nota = sc.nextDouble();
      //PROCESO
     if (nota >= 0 && nota < 5){
      evaluar = "suspenso";
     }else if (nota >= 5 && nota < 5){
       evaluar = "suficiente" ;
     }else if (nota >= 6 && nota < 7){
       evaluar = "bien" ;
     }else if (nota >= 8 && nota < 9){
         evaluar = "notable" ;
     }else if (nota >= 9 && nota < 10){
       evaluar = "sobresaliente" ;
       }else { 
       evaluar = "nota no valida";
        }
     //SALIDA
         System.out.println("nota= " + evaluar);
      }
    }

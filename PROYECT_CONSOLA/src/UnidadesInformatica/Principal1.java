
package UnidadesInformatica;

import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //DECLARAR VARIABLES
         int ci;
         int cf;
         int[] unidadesx = {0,0,0,0,0,0,0,0,0};
         String[] unidades = {"BYTE", "KILO BYTE", "MEGA BYTE", "GIGA BYTE", "TERA BYTE", "PETA BYTE", "EXA BYTE", "ZETA BYTE", "YOTTA BYTE"};
         double valor = 0;
         double c1 = valor/Math.pow(2,10);
         double c2 = valor/Math.pow(2,20);
         double c3 = valor/Math.pow(2,30);
         double c4 = valor/Math.pow(2,40);
         double c5 = valor/Math.pow(2,50);
         double c6 = valor/Math.pow(2,60);
         double c7 = valor/Math.pow(2,70);
         double c8 = valor/Math.pow(2,80);
         double c9 = valor/Math.pow(2,90);
        
         
         System.out.println("ingrese un numero inicial? ");
         ci = sc.nextInt();
         System.out.println("ingrese un numero final? ");
         cf = sc.nextInt();
         
        //PROCESO
        if(ci==1){
            c1 = valor;
            c2 = valor/Math.pow(2,10);
            c3 = valor/Math.pow(2,20);
            c4 = valor/Math.pow(2,30);
            c5 = valor/Math.pow(2,40);
            c6 = valor/Math.pow(2,50);
            c7 = valor/Math.pow(2,60);
            c8 = valor/Math.pow(2,70);
            c9 = valor/Math.pow(2,80);
           
        }else if(ci==2){
            c1 = valor*Math.pow(2,10);
            c2 = valor;
            c3 = valor/Math.pow(2,20);
            c4 = valor/Math.pow(2,30);
            c5 = valor/Math.pow(2,40);
            c6 = valor/Math.pow(2,50);
            c7 = valor/Math.pow(2,60);
            c8 = valor/Math.pow(2,70);
            c9 = valor/Math.pow(2,80);
        }else if(ci==3){
            c1 = valor*Math.pow(2,20);
            c2 = valor*Math.pow(2,10);
            c3 = valor;
            c4 = valor/Math.pow(2,10);
            c5 = valor/Math.pow(2,20);
            c6 = valor/Math.pow(2,30);
            c7 = valor/Math.pow(2,40);
            c8 = valor/Math.pow(2,50);
            c9 = valor/Math.pow(2,60);
        }else if(ci==4){
            c1 = valor*Math.pow(2,30);
            c2 = valor*Math.pow(2,20);
            c3 = valor*Math.pow(2,10);
            c4 = valor;
            c5 = valor/Math.pow(2,10);
            c6 = valor/Math.pow(2,20);
            c7 = valor/Math.pow(2,30);
            c8 = valor/Math.pow(2,40);
            c9 = valor/Math.pow(2,50);
        }else if(ci==5){
            c1 = valor*Math.pow(2,40);
            c2 = valor*Math.pow(2,30);
            c3 = valor*Math.pow(2,20);
            c4 = valor*Math.pow(2,10);
            c5 = valor;
            c6 = valor/Math.pow(2,10);
            c7 = valor/Math.pow(2,20);
            c8 = valor/Math.pow(2,30);
            c9 = valor/Math.pow(2,40);
        }else if(ci==6){
            c1 = valor*Math.pow(2,50);
            c2 = valor*Math.pow(2,40);
            c3 = valor*Math.pow(2,30);
            c4 = valor*Math.pow(2,20);
            c5 = valor*Math.pow(2,10);
            c6 = valor;
            c7 = valor/Math.pow(2,10);
            c8 = valor/Math.pow(2,20);
            c9 = valor/Math.pow(2,30);
        }else if(ci==7){
            c1 = valor*Math.pow(2,60);
            c2 = valor*Math.pow(2,50);
            c3 = valor*Math.pow(2,40);
            c4 = valor*Math.pow(2,30);
            c5 = valor*Math.pow(2,20);
            c6 = valor*Math.pow(2,10);
            c7 = valor;
            c8 = valor/Math.pow(2,10);
            c9 = valor/Math.pow(2,20);
        }else if(ci==8){
            c1 = valor*Math.pow(2,70);
            c2 = valor*Math.pow(2,60);
            c3 = valor*Math.pow(2,50);
            c4 = valor*Math.pow(2,40);
            c5 = valor*Math.pow(2,30);
            c6 = valor*Math.pow(2,20);
            c7 = valor*Math.pow(2,10);
            c8 = valor;
            c9 = valor/Math.pow(2,10);
        }else if(ci==9){
            c1 = valor*Math.pow(2,80);
            c2 = valor*Math.pow(2,70);
            c3 = valor*Math.pow(2,60);
            c4 = valor*Math.pow(2,50);
            c5 = valor*Math.pow(2,40);
            c6 = valor*Math.pow(2,30);
            c7 = valor*Math.pow(2,20);
            c8 = valor*Math.pow(2,10);
            c9 = valor;
        
    }
        
        
        
        
        System.out.println("c1= "+ c1);
        System.out.println("c2= "+ c2);
        System.out.println("c3= "+ c3);
        System.out.println("c4= "+ c4);
        System.out.println("c5= "+ c5);
        System.out.println("c6= "+ c6);
        System.out.println("c7= "+ c7);
        System.out.println("c8= "+ c8);
        System.out.println("c9= "+ c9);
        

        
    }



          

}

           
         

       
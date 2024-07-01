
package pseint;

import java.util.Scanner;


public class Principal_Ejemplo_1_4 {

    
    public static void main(String[] args) {
        Version1();
       
    }
     public static void VersionEstructurada(){
    // DECLARAR VARIABLES
        double c1,c2,c3,c4,c5,media;
        String codigo = "";
        // Crear un objeto Scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // ENTRADA
        System.out.print("INGRESAR c1? ");
        c1 = sc.nextDouble();
        
        System.out.print("INGRESAR c2? ");
        c2 = sc.nextDouble();
        
        System.out.print("INGRESAR c3? ");
        c3 = sc.nextDouble();
        
        System.out.print("INGRESAR c4? ");
        c4 = sc.nextDouble();
        
        System.out.print("INGRESAR c5? ");
        c5 = sc.nextDouble();
        
        //PROCESO
        media = (c1+c2+c3+c4+c5)/5;
        //SALIDA
        System.out.println("ALUMNO: " + codigo);
        System.out.println("MEDIA: "+media);
        System.out.printf("REDONDEADO: %.0f", media);
        //System.out.printf("codigo: %3s\nMEDIA:  %.0f", media...);
     }  
      public static void Version1(){
        Ejemplo1_4 objeto = new Ejemplo1_4();
        objeto.entrada();
        Ejemplo1_4.cabecera();//clase o instancia static=te permite llamarlo desde objeto
        objeto.cuerpo();
         
      }
    
}

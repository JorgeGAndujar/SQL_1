
package pseint;
import java.util.Scanner;

public class Principal_Ejemplo_1_5 {

    public static void main(String[] args) {
        versionPOO2();
     
    }
    public static void versionEstructurada(){
           Scanner sc = new Scanner(System.in);
        //VARIABLES
	int num, cua, cub;
	//ENTRADA
	System.out.print("ingresar numero? ");
        num = sc.nextInt();
	//PROCESO 
	cua = (int) Math.pow(num, 2);
	cub = (int) Math.pow(num, 3);
	//SALIDA
        System.out.println("RESULTADO AL CUADRADO: "+cua);
        System.out.println("RESULTADO AL CUBO: "+cub);
        
    }
    
    public static void versionPOO(){
     Ejemplo1_5 Objeto = new Ejemplo1_5((int)(Math.random()*10+1));
     System.out.println("NUMERO: " + Objeto.getNum());
     System.out.println("CUADRADO: "+ Objeto.cuadrado());
     System.out.println("CUBO: "+ Objeto.cubo());
    }
    public static void versionPOO2(){
        Scanner sc = new Scanner(System.in);
        //ENTRADA
        System.out.print("INGRESAR NUMERO? ");
        int num = sc.nextInt();
        Ejemplo1_5 Objeto = new Ejemplo1_5(num);
        //SALIDA
     
     System.out.println("NUMERO: "+ Objeto.getNum());
     System.out.println("CUADRADO: "+ Objeto.cuadrado());
     System.out.println("CUBO: "+ Objeto.cubo());
    }
    
}


import java.util.Scanner;


public class Principal_Ejemplo_1_2 {
    public static void main(String[] args) {
        version1();
}
    public static void VersionEstructurada(){
    // DECLARAR VARIABLES
        int a, b, c, d;
        
        // Crear un objeto Scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // ENTRADA
        System.out.print("INGRESAR a? ");
        a = sc.nextInt();
        
        System.out.print("INGRESAR b? ");
        b = sc.nextInt();
        
        System.out.print("INGRESAR c? ");
        c = sc.nextInt();
        
        System.out.print("INGRESAR d? ");
        d = sc.nextInt();
        // PROCESO
        // No hay procesamiento en este caso
        
        // SALIDA
        System.out.println(d + " " + c + " " + b + " " + a);
    }
    public static void version1(){
        Scanner sc = new Scanner(System.in);
        //ENTRADA
        
        System.out.print("INGRESE A "); 
        int a = sc.nextInt();
        System.out.print("INGRESE B ");
        int b = sc.nextInt();
        System.out.print("INGRESE C "); 
        int c = sc.nextInt();
        System.out.print("INGRESE D ");
        int d = sc.nextInt();
        
        //PROCESO
        //SALIDA
        System.out.println(d + " " + c + " " + b + " " + a);
    }
     

}
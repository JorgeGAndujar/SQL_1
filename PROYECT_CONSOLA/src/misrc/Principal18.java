package misrc;
import java.util.Scanner;
public class Principal18 {

    public static void main(String[] args) {
        //Validar nombre - Mihai Matei   "[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+"
        Scanner scan = new Scanner(System.in);
        
        //1. Variable startup
        String nombre;
        String patron = "[A-ZÉÍÓÚÁ]{1}[a-zéíóúá]+\\s[A-ZÉÍÓÚÁ]{1}[a-zéíóúá]+";
        
        //2. Entry
        System.out.print("Ingrese su nombre: ");
        nombre = scan.nextLine();
        
        //3. Validate entry
        if(nombre.matches(patron)) {
            System.out.println("Nombre: " + nombre);
        }else {
            System.out.println("N/A " + nombre);
        }
    }
} 
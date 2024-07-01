
package misrc;

import java.util.Scanner;

public class configuracion {

    public static void main(String[] args) {
        String nombre = "jorge González andújar";
        System.out.println("Jorge G Andújar");
        //Validar nombre - Mihai Matei   "[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+"
        Scanner scan = new Scanner(System.in);
        
        //1. Variable startup
        String patron = "[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+";
        
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
    
    

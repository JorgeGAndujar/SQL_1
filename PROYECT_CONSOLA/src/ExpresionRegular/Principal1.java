
package ExpresionRegular;

import java.util.Scanner;

public class Principal1 {

    
    public static void main(String[] args) {
        //RECONOCER UN TIPO BOLINIANO
        Scanner sc = new Scanner(System.in);
        //1.DECLARACIÓN DE VARIABLE
        String logico_texto;
        boolean logico, correcto;
        String patron = "(true|false|TRUE|FALSE)";
        do{
        //2.ENTRADA
        System.out.println("Diga si es casado true/false? ");
        logico_texto = sc.next();
        //3.PROCESO
        correcto = logico_texto.matches(patron);
        if(correcto){
            System.out.println("VALOR LÓGICO CORRECTO");
           // logico = Boolean.parseBoolean(logico_texto);
        }else {
            System.out.println("VALOR LÓGICO INCORRECTO");
        }
    
        }while(!correcto);
    }
    
}

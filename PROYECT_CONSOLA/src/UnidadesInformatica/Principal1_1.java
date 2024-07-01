
package UnidadesInformatica;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Principal1_1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DECLARACION DE LA VARIABLE
        int opcioni,opcionf,saltos;
        String[] unidades = {"BYTE", "KILO BYTE", "MEGA BYTE", "GIGA BYTE", "TERA BYTE", "PETA BYTE", "EXA BYTE", "ZETA BYTE", "YOTTA BYTE"};;
        int[] unidadesx = {0,0,0,0,0,0,0,0,0};
        double cantidad =0.0;
         //ENTRADA
        System.out.println("*(1) BYTE");
        System.out.println("*(2)KILO BYTE");
        System.out.println("*(3)MEGA BYTE");
        System.out.println("*(4)GYGA BYTE");
        System.out.println("*(5)TERA BYTE");
        System.out.println("*(6)PENTA BYTE");
        System.out.println("*(7)EXA BYTE");
        System.out.println("*(8)ZETTA BYTE");
        System.out.println("*(9)YOTA BYTE");
        
        
        System.out.println("(a)Ingresa unidad de partida?");
        opcioni = sc.nextInt();
        System.out.println("(b)Ingresa unidad de llegada?");
        opcionf = sc.nextInt();
        
        System.out.println("(c)Ingresa cantidad en "+ unidades[opcioni-1]+ "?");
        cantidad = sc.nextInt();
        
        
        
         //3. PROCESO 
         
        saltos = opcionf - opcioni;
        if(saltos>0){
            cantidad /= Math.pow(2,(Math.abs(saltos)*10));
        }else {
            cantidad *= Math.pow(2,(Math.abs(saltos)*10));
        }
        //CREAR UN FORMARO PARA MOSTRAR EL NÚMERO CON 10 DECIMALES
        DecimalFormat df = new DecimalFormat("0.00000000000000000000");
        //FORMATEAR EL NUMERO
        String numeroFormateado = df.format(cantidad);
        
        //4.SALIDA
        System.out.println("RESUMEN: " + numeroFormateado + "  "+ unidades[opcionf-1]);
        
        
    }
}        
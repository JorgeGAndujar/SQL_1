
package misrc;

import java.util.Scanner;


public class Principal12 {

    public static void main(String[] args) {
        //ESTRUCTURA DE CONDICIÓNAL MULTIPLE
        Scanner sc = new Scanner(System.in);
        //DECLARAR VARALBLES
        int num, v, val;
        System.out.println( "ingrese valor entero ? ");
        num = sc.nextInt();
        System.out.println( "ingrese valor v? ");
        v = sc.nextInt();
        //PROCESO
        switch (num) {
            case 1: val = 100 * v;break;
            case 2: val =(int)Math.pow(100, v);break;
            case 3: val = 100 / v;break;
            default: val = 0;
        }
        System.out.println("Val: "+ val);
         }
}

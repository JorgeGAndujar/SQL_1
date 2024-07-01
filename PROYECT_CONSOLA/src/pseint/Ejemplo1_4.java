
package pseint;

import java.util.Scanner;


public class Ejemplo1_4 {
   //VARIABLES DE INSTANCIA
    private double c1,c2,c3,c4,c5;
    private String codigo;
   //CONTRUCTORES

    public Ejemplo1_4() {
        this.c1 = 0;
        this.c2 = 0;
        this.c3 = 0;
        this.c4 = 0;
        this.c5 = 0;
        this.codigo = "";
    }

    public Ejemplo1_4(double c1, double c2, double c3, double c4, double c5, String codigo) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.codigo=codigo;
    }
    //METODOS GET Y SET

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public double getC4() {
        return c4;
    }

    public void setC4(double c4) {
        this.c4 = c4;
    }

    public double getC5() {
        return c5;
    }

    public void setC5(double c5) {
        this.c5 = c5;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //METODO TOSTRING
    @Override    
    public String toString() {
       return "Ejemplo1_4{" + "c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + ", c4=" + c4 + ", c5=" + c5 + ", codigo=" + codigo + '}';
    }

    //OTROS METODOS
    public double media() {
        double media =(c1+c2+c3+c4+c5)/5;
        return media;
    }
    
    public static void cabecera(){
        System.out.printf("%6s %8s %10s\n","CODIGO","MEDIA","REDONDEADO");
        System.out.printf("%6s %8s %10s\n","------","-----","----------");
  
    }
    public void cuerpo(){
        System.out.printf("%6s %8.2f %10.0f\n",codigo,media(),media());
    }
    public void entrada(){
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESAR CODIGO? ");
        codigo = sc.nextLine();
        
        c1 = Entrada.leerDouble("INGRESAR c1? ");
        
        c2 = Entrada.leerDouble("INGRESAR c2? ");
        
        c3 = Entrada.leerDouble("INGRESAR c3? ");
        
        c4 = Entrada.leerDouble("INGRESAR c4? ");
        
        c5 = Entrada.leerDouble("INGRESAR c5? ");
    }
    
}   

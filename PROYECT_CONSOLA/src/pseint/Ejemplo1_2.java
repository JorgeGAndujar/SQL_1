
package pseint;

public class Ejemplo1_2 {
    //VARIABLES DE ESTANCIA(ATRIBUTOS)
    int a,b,c,d;
    //CONSTRUCTORES

    public Ejemplo1_2() {
        this.a = 0 ;
        this.b = 0 ;
        this.c = 0 ;
        this.d = 0 ;
    }

    public Ejemplo1_2(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    //METODOS SET Y GET

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
     //METODO TOSTRING

    @Override
    public String toString() {
        return "Ejemplo1_2{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
    }
    //METODOS OTROS
    public int DelRevés(){
        System.out.println(d + " " + c + " " + b + " " + a);
        return 0;
        
        
    }
    
    
}

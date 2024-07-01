
package pseint;

public class Ejemplo1_1 {
    //Variables de instancias(ATRIBUTOS)
    private int b,a,h;
    //CONTRUCTORES
    public Ejemplo1_1() {
        this.b = 0;
        this.h = 0;
        
    }
    public Ejemplo1_1(int b, int h) {
        this.b = b;
        this.h = h;
    }
    //METODOS SET Y GET

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
   
    //METODO TOSTRING
    @Override
    public String toString() {
        return "Ejemplo1_1{" + "b=" + b + ", a=" + a + ", h=" + h + '}';
    }
   
    //METODOS OTROS
    public int area(){
       a = b*h/2;
       return a;
    }
  
    
}

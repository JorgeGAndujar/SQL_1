
package pseint;

public class Ejemplo1_5 {
    //Variables de instancias(ATRIBUTOS)
    private int num;
    //CONTRUCTORES

    public Ejemplo1_5() {
        this.num = 0;
    }

    public Ejemplo1_5(int num) {
        this.num = num;
    }
    
    //METODOS SET Y GET

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    //METODO TOSTRING

    @Override
    public String toString() {
        return "Ejemplo1_5{" + "num=" + num + '}';
    }
    
    //METODOS OTROS
    
    public int cuadrado(){
        return (int)Math.pow(num, 2);
    }
    public int cubo(){
        return (int)Math.pow(num, 3);
    }
    
    
    
}

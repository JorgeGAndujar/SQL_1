
package Calculadora;

public class Calculadora1 {
     //ATRIBUTO DE INSTANCIA
    private double numero1;
    private double numero2;
    private String operador;
    
    
    //CONSTRUCTORES
    
    
    public Calculadora1() {
      this.numero1 = 0.0;
      this.numero2 = 0.0;
      this.operador = "";
         
    }

    public Calculadora1(double numero1, double numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }

   
    //get and sett

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    

    // to string

    @Override
    public String toString() {
        return "Calculadora1{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", operador=" + operador + '}';
    }
    //METODOS OTROS
    
    public double calculo(){
        double resultado = 0.0;
        
        switch(operador) {
            case "+": resultado = numero1 + numero2; break; 
            case "-": resultado = numero1 - numero2; break; 
            case "*": resultado = numero1 * numero2; break; 
            case "/": resultado = numero1 / numero2; break; 
            case "#": resultado = Math.pow(numero1, numero2); break; 
        }
       return resultado;
    
        }
    
     public static void cabecera (){
          System.out.printf("%4s %10s %8s %8s %8s\n","N","OPERADOR","NUMERO1","NUMERO2","RESUTADO");
          System.out.printf("%4s %10s %8s %8s %8s\n","-","--------","-------","-------","--------");
     }
     public void cuerpo(int i){
         System.out.printf("%4s %10s %8s %8s %8s\n",i,operador,numero1,numero2,calculo());
         
     }

    public void cuerpo() {
        System.out.printf("%10s %8.2f %8.2f %8.2f\n", operador, numero1, numero2, calculo());
    }
}
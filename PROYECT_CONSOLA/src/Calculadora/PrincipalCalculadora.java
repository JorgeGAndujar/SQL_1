
package Calculadora;


public class PrincipalCalculadora {

    
    public static void main(String[] args) {
        version1(); 
    }
    
    public static void version1(){
       Calculadora1.cabecera();
       for(int i=0; i <100 ; i++){
           double numero1 = aleatorio();
           double numero2 = aleatorio();
           String operador = operadorAleatorio();
          Calculadora1 c = new Calculadora1(numero1,numero2,operador);
          c.cuerpo((i+1));
          
       }
    }
    public static double aleatorio(){
        int parteEntera = (int)(Math.random()*100+1); 
        int parteDecimal = (int)(Math.random()*90+10);
        double numeroReal = Double.parseDouble(parteEntera + "." + parteDecimal);
        return numeroReal;
        
    } 
    public static String operadorAleatorio(){
        String[] operador = {"+","-","/","*","#"};
        int a = (int)(Math.random()*5);
        return operador[a];
    }
        
 }


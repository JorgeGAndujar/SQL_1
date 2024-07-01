
package triangulo;


public class Triang {
    // 1. ATRIBUTOS----->variables
    private double base;
    private double altura; 
    
    //2. CONSTRUCTORES (VALORES A LOS ATRIBUTOS)--->mismo q la clase(método)--->INSER CODE CONSTRUCTOR
     public Triang() {
        this.base = 0.0;
        this.altura = 0.0;
     }
      public Triang(double base, double altura) {
        this.base = base;
        this.altura = altura;
     }
    
    //3. METODOS SET Y GET----->gestionar los valores de los atributos--->permite editarlos INSER CODE(getter,setter)
      public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //4.TOSTRING ( MOSTRAR LOS VALORES DE LOS ATRIBUTOS)----->INSER CODE---->TOSTRING...
     @Override//SOBREESCRIBIR
    public String toString() {
        return "Triang{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //5.METODOS CALCULOS/ PROCESAR LOS ATRIBUTOS----->proceso
        
     
         public double area(){//METODO DE INSTANCIA O OBJETO
         return this.base * this.altura / 2;
    }
     
         public static void cabecera(){//MÉTODO DE CLASE
             System.out.printf("%5s  %6s  %6s  %15s\n","N","BASE","ALTURA","AREA");
             System.out.printf("%5s  %6s  %6s  %15s\n","-","----","------","----");
         }

         public void cuerpo(int i){
             System.out.printf("%5d  %6s  %6s  %15s\n",i,base,altura,area());
         }

    

   
    }

   
    


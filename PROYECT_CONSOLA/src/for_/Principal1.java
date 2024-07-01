
package for_;

public class Principal1 {

    
    public static void main(String[] args) {
       System.out.println("SERIES: 0.01,0.02,0.03,0.04....1.0");
       int c = 0;
       for(float i=0.01f; i<=1.0f; i= redondear1(i + 0.01f)){
           System.out.print(i + "\t");
           c++;
           if(c == 10){ 
                System.out.println();
                c = 0;
            }
            
    }
       System.out.println();
            System.out.println("RECORRER CADENA: EN UN PUERTO ITALIANO");
            String texto = "EN UN PUERTO ITALIANO";
            int longitud = texto.length();
            for(int i = 0; i<longitud; i++) {
                System.out.print(texto.charAt(i) + "");
            }
            System.out.println("CANTIDAD DE VOCALES");
            String patron = "[AEIOU]";
            int cvocal = 0;
            for(int i = 0; i<longitud; i++) {
             // String letra = texto.charAt(i)+ "";
             // if(letra.matches(patron)){
             if(String.valueOf(texto.charAt(i)).matches(patron)){
                  cvocal++;
              }
            
             }
            System.out.println("Cantidad de vocales: " + cvocal);
            
    
   }
    
    //public static float redondear(float numero) {
       // return (float)(Math.round(numero* 100.0) / 100.0);}
    
    public static float redondear1(float numero){  
        return (float)(Math.round(numero* 100.000) / 100.000);
    }
     
   
      
    
}


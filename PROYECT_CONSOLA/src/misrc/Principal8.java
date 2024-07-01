
package misrc;


public class Principal8 {

    
    public static void main(String[] args) {
       //LAS CINCO NOTAS DE UN ALUMNO
       double n1 = 8.7;
       double n2 = 7.7;
       double n3 = 4.7;
       double n4 = 6.7;
       double n5 = 5.7;
       
       double[] nota = {8.7, 7.7, 4.7, 6.7, 5.7};
       System.out.println("Nota 1: "+ nota[0]);
       
       try {
       System.out.println("Nota 6: "+ nota[5]);
       }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("INDICE 5 NO EXISTE");
         
       //EJEMPLO 2 RECORRER UN ARRAY PROMEDIO
         double suma = 0.0;
         for(int i = 0; i<nota.length; i++){
             suma = suma + nota[i];  
           }
         System.out.println("Promedio: "+ nota.length);
         
         suma = 0;
         for( double n: nota){//foreach = for
             suma = suma + n;
         }
         System.out.println("Promedio: " + suma/nota.length);
       
         suma = nota[1] + nota[2] + nota[3] + nota[4] + nota[5];
         System.out.println("Promedio: " + suma/nota.length);
       }
    }
       }
   
       
   
    



package for_;


public class Principal2 {

    public static void main(String[] args) {
       int[] entero = {3,2,1,4};
       //RECORRER UN VECTOR POR INDICE
       for(int i = 0; i<entero.length; i++)
           System.out.println(i  + "\t" + entero[i]);
       
    
        Object[] datos = {"Luis",23,1.72,true,'H'};
        for(int i = 0; i<datos.length; i++){
           System.out.println(i  + "\t" + datos[i]);
        }
        
    }
}

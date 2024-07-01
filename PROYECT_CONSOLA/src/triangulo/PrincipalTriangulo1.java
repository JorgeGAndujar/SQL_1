
package triangulo;

public class PrincipalTriangulo1 {

    public static void main(String[] args) {
        //{1,10000} Math.random()*10000+1)
        Triang.cabecera();
        for(int i = 0; i<1000; i++){
            Triang t = new Triang((int)(Math.random()*10000+1),
                                  (int)(Math.random()*10000+1));
        t.cuerpo(i+1);
        }
        
        
        
    }
    
}

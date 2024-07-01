
package miclase;

public class Principal {

    public static void main(String[] args) {
       String nombre = "Luis";
       int edad  = 23;
       double estatura = 1.72;
       char sexo = 'H';
       boolean casado = false;
       
       System.out.println("Nombre : " + nombre);
       System.out.println("Edad : " + edad);
       System.out.println("Estatura : " + estatura);
       System.out.println("Sexo : " + sexo);
       System.out.println("Casado : " + casado);
       
       
       Persona miguel = new Persona ("Miguel",45,1.72,'H',true);
       
       System.out.println("Nombre : " + miguel.nombre);
       System.out.println("Edad : " + miguel.edad);
       System.out.println("Estatura : " + miguel.estatura);
       System.out.println("Sexo : " + miguel.sexo);
       System.out.println("Casado : " + miguel.casado);
               
       Persona carmen = new Persona("Carmen",45,1.72,'H',true);
        carmen.miToString();
        System.out.println(carmen);
        Persona x = carmen;
        
        carmen.cabecera();
        carmen.cuerpo();
        miguel.cuerpo();
    
    }   
}

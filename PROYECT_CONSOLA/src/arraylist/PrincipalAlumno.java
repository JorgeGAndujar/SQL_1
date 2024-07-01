
package arraylist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalAlumno {
    //BASE DE DATOS
    static List<Alumno> alumnos_al = new ArrayList<>();

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String opcion;
      
      
      List<String>  asignaturas_al = new ArrayList<>();
      asignaturas_al.add("Física");
      asignaturas_al.add("Química");
        
      Alumno alumno = new Alumno("A1","Luis","Roncal",15,asignaturas_al); 
      
      alumnos_al.add(alumno);
      
      
      do{ 
        cls();
        System.out.println("MENU");//SIMULAR CRUD= CREAR(CREAR) LEER(READ) ACTUALIZAR(UPDATE) ELIMINAR(DELETE)
        System.out.println("----");
        System.out.println("(1) AÑADIR ALUMNO");//CREAR
        System.out.println("(2) BUSCAR ALUMNO POR SU ID");//LEER
        System.out.println("(3) MOSTRAR LAS ASIGNATURAS DE UN ALUMNO");//LEER
        System.out.println("(4) MOSTRAR TODOS LOS ALUMNOS QUE CURSAN UNA ASIGNATURA");//LEER
        System.out.println("(5) SALIR");

        System.out.println("INGRESE OPCIÓN? ");
        opcion = sc.next();
      
      switch(opcion){
          case "1": cls();opcion1();pause(); break;
          case "2": cls();opcion2();pause(); break;
          case "3": cls();opcion3();pause(); break;
          case "4": cls();opcion4();pause(); break;
          case "5":  sc.close();System.exit(0);
          
      }
      
     }while(true);
     
 
   } 
    
   public static void opcion1(){
     System.out.println("(1) AÑADIR ALUMNO");  
     System.out.println("-----------------");
     Alumno alumno = new Alumno();
     alumno.entrada(alumnos_al);
     
   }
   public static void opcion2(){
       System.out.println("(2) BUSCAR ALUMNO");  
       System.out.println("-----------------");
       Scanner sc = new Scanner(System.in);
       System.out.print("INGRESAR IDALUMNO A BUSCAR (EJEMPLO A1)? ");
       String idAlumnoBuscar = sc.next();
       for(Alumno alumno: alumnos_al){
           if(alumno.getIdAlumno().equals(idAlumnoBuscar)){
               System.out.println(alumno);
               System.out.println("NOMBRE:"+alumno.getNombre());
               System.out.println("APELLIDO:"+alumno.getApellido());
               System.out.println("EDAD:"+ alumno.getEdad());
               System.out.println("ASIGNATURAS:"+ alumno.getAsignatures_al());
           }   
       }
   }
   public static void opcion3(){
       System.out.println("(3) MOSTRAR LAS ASIGNATURAS DE UN ALUMNO");//LEER
       System.out.println("----------------------------------------");//LEER
       String idAlumno = Util.leerIdAlumno();
       if(Util.existeIdAumno(idAlumno, alumnos_al)){
       for(Alumno a: alumnos_al){
           if(a.getIdAlumno().equals(idAlumno)){
               System.out.println("Nombre: "+ a.getNombre());
               System.out.println("Asignaturas: "+ a.getAsignatures_al());
           }
         }
       }else {
           System.out.println("EEEOE: ALUMNO NO EXISTE");
       }
   }
   public static void opcion4(){
       System.out.println("(4) MOSTRAR TODOS LOS ALUMNOS QUE CURSAN UNA ASIGNATURA");//LEER
       System.out.println("-------------------------------------------------------");//LEER
       System.out.println("ASIGNATURAS VALIDAS: Física|Química|Literatura|Matemáticas");
       String asignatura = Util.leerAsignatura();
       for(Alumno a: alumnos_al){
           List<String> alumnosaux_al = a.getAsignatures_al();
           if(Util.existeAsignatura(asignatura, alumnosaux_al)){
               System.out.println(a.getNombre());
           }
       }
       
   }
   public static void cls(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public static void pause(){
        try {
            System.out.print("\nPRESIONA UNA TECLA PARA CONTINUAR...");
            System.in.read();
        }catch(IOException e){
            
        }
    }
}


package arraylist;

import java.util.List;
import java.util.Scanner;

public class Util {
    
    public static boolean existeIdAumno(String idAlumno,List<Alumno> alumnos_al){
        boolean existe = false;
        for(Alumno a: alumnos_al){
            if(a.getIdAlumno().equals(idAlumno)){
                existe = true;
                break;
            }
          
      }
      return existe;
    }
    
    public static int leerEdad(){
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+ "; //[1-150]
        boolean correcto;
        String edad;
        do {
            System.out.println("INGRESAR EDAD? ");
            edad = sc.next();
            correcto = edad.matches(patron) && Integer.parseInt(edad) >=1
                                            && Integer.parseInt(edad) <=100;
            if(!correcto){
                System.out.println("ERROR: ENTRADA");
            }
            
        }while(!correcto);
        return Integer.parseInt(edad);
    }
    public static int leerNumeroAsignaturas(){
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+ "; //[1-5]
        boolean correcto;
        String numero;
        do {
            System.out.println("CUANTAS ASIGNATURAS DESEA INGRESAR?");
            numero = sc.next();
            correcto = numero.matches(patron) && Integer.parseInt(numero) >=1
                                              && Integer.parseInt(numero) <=5;
            if(!correcto){
                System.out.println("ERROR: ENTRADA");
            }
            
        }while(!correcto);
        return Integer.parseInt(numero);
    }
    
      public static String leerIdAlumno(){
        Scanner sc = new Scanner(System.in);
        String patron = "A[0-9]{1,2}"; //[A1 A2 A3]
        boolean correcto;
        String idAlumno;
        do {
            System.out.println("INGRESAR EDAD? ");
            idAlumno = sc.next();
            correcto = idAlumno.matches(patron);
            if(!correcto){
                System.out.println("ERROR: ENTRADA");
            }
            
        }while(!correcto);
        return idAlumno;
      }
      public static String leerAsignatura(){
        Scanner sc = new Scanner(System.in);
        String patron = "Física|Química|Literatura|Matemáticas"; //Física, Química, Literatura, Matemáticas
        boolean correcto;
        String asignatura;
        do {
            System.out.println("INGRESAR ASIGNATURA? ");
            asignatura = sc.next();
            correcto = asignatura.matches(patron);//true
            if(!correcto){ //false
                System.out.println("ERROR: ENTRADA");
            }
            
        }while(!correcto);//false
        return asignatura;
      }
      
      public static boolean existeAsignatura(String asignatura, List<String> alumnos_al){
          boolean existe = false;
          for(String s: alumnos_al){
              if(s.equals(asignatura)){
                  existe = true;
                  break;
              }
          }
          return existe;
      }
    
}
      

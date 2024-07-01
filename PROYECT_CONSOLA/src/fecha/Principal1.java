
package fecha;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal1 {
 

    public static void main(String[] args) {
        ejemplo7();
      
    }
    //RECUPERAR LA FECHA ACTUAL DEL SISTEMA y FORMATEARLA
    public static void ejemplo1(){
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String fechaFormato = fechaActual.format(formato);
        System.out.println(fechaFormato);
    }
    //SABER EL DIA EN QUE INICIA EL MES
    public static void ejemplo2(){
        LocalDate fecha = LocalDate.of(2024, 6, 19);
        System.out.println(fecha.getDayOfWeek());
        
    }
    //OBTENER EL NUMERO DE DÍAS DEL MES
    public static void ejemplo3(){
        LocalDate fecha = LocalDate.of(2024,2,1);
        System.out.println("Numero días del mes de febrero; " + fecha.lengthOfMonth());
    }
    //CREAR UNA TABLA CON LA CANTIDAD DE DÍAS DEL MES
    public static void ejemplo4(int year){
        System.out.println("AÑO: " + year);
        String[] meses ={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
        System.out.printf("%-12s %4s %6s\n","DESCRIPCION", "MES","DÍAS");
        System.out.printf("%-12s %4s %6s\n","-----------", "---","----");
        for (int i=1 ; i<=12; i++){
            System.out.printf("%-12s %4d %6d\n",meses[i-1],i,obtenerNumeroDiaDeMes(i,year)); 
        }
    }
    //CREAR UNA TABLACON LA CANTIDAD DE DUAS DE CADA MES DONDE EL AÑO ES ALEATORIO
    public static void ejemplo5(){
        int year =(int)(Math.random()*125+1900);//[1900-2024]
        ejemplo4(year);
    }
    
    //LE ENVIAS ESE DIA DEL MES Y TE REGRESA LOS DIAS QUE TIENE ESE MES;
    public static int obtenerNumeroDiaDeMes(int numeroMes, int year){
        LocalDate fecha = LocalDate.of(year, numeroMes,1);
        return fecha.lengthOfMonth();
    }
    
    //muestrar en que dia empieza la semana
    public static void ejemplo6(){
        LocalDate fecha = LocalDate.of(2024, 6, 19);
        System.out.println(fecha.getDayOfWeek());
        System.out.println("AÑO: " + fecha.getDayOfYear());
        System.out.println("DÍA: " + fecha.getDayOfWeek());
        String[] dias = {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
    }
    
    public static void ejemplo7(){
        int year =(int)(Math.random()*125+1900);
        System.out.println("AÑO: " + year);
        String[] meses ={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
        System.out.printf("%-12s %4s %6s %-12s\n","DESCRIPCION", "MES","DÍAS","DÍAS DEL MES");
        System.out.printf("%-12s %4s %6s %-12s\n","-----------", "---","----","------------");
        for (int i=1 ; i<=12; i++){
            System.out.printf("%-12s %4d %6d %-12s\n",meses[i-1],i,obtenerNumeroDiaDeMes(i,year),ObtenerDiaDeLaSemana(year,i));

        }
    }
   public static String ObtenerDiaDeLaSemana(int year, int numeroMes){
       LocalDate fecha = LocalDate.of(year, numeroMes, 1);
       return fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es"));
         
   }
           
}  



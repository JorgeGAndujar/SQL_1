
package fecha;

import java.time.LocalDate;
import java.time.YearMonth;


public class CalendarioEligeMesAño {

    public static void main(String[] args) {
     // Definir el año y el mes
        int year = 1969;
        int month =2 ;

        // Llamar al método para mostrar el calendario
        mostrarCalendario(year, month);
    }

    public static void mostrarCalendario(int year, int month) {
        // Obtener el primer día del mes y el número total de días en el mes
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        int totalDaysInMonth = yearMonth.lengthOfMonth();

        // Obtener el día de la semana del primer día del mes
        int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

        // Imprimir los encabezados de los días de la semana
        System.out.println(" L  M  X  J  V  S  D");

        // Rellenar con espacios los días antes del primer día del mes
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // Imprimir los días del mes
        for (int day = 1; day <= totalDaysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0 || day == totalDaysInMonth) {
                System.out.println();
            }
        }
    }
}
   
    

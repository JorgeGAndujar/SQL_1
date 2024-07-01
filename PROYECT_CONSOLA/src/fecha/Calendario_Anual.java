
package fecha;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendario_Anual {


    public static void main(String[] args) {
      // Definir el año para el calendario
        int year = 1993;

        // Llamar al método para mostrar el calendario anual
        mostrarCalendarioAnual(year);
    }

    public static void mostrarCalendarioAnual(int year) {
        // Iterar sobre cada mes del año
        for (int month = 1; month <= 12; month++) {
            mostrarCalendarioMensual(year, month);
            System.out.println(); // Espacio entre meses
        }
    }

    public static void mostrarCalendarioMensual(int year, int month) {
        // Obtener el primer día del mes y el número total de días en el mes
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        int totalDaysInMonth = yearMonth.lengthOfMonth();

        // Obtener el nombre del mes
        String nombreMes = yearMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());

        // Obtener el día de la semana del primer día del mes
        int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

        // Imprimir el nombre del mes y el año
        System.out.printf("     %s %d%n", nombreMes, year);
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
   

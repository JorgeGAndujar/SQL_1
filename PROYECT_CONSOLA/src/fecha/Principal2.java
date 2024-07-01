package fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JTextArea;

public class Principal2 {

    public static void main(String[] args) {
        String s;
        String[] díasSemana = {"L", "M", "X", "J", "V", "S", "D"};
        String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        for (int mes = 1; mes <= 12; mes++) {

            VentanaSalida vs = new VentanaSalida(meses[mes - 1]);
            JTextArea txaContenido = vs.getTextArea();
            int[][] matrizmes = new int[6][7];
            int numeroDias = obtenerNumeroDiaDeMes(mes, 2024);
            int diaSemana = obtenerDiaSemanaPrimerDiaMesNumero(mes, 2024);
            boolean bandera = false;
            int indice = 1;

            System.out.println("              " + meses[mes - 1] + "         ");//Object[]-----o nada
            System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", (Object[]) díasSemana);//String[]-----o nada

            s = String.format("%4s %4s %4s %4s %4s %4s %4s\n", (Object[]) díasSemana);
            txaContenido.append(s);
            s = String.format("\n");
            for (int i = 0; i < matrizmes.length; i++) {
                for (int j = 0; j < matrizmes[0].length; j++) {
                    if (i == 0 && j == diaSemana) {
                        bandera = true;
                    }
                    if (bandera) {
                        matrizmes[i][j] = indice;
                        indice++;
                    }
                    if (indice > numeroDias) {
                        bandera = false;
                    }
                }
            }
            imprimirMatriz(matrizmes, txaContenido);
            System.out.println();
        }
    }

    public static void imprimirMatriz(int[][] matriz, JTextArea txaContenido) {

        String s;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != 0) {
                    System.out.printf("%4d ", matriz[i][j]);
                    s = String.format("%4d ", matriz[i][j]);
                    txaContenido.append(s);
                } else {
                    System.out.printf("%4s ", " ");
                    s = String.format("%4s ", " ");
                    txaContenido.append(s);
                }
            }
            System.out.println();
            s = String.format("\n");
            txaContenido.append(s);
        }
    }

    public static int obtenerNumeroDiaDeMes(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        return fecha.lengthOfMonth();
    }

    public static int obtenerDiaSemanaPrimerDiaMesNumero(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        DayOfWeek diaSemanaTexto = fecha.getDayOfWeek();
        int diaSemanaNumero = diaSemanaTexto.getValue();
        return diaSemanaNumero - 1;
    }

}

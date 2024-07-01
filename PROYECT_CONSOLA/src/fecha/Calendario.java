
package fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JTextArea;

public class Calendario {
    //VARIABLES DE IINSTANCIA(ATRIBUTOS)
    private int year;
    private int mes;
    
    //CONTRUCTORES

    public Calendario() {
        this.year = 0;
        this.mes = 0;
    }

    public Calendario(int year, int mes) {
        this.year = year;
        this.mes = mes;
    }

    public Calendario(int year) {
        this.year = year;
    }
    
    //METODO SET  Y GET

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    //METODO TO STRING

    @Override
    public String toString() {
        return "Calendario{" + "year=" + year + ", mes=" + mes + '}';
    }
   
    //METODOS
    
        public int[][] obtenerMatrizMes(){
            int[][] matrizmes = new int[6][7];
            int numeroDias = obtenerNumeroDiaDeMes();
            int diaSemana = obtenerDiaSemanaPrimerDiaMesNumero();
            boolean bandera = false;
            int indice = 1;
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
             return matrizmes;
        }
        
    public int[][][] obtenerCuboYear(){
        int [][][] cuboyear = new int [12][6][7];
        for(int i =0; i<cuboyear.length; i++){
            this.setMes(i+1);
            cuboyear[i] = obtenerMatrizMes();
        }
        return cuboyear;
    }      
    
    
    public int obtenerDiaSemanaPrimerDiaMesNumero() {
        LocalDate fecha = LocalDate.of(year, mes, 1);
        DayOfWeek diaSemanaTexto = fecha.getDayOfWeek();//obtener el dia del mes
        int diaSemanaNumero = diaSemanaTexto.getValue();
        return diaSemanaNumero - 1;
    }
    
     public int obtenerNumeroDiaDeMes() {
        LocalDate fecha = LocalDate.of(year, mes, 1);
        return fecha.lengthOfMonth();
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

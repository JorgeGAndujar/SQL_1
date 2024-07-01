
import static fecha.Principal2.imprimirMatriz;
import static fecha.Principal2.obtenerDiaSemanaPrimerDiaMesNumero;
import static fecha.Principal2.obtenerNumeroDiaDeMes;
import fecha.VentanaSalida;
import javax.swing.JTextArea;





public class Principal3 {

    public static void main(String[] args) {
      
   
        String[] díasSemana ={"L","M","X","J","V","S","D"};
        String[] meses ={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
          int[][][]cubo = new int[12][6][7];//nº de matriz,fila,columnaç
         
          
           
          
          
          for(int a=0; a<cubo.length; a++){//Matriz
              System.out.println("         "+ meses[a]+"         ");//Object[]-----o nada
              System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", (Object[]) díasSemana);
              
              
             
              
            for(int b=0; b<cubo[0].length; b++){//Filas
                for(int c=0; c<cubo[0][0].length; c++){//COLUMNA
                    
                    System.out.printf("%4d ",cubo[a][b][c]);
                }
                System.out.println();
            }
            System.out.println();   
        } 
  
    } 
        public static int [][][] obtenerCuboCalendario(){
           
             int[][][]cubo = new int[12][6][7];//nº de matriz,fila,columna
             
             
             
             for(int mes =1; mes<=12; mes++){
                 int numeroDias = obtenerNumeroDiaDeMes(mes, 2024);
                 int diaSemana = obtenerDiaSemanaPrimerDiaMesNumero(mes, 2024);
                 boolean bandera = false;
                 int indice = 1;
                  
              //CONSTRUIR CADA MES EN UNA MATRIZ
              int[][] matrizmes = new int[6][7];
             
              //LLENA LOS NUMEROS
                 cubo[1] = matrizmes;//enero
                 cubo[2] = matrizmes;//febrero
                 cubo[3] = matrizmes;//marzo
                 cubo[4] = matrizmes;//abril
                 cubo[5] = matrizmes;//mayo
                 cubo[6] = matrizmes;//junio
                 cubo[7] = matrizmes;//julio
                 cubo[8] = matrizmes;//agosto
                 cubo[9] = matrizmes;//septiembre
                 cubo[10] = matrizmes;//octubre
                 cubo[11] = matrizmes;//noviembre
                 cubo[12] = matrizmes;//diciembre
                 
                 
                 
        for (int i = 0; i< matrizmes.length; i++) {
                for (int j = 0; j < matrizmes[1].length; j++) {
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
                 String titulo = null;
                 VentanaSalida vs = new VentanaSalida(titulo);
                 JTextArea txaContenido = vs.getTextArea();
                imprimirMatriz(matrizmes, txaContenido);
                System.out.println();
            }
                
        }
             
      return cubo;
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
             
             
      

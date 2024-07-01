package array;

import static array.Principal2.matriz;

public class Principal2 {

    static int[][] matriz = {
        {1, 2, 3},//(0,0) (0,1) (0,2)
        {4, 5, 6},//(1,0) (1,1) (1,2)
        {7, 8, 9}//(2,0) (2,1) (2,2)
    };// //3x3

    public static void main(String[] args) {
        ejemplo10();

    }

    //MOSTRAR LA DIAGONAL
    public static void ejemplo1() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; i++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();

        }
    }

    //MOSTRAR LOS NUMEROS DEBAJO DE LA DIAGONAL 
    public static void ejemplo2() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
    //MOSTRAR LOS NUMEROS ENCIMA DE LA DIAGONAL

    public static void ejemplo3() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
    //MOSTRAR LOS NUMEROS DE LA PRIMERA FILA DE LA MATRIZ

    public static void ejemplo4() {
        System.out.println("FORMA1");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
    //MOSTRAR SOLO LA PRIMERA FILA DE LA MATRIZ
    public static void ejemplo5() {
        System.out.println("FORMA2");
        for (int j = 0; j < matriz[0].length; j++) {

            System.out.print(matriz[0][j] + " ");

        }
        System.out.println();
    } 
    //ELEMPLO5: CAMBIAR LOS ELEMENTOS DE LA MATRIZ; LOS PARES POR 1 Y LOS IMPARES POR 0
    public static void ejemplo6(){
        for (int i = 0; i <matriz[0].length; i++) {
            for (int j = 0; j <matriz[0].length; j++){
             if(matriz [i][j] % 2 == 0){
                 matriz [i][j]=1;
             }else {
                 matriz [i][j]=0;   
                }System.out.print(matriz[i][j]+ " ");
            }System.out.println();
        }
        
    }
    //MUESTRA UNA MATRIZ POR COLUMNAS
    public static void ejemplo7(){
        System.out.println("RECORRER POR COLUMNAS");
         for (int j = 0; j <matriz[0].length; j++) {//COLUMNA
             for (int i = 0; i <matriz[0].length; i++){//FILA
                 System.out.print(matriz[i][j]+" ");
         }
        System.out.println();
    }
 }
    //MOSTRAR LA SUMA DE CADA FILA Y CADA COLUMNA
    public static void ejemplo8(){
        System.out.println("RECORRER POR COLUMNAS");
         for (int j = 0; j <matriz[0].length; j++) {//COLUMNA
                int sumaColumna = 0;
            for (int i = 0; i <matriz[0].length; i++){//FILA
                sumaColumna = sumaColumna + matriz[j][i];
                 System.out.print(matriz[j][i]+" ");
                 System.out.print("suma: "+ sumaColumna);
         
         }
                
            }
         System.out.println("RECORRER POR FILAS");
          
          for (int i = 0; i <matriz[0].length; i++) {//FILA
              int sumaFila = 0;
            for (int j = 0; j <matriz[0].length; j++){//COLUMNA
                sumaFila = sumaFila + matriz[i][j];
                 System.out.print(matriz[i][j]+" ");
                 System.out.print("suma: "+ sumaFila);
            }
         
        System.out.println();
        }
    }
        
     //MOSTRAR LA SUMA DE CADA FILA Y CADA COLUMNA
    public static void ejemplo9() {
        int sumaf, sumac, sumat = 0;
        
        System.out.println("RECORRER POR FILAS");
        for (int i = 0; i < matriz.length; i++) { //fila
            sumaf = 0;
            for (int j = 0; j < matriz[0].length; j++) { //columna
                System.out.print(matriz[i][j] + "  ");
                sumaf = sumaf + matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaf);
        }
        System.out.println("RECORRER POR COLUMNAS");
        for (int j = 0; j < matriz[0].length; j++) { //columna
            sumac = 0;
            for (int i = 0; i < matriz.length; i++) { //fila
                System.out.print(matriz[i][j] + "  ");
                sumac = sumac + matriz[i][j];
                sumat = sumat + matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumac);
        }
        
        System.out.println("SUMA TOTAL: " + sumat);
    }
         
     public static void ejemplo10() {
        int sumaf, sumac, sumat = 0;
        int[] vectorf = {0, 0, 0};
        int[] vectorc = {0, 0, 0};
        //System.out.println("RECORRER POR FILAS");
        for (int i = 0; i < matriz.length; i++) { //fila
            sumaf = 0;
            for (int j = 0; j < matriz[0].length; j++) { //columna
                sumaf = sumaf + matriz[i][j];
            }
            vectorf[i] = sumaf;
        }
        //System.out.println("RECORRER POR COLUMNAS");
        for (int j = 0; j < matriz[0].length; j++) { //columna
            sumac = 0;
            for (int i = 0; i < matriz.length; i++) { //fila
                sumac = sumac + matriz[i][j];
                sumat = sumat + matriz[i][j];
            }
            vectorc[j] = sumac;
        }

        for (int i = 0; i < matriz.length; i++) { //fila
            for (int j = 0; j < matriz[0].length; j++) { //columna  
                 System.out.printf("%4d",matriz[i][j]);
            }
            System.out.printf("%4d\n",vectorf[i]);
        }

        for(int i=0; i<vectorc.length; i++) {
            System.out.printf("%4d",vectorc[i]);
        }
        System.out.printf("%4d\n", + sumat);
    }
}


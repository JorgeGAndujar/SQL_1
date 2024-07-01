package array;

public class Principal1 {

    public static void main(String[] args) {
    tiposArray() ;
    }

    public static void tiposArray() {
        //VECTOR(UNIDIMENSIONAL)
        System.out.println("vector array");
        System.out.println("------------");
        int[] vector = {1, 2, 3};
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        //MATRIZ(BIDIMENSIONAL)
        System.out.println("Matriz array");
        System.out.println("------------");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i = 0; i < matriz.length; i++) {//fila
            for (int j = 0; j < matriz[0].length; j++) {//columna
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
            //CUBO (TRIDIMENSIONAL)
            System.out.println("cubo array");
            System.out.println("----------");
            int[][][] cubo = {
                {
                    {1, 2, 3},
                    {4, 5, 6}
                },
                {
                    {7, 8, 9},
                    {10, 11, 12}
                },
                {
                    {13, 14, 15},
                    {16, 17, 18}
                }

            };
            for (int i = 0; i < cubo.length; i++) {//fila
                for (int j = 0; j < cubo[0].length; j++) {//columna
                    for (int k = 0; k < cubo[0][0].length; k++) {//matriz
                        System.out.print(cubo[i][j][k] + " ");
                    }System.out.println();
                }System.out.println();
            }
            System.out.println("terseracto array");
            System.out.println("----------------");
            int[][][][] teseracto = {
                {{
                    {1, 2, 3},
                    {4, 5, 6}
                },
                {
                    {7, 8, 9},
                    {10, 11, 12}
                },
                {
                    {13, 14, 15},
                    {16, 17, 18}
                },
                {
                    {19, 20, 21},
                    {22, 23, 24}
                }
                }

            };
        for (int i = 0; i < teseracto.length; i++) {//fila
            for (int j = 0; j < teseracto[0].length; j++) {//columna
                for (int k = 0; k < teseracto[0][0].length; k++) {//matriz
                    for (int l = 0; l < teseracto[0][0][0].length; l++) {//cubo
                    System.out.print(teseracto[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
             System.out.println();
        }
    }
}

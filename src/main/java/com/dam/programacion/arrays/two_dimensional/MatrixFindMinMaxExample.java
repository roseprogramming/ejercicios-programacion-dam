package com.dam.programacion.arrays.two_dimensional;
import java.util.Random;
public class MatrixFindMinMaxExample {
    //DECLARO CONSTANTES
    public static int TAMANYO= 5;


    //EJERCICIO: CREAR MATRIZ BIDIRECCIONAL, RELLENAR MATRIZ ALEATORIAMENTE, IDENTIFICAR MAXIMO Y MINIMO.
    public static void main(String[] args) {
        int [][] matriz = new int[TAMANYO][TAMANYO];//declaro mi matriz
        Random rand = new Random();//clase del paquete java.util para rellenar de manera aleatoria
        //variables para encontrar el máximo y el mínimo
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxRow = 0, maxCol = 0;  // Para almacenar la posición del máximo
        int minRow = 0, minCol = 0;  // Para almacenar la posición del mínimo

        //relleno la matriz con mi variable Random (rand), el limite (bound) es 100
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=rand.nextInt(100)+1;
            }
        }
        //muestro la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        //encontrar el máximo y mínimo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxRow = i;  // Guardar la fila del máximo
                    maxCol = j;  // Guardar la columna del máximo
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    minRow = i;  // Guardar la fila del mínimo
                    minCol = j;  // Guardar la columna del mínimo
                }
            }
        }
        // muestro los resultados
        System.out.println("\nMáximo valor: " + max + " en la posición (" + maxRow + ", " + maxCol + ")");
        System.out.println("Mínimo valor: " + min + " en la posición (" + minRow + ", " + minCol + ")");
    

    }

}

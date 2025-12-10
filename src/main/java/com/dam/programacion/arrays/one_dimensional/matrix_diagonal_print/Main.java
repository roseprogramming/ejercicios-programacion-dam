package com.dam.programacion.arrays.one_dimensional.matrix_diagonal_print;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Imprime el valor de la diagonal de una matriz*/

        int[][] matriz = new int[3][3];
        try (Scanner scn = new Scanner(System.in)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("matriz [" + i + "] [" + j + "]");
                    matriz[i][j] = scn.nextInt();
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(i == j){
                        System.out.print(matriz[i][j]+" ");
                    }
                }
            }
        }


    }
}

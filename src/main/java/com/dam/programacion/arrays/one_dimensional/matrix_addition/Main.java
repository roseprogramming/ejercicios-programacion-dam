package com.dam.programacion.arrays.one_dimensional.matrix_addition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //fxc
        //Crear dos matrices de 3x3 y crea una 3ª matriz donde almacenes la suma
        //de las dos matrices

        //1. Crear las dos matrices
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int [][] suma = new int[3][3];

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Introduzca los valores de la primera matriz");
            for(int i = 0;i<matriz1.length;i++){
                for(int j = 0;j<matriz1[i].length;j++){
                    System.out.print("Elemento ["+i+"] ["+j+"]: ");
                    matriz1[i][j] = scn.nextInt();
                }
            }

            System.out.println("Introduzca los valores de la segunda matriz");
            for(int i = 0;i<matriz2.length;i++){
                for(int j = 0;j<matriz2[i].length;j++){
                    System.out.print("Elemento ["+i+"] ["+j+"]: ");
                    matriz2[i][j] = scn.nextInt();
                }
            }

            //Sumar las matrices
            for(int i = 0;i<suma.length;i++){
                for(int j = 0;j<suma[i].length;j++){
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }

            System.out.println("La matriz resultante es: ");
            for(int i = 0;i< suma.length;i++){
                for(int j = 0;j<suma[i].length;j++){
                    System.out.print(suma[i][j]+" ");
                }
                System.out.println();
            }
        }






    }

}

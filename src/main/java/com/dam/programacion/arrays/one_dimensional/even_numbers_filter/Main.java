package com.dam.programacion.arrays.one_dimensional.even_numbers_filter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Pide 10 números al usuario y guardarlos en un array
        //Una vez guardados recorre el array de números y los que sean números
        //pares, metelos en un nuevo array de números pares.
        //Al final del programa recorre solo el array de números pares
        int [] numeros = new int[10];
        int contadorPares = 0;

        try (Scanner scn = new Scanner(System.in)) {
            for(int i = 0;i< numeros.length;i++){
                numeros[i] = scn.nextInt();
                if(numeros[i] % 2 == 0){
                    contadorPares++;
                }
            }

            int [] pares = new int[contadorPares];
            int indice = 0;

            for(int i = 0;i<numeros.length;i++){
                if(numeros[i] % 2 == 0){
                    pares[indice] = numeros[i];
                    indice++;
                }
            }

            for(int i = 0;i<pares.length;i++){
                System.out.println(pares[i]);
            }
        }


    }
}

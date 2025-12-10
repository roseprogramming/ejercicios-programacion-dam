package com.dam.programacion.arrays.one_dimensional.count_positive_negative_zeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crea un array de 10 elementos, con valores introducidos por el usuario
        //Una vez introducidos, recorrer el array y contar cuantos valores son
        //positivos, negativos o 0

        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0;

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Introduzca los elementos del array: ");

            for (int i = 0;i<numeros.length;i++){
                System.out.print("numeros["+i+"] = ");
                numeros[i] = scn.nextInt();
            }

            for (int i = 0;i< numeros.length;i++){
                if(numeros[i] > 0){
                    pos++;
                }else if(numeros[i] < 0){
                    neg++;
                }else{
                    cero++;
                }
            }
            System.out.println("Positivos: "+pos);
            System.out.println("Negativos: "+neg);
            System.out.println("Ceros: "+cero);
        }

    }
}

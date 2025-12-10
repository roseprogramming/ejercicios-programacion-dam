package com.dam.programacion.arrays.one_dimensional.average_positive_negative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crea un array "vacio" de 10 posiciones, introducir 10 números enteros y mostrar
        //la media de los valores positivos y la media de los valores negativos
        //Al final hay que comprobar si hay positivos, en ese caso mostrar la media
        //Si hay negativos, mostrar la media también

        int [] array = new int[10];
        int pos = 0, neg = 0;
        int sumaPos = 0, sumaNeg = 0;
        float mediaPos, mediaNeg;

        try (Scanner scn = new Scanner(System.in)) {
            for(int i = 0;i< array.length;i++){
                System.out.println("Introduzca el valor de la posicion "+i+": ");
                array[i] = scn.nextInt();
            }

            for(int i = 0;i< array.length;i++){
                if(array[i] > 0){
                    sumaPos+= array[i]; //sumaPos = sumaPos + array[i]
                    pos++;
                } else if (array[i]<0) {
                    sumaNeg+=array[i]; //sumaNeg = sumaNeg + array[i]
                    neg++;
                }
            }

            if(pos>0){
                mediaPos = (float) sumaPos / pos;
                System.out.println("La media de los positivos es: "+mediaPos);
            }else{
                System.out.println("No hay positivos");
            }

            if(neg>0){
                mediaNeg = (float) sumaNeg / neg;
                System.out.println("La media de los negativos es: "+mediaNeg);
            }else{
                System.out.println("No hay negativos");
            }
        }



    }
}

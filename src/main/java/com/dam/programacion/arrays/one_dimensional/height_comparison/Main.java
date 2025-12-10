package com.dam.programacion.arrays.one_dimensional.height_comparison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hay que leer la altura de N número de personas, y calcular la media.
        //Calcular cuantas personas tienen la altura superior a la media
        //Y calcular cuantas personas tienen la altura inferior a la media.

        int n;
        double sumaAlturas = 0.0;
        double media;
        int contMas = 0, contMenos = 0;

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Introduzca cuantas personas quieres tomar la altura");
            n = scn.nextInt();

            double [] alturas = new double[n];

            System.out.println("Introduzca las alturas");
            for(int i = 0;i<alturas.length;i++){
                System.out.print("Altura: "+(i+1)+": ");
                alturas[i] = scn.nextDouble();
                sumaAlturas += alturas[i]; //sumaAlturas = sumaAlturas + alturas[i]
            }

            media = sumaAlturas / n;

            for(int i = 0;i<alturas.length;i++){
                if(alturas[i] > media){
                    contMas++;
                }else if(alturas[i]<media){
                    contMenos++;
                }
            }

            System.out.println("Número de personas: "+n);
            System.out.println("Personas con estaturas superior a la media: "+contMas);
            System.out.println("Personas con estaturas inferior a la media: "+contMenos);
        }

    }
}

package com.dam.programacion.basics.exceptions;
/// •	1. Crea un programa en Java que capture una excepción al
/// intentar acceder a un índice inválido de un array.

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // Array de 5 elementos

        try {
            // Intentamos acceder a un índice fuera del rango
            System.out.println("El número en la posición 10 es: " + numeros[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentaste acceder a un índice fuera de los límites del array.");
        }

        System.out.println("Fin del programa.");
    }
}

package com.dam.programacion.io.console;

import java.util.Scanner;

/**
 * Entrada/Salida básica por consola - Calculadora interactiva.
 * 
 * Demuestra:
 * - Scanner para lectura de entrada del usuario
 * - System.out para salida formateada
 * - Validación de entrada (InputMismatchException)
 * - Try-catch-finally para gestión de recursos
 * 
 * @author Profesor DAM
 * @version 2.0
 */
public class Calculator {
    
    /**
     * Realiza la suma de dos números y muestra el resultado.
     * @param a Primer número
     * @param b Segundo número
     */
    public static void calcularSuma(int a, int b) {
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
    }
    
    /**
     * Realiza la resta de dos números y muestra el resultado.
     * @param a Primer número (minuendo)
     * @param b Segundo número (sustraendo)
     */
    public static void calcularResta(int a, int b) {
        int resta = a - b;
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);
    }
    
    /**
     * Realiza la multiplicación de dos números y muestra el resultado.
     * @param a Primer número
     * @param b Segundo número
     */
    public static void calcularMultiplicacion(int a, int b) {
        int multiplicacion = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + multiplicacion);
    }
    
    /**
     * Realiza la división de dos números y muestra el resultado.
     * Valida que el divisor no sea cero.
     * @param a Dividendo
     * @param b Divisor
     */
    public static void calcularDivision(int a, int b) {
        if (b == 0) {
            System.out.println("ERROR: No se puede dividir entre cero");
            return;
        }
        float division = (float) a / b;
        System.out.println("La división de " + a + " entre " + b + " es: " + division);
    }
    
    /**
     * Calcula el módulo (resto) de la división de dos números.
     * @param a Dividendo
     * @param b Divisor
     */
    public static void calcularModulo(int a, int b) {
        if (b == 0) {
            System.out.println("ERROR: No se puede calcular el módulo con divisor cero");
            return;
        }
        int resto = a % b;
        System.out.println("El resto de " + a + " entre " + b + " es: " + resto);
    }
    
    /**
     * Realiza todas las operaciones básicas entre dos números.
     * @param a Primer número
     * @param b Segundo número
     */
    public static void realizarTodasLasOperaciones(int a, int b) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   OPERACIONES CON " + a + " Y " + b + "             ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        calcularSuma(a, b);
        calcularResta(a, b);
        calcularMultiplicacion(a, b);
        calcularDivision(a, b);
        calcularModulo(a, b);
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║  ENTRADA/SALIDA Y CALCULADORA EN JAVA   ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        Scanner scanner = new Scanner(System.in);
        
        int a;
        int b;
        
        try {
            // Solicitar entrada del usuario
            System.out.print("Introduzca el primer valor (a): ");
            a = scanner.nextInt();
            
            System.out.print("Introduzca el segundo valor (b): ");
            b = scanner.nextInt();
            
            // Realizar operaciones
            realizarTodasLasOperaciones(a, b);
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("ERROR: Debe introducir valores numéricos enteros");
        } finally {
            scanner.close();
        }
        
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   CALCULADORA FINALIZADA               ║");
        System.out.println("╚════════════════════════════════════════╝");
    }
}

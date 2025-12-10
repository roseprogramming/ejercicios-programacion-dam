package com.dam.programacion.basics.control_structures;

import java.util.Scanner;

/**
 * Clase que demuestra el uso de estructuras de control en Java.
 * Incluye ejemplos de if-else, switch, while, do-while y for.
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class ControlStructures {
    
    /**
     * Demuestra el uso de condicionales if-else.
     * @param numero El número a evaluar
     */
    public static void demostracionIf(int numero) {
        System.out.println("\n--- DEMOSTRACIÓN IF-ELSE ---");
        
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número es cero");
        }
        
        // If-else anidados
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("Es un número positivo y PAR");
            } else {
                System.out.println("Es un número positivo e IMPAR");
            }
        }
    }
    
    /**
     * Demuestra el uso de switch.
     * @param dia El número del día de la semana (1-7)
     */
    public static void demostracionSwitch(int dia) {
        System.out.println("\n--- DEMOSTRACIÓN SWITCH ---");
        
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        
        System.out.println("Día " + dia + ": " + nombreDia);
    }
    
    /**
     * Demuestra el uso de bucle while.
     * @param limite El límite del contador
     */
    public static void demostracionWhile(int limite) {
        System.out.println("\n--- DEMOSTRACIÓN WHILE ---");
        System.out.println("Contando de 1 a " + limite + " con while:");
        
        int contador = 1;
        while (contador <= limite) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println();
    }
    
    /**
     * Demuestra el uso de bucle do-while.
     * @param limite El límite del contador
     */
    public static void demostracionDoWhile(int limite) {
        System.out.println("\n--- DEMOSTRACIÓN DO-WHILE ---");
        System.out.println("Contando de 1 a " + limite + " con do-while:");
        
        int contador = 1;
        do {
            System.out.print(contador + " ");
            contador++;
        } while (contador <= limite);
        System.out.println();
    }
    
    /**
     * Demuestra el uso de bucle for.
     * @param limite El límite del contador
     */
    public static void demostracionFor(int limite) {
        System.out.println("\n--- DEMOSTRACIÓN FOR ---");
        System.out.println("Contando de 1 a " + limite + " con for:");
        
        for (int i = 1; i <= limite; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     * Demuestra el uso de for-each.
     */
    public static void demostracionForEach() {
        System.out.println("\n--- DEMOSTRACIÓN FOR-EACH ---");
        
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Iterando array con for-each:");
        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    /**
     * Demuestra el uso de break y continue.
     */
    public static void demostracionBreakContinue() {
        System.out.println("\n--- DEMOSTRACIÓN BREAK Y CONTINUE ---");
        
        System.out.println("Números del 1 al 10, saltando pares (continue):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Salta a la siguiente iteración
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Números del 1 al 10, parando en 6 (break):");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Sale del bucle
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     * Demuestra operador ternario.
     * @param numero El número a evaluar
     */
    public static void demostracionTernario(int numero) {
        System.out.println("\n--- DEMOSTRACIÓN OPERADOR TERNARIO ---");
        
        String resultado = numero >= 18 ? "Es mayor de edad" : "Es menor de edad";
        System.out.println("Edad " + numero + ": " + resultado);
    }
    
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   ESTRUCTURAS DE CONTROL EN JAVA");
        System.out.println("========================================");
        
        // Ejemplos con valores fijos
        demostracionIf(15);
        demostracionSwitch(3);
        demostracionWhile(5);
        demostracionDoWhile(5);
        demostracionFor(5);
        demostracionForEach();
        demostracionBreakContinue();
        demostracionTernario(25);
        
        // Interacción con el usuario
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n========================================");
            System.out.println("   ENTRADA INTERACTIVA DEL USUARIO");
            System.out.println("========================================");
            
            System.out.print("\nIntroduce un número para evaluar con if: ");
            int numero = scanner.nextInt();
            demostracionIf(numero);
            
            System.out.print("\nIntroduce un día (1-7) para el switch: ");
            int dia = scanner.nextInt();
            demostracionSwitch(dia);
            
            System.out.print("\nIntroduce un límite para contar: ");
            int limite = scanner.nextInt();
            demostracionFor(limite);
        }
        
        System.out.println("\n========================================");
        System.out.println("   FIN DE LA DEMOSTRACIÓN");
        System.out.println("========================================");
    }
}

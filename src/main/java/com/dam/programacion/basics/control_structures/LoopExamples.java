package com.dam.programacion.basics.control_structures;

/**
 * Demostración de estructuras repetitivas: for, while, do-while, for-each
 * Conceptos: Iteración y repetición de código
 */
public class LoopExamples {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("🔁 ESTRUCTURAS REPETITIVAS (LOOPS) EN JAVA");
        System.out.println("=".repeat(60));

        demoForLoop();
        demoWhileLoop();
        demoDoWhileLoop();
        demoForEachLoop();
        demoNestedLoops();
        demoLoopControl();
    }

    /**
     * Demuestra for loop tradicional
     */
    private static void demoForLoop() {
        System.out.println("\n\n1️⃣  FOR LOOP TRADICIONAL");
        System.out.println("-".repeat(60));

        System.out.println("Conteo del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Iteración " + i);
        }

        System.out.println("\nTabla de multiplicar del 3:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("  3 × " + i + " = " + (3 * i));
        }

        System.out.println("\nConteo regresivo (5 a 1):");
        for (int i = 5; i >= 1; i--) {
            System.out.println("  " + i);
        }
    }

    /**
     * Demuestra while loop
     */
    private static void demoWhileLoop() {
        System.out.println("\n\n2️⃣  WHILE LOOP");
        System.out.println("-".repeat(60));

        System.out.println("Contar hasta 5 con while:");
        int count = 1;
        while (count <= 5) {
            System.out.println("  Contador: " + count);
            count++;
        }

        System.out.println("\nSimular ahorros mensales:");
        double balance = 100;
        int month = 0;
        while (balance < 1000) {
            balance += 200;
            month++;
            System.out.println("  Mes " + month + ": €" + balance);
        }
    }

    /**
     * Demuestra do-while loop
     */
    private static void demoDoWhileLoop() {
        System.out.println("\n\n3️⃣  DO-WHILE LOOP");
        System.out.println("-".repeat(60));

        System.out.println("Do-while (se ejecuta al menos una vez):");
        int i = 1;
        do {
            System.out.println("  Ejecutando iteración " + i);
            i++;
        } while (i <= 3);

        System.out.println("\nSimulación de menú (mínimo una ejecución):");
        int option = 4;
        do {
            System.out.println("  Mostrando menú...");
            System.out.println("  Opción seleccionada: " + option);
            option--;
        } while (option > 0);
    }

    /**
     * Demuestra for-each loop (mejorado)
     */
    private static void demoForEachLoop() {
        System.out.println("\n\n4️⃣  FOR-EACH LOOP (Enhanced For)");
        System.out.println("-".repeat(60));

        String[] cities = {"Madrid", "Barcelona", "Valencia", "Sevilla"};
        System.out.println("Ciudades:");
        for (String city : cities) {
            System.out.println("  🏙️  " + city);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.println("\nSumando números con for-each:");
        for (int num : numbers) {
            sum += num;
            System.out.println("  " + num + " → Total acumulado: " + sum);
        }
    }

    /**
     * Demuestra bucles anidados
     */
    private static void demoNestedLoops() {
        System.out.println("\n\n5️⃣  BUCLES ANIDADOS");
        System.out.println("-".repeat(60));

        System.out.println("Tabla de multiplicar (1-3 × 1-3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(String.format("%2d ", i * j));
            }
            System.out.println();
        }

        System.out.println("\nPiramide de asteriscos:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Demuestra control de flujo (break, continue)
     */
    private static void demoLoopControl() {
        System.out.println("\n\n6️⃣  CONTROL DE FLUJO (break, continue)");
        System.out.println("-".repeat(60));

        System.out.println("Usando break (sale del loop cuando encuentra 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("  ⛔ Encontré 5, saliendo del loop");
                break;
            }
            System.out.println("  " + i);
        }

        System.out.println("\nUsando continue (salta los pares):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Salta los números pares
            }
            System.out.println("  Impar: " + i);
        }

        System.out.println("\nBúsqueda con break:");
        int[] scores = {45, 78, 92, 61, 88, 55};
        int searchScore = 92;
        boolean found = false;
        for (int score : scores) {
            if (score == searchScore) {
                System.out.println("  ✅ Calificación " + searchScore + " encontrada!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("  ❌ Calificación no encontrada");
        }
    }
}

package com.dam.programacion.arrays.search_and_sorting;

import java.util.Arrays;

/**
 * Algoritmos de búsqueda en arrays
 * Incluye: búsqueda lineal y búsqueda binaria
 */
public class SearchExamples {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("🔍 ALGORITMOS DE BÚSQUEDA EN ARRAYS");
        System.out.println("=".repeat(60));

        demoLinearSearch();
        demoBinarySearch();
    }

    /**
     * Búsqueda lineal: recorre el array elemento a elemento
     * Complejidad: O(n)
     * Ventaja: funciona en arrays desordenados
     */
    private static void demoLinearSearch() {
        System.out.println("\n\n1️⃣  BÚSQUEDA LINEAL (Linear Search)");
        System.out.println("-".repeat(60));

        int[] numbers = {45, 23, 67, 12, 89, 34, 56, 78};
        int target = 89;

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Buscando: " + target);
        System.out.println();

        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("✅ Encontrado en el índice: " + index);
        } else {
            System.out.println("❌ No encontrado");
        }

        System.out.println("\n--- Búsqueda en array de strings ---");
        String[] cities = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao"};
        String searchCity = "Valencia";

        System.out.println("Array: " + Arrays.toString(cities));
        System.out.println("Buscando: " + searchCity);

        index = linearSearch(cities, searchCity);
        if (index != -1) {
            System.out.println("✅ Encontrado en el índice: " + index);
        } else {
            System.out.println("❌ No encontrado");
        }
    }

    /**
     * Búsqueda binaria: divide el array por la mitad
     * Requiere array ORDENADO
     * Complejidad: O(log n) - mucho más rápida
     */
    private static void demoBinarySearch() {
        System.out.println("\n\n2️⃣  BÚSQUEDA BINARIA (Binary Search)");
        System.out.println("-".repeat(60));

        int[] numbers = {12, 23, 34, 45, 56, 67, 78, 89};  // ¡DEBE estar ordenado!
        int target = 67;

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Array DEBE estar ordenado: ✅");
        System.out.println("Buscando: " + target);
        System.out.println();

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("✅ Encontrado en el índice: " + index);
        } else {
            System.out.println("❌ No encontrado");
        }

        System.out.println("\n--- Comparación de velocidad ---");
        int[] largeArray = new int[10000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }
        int targetLarge = 9999;

        long startTime = System.nanoTime();
        int resultLinear = linearSearch(largeArray, targetLarge);
        long linearTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        int resultBinary = binarySearch(largeArray, targetLarge);
        long binaryTime = System.nanoTime() - startTime;

        System.out.println("Array con 10,000 elementos, buscando el último (9999):");
        System.out.println("Búsqueda lineal:  " + linearTime + " ns");
        System.out.println("Búsqueda binaria: " + binaryTime + " ns");
        System.out.println("Proporción: " + (linearTime / binaryTime) + "x más rápida");
    }

    /**
     * Implementación de búsqueda lineal
     * @param arr array a buscar
     * @param target elemento a encontrar
     * @return índice si encuentra, -1 si no
     */
    private static int linearSearch(int[] arr, int target) {
        System.out.println("Búsqueda lineal paso a paso:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  Verificando índice " + i + " (valor: " + arr[i] + ")");
            if (arr[i] == target) {
                System.out.println(" → ¡ENCONTRADO!");
                return i;
            }
            System.out.println();
        }
        return -1;
    }

    /**
     * Búsqueda lineal para strings
     */
    private static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Implementación de búsqueda binaria
     * @param arr array ORDENADO a buscar
     * @param target elemento a encontrar
     * @return índice si encuentra, -1 si no
     */
    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int iterations = 0;

        System.out.println("Búsqueda binaria paso a paso:");
        while (left <= right) {
            iterations++;
            int mid = left + (right - left) / 2;
            System.out.println("  Iteración " + iterations + ": left=" + left + 
                ", right=" + right + ", mid=" + mid + ", valor=" + arr[mid]);

            if (arr[mid] == target) {
                System.out.println("  ¡ENCONTRADO en " + iterations + " iteraciones!");
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("  No encontrado después de " + iterations + " iteraciones");
        return -1;
    }
}

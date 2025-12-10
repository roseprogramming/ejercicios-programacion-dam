package com.dam.programacion.arrays.search_and_sorting;

import java.util.Arrays;

/**
 * Algoritmos de ordenamiento de arrays
 * Incluye: Bubble Sort, Selection Sort, Insertion Sort, Quick Sort
 */
public class SortingExamples {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("📊 ALGORITMOS DE ORDENAMIENTO (SORTING)");
        System.out.println("=".repeat(60));

        demoBubbleSort();
        demoSelectionSort();
        demoInsertionSort();
        demoQuickSort();
        demoJavaBuiltInSort();
    }

    /**
     * Bubble Sort: compara elementos adyacentes
     * Complejidad: O(n²)
     * Ventaja: fácil de entender
     */
    private static void demoBubbleSort() {
        System.out.println("\n\n1️⃣  BUBBLE SORT");
        System.out.println("-".repeat(60));

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

    /**
     * Selection Sort: encuentra el mínimo y lo coloca al inicio
     * Complejidad: O(n²)
     */
    private static void demoSelectionSort() {
        System.out.println("\n\n2️⃣  SELECTION SORT");
        System.out.println("-".repeat(60));

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

    /**
     * Insertion Sort: construye el array ordenado elemento a elemento
     * Complejidad: O(n²) pero más eficiente que bubble sort
     */
    private static void demoInsertionSort() {
        System.out.println("\n\n3️⃣  INSERTION SORT");
        System.out.println("-".repeat(60));

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

    /**
     * Quick Sort: divide y conquista
     * Complejidad: O(n log n) en promedio
     */
    private static void demoQuickSort() {
        System.out.println("\n\n4️⃣  QUICK SORT");
        System.out.println("-".repeat(60));

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

    /**
     * Método integrado de Java
     */
    private static void demoJavaBuiltInSort() {
        System.out.println("\n\n5️⃣  SORT INTEGRADO (Arrays.sort)");
        System.out.println("-".repeat(60));

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Array ordenado: " + Arrays.toString(arr));
        System.out.println("💡 Usa TimSort (mezcla de Merge Sort + Insertion Sort)");
    }

    /**
     * Implementación de Bubble Sort
     */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        System.out.println("\nPaso a paso:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            System.out.println("  Pasada " + (i + 1) + ": " + Arrays.toString(arr));
        }
        System.out.println("Total de intercambios: " + swaps);
    }

    /**
     * Implementación de Selection Sort
     */
    private static void selectionSort(int[] arr) {
        int n = arr.length;

        System.out.println("\nPaso a paso:");
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Intercambiar
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.println("  Pasada " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    /**
     * Implementación de Insertion Sort
     */
    private static void insertionSort(int[] arr) {
        int n = arr.length;

        System.out.println("\nPaso a paso:");
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.println("  Paso " + i + ": " + Arrays.toString(arr));
        }
    }

    /**
     * Implementación de Quick Sort
     */
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

package com.dam.programacion.arrays.search_and_sorting;

import java.util.Arrays;

/**
 * Operaciones con matrices (arrays 2D)
 * Incluye: suma, resta, transposición, multiplicación
 */
public class MatrixExamples {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("🔢 OPERACIONES CON MATRICES (2D Arrays)");
        System.out.println("=".repeat(60));

        demoMatrixCreation();
        demoMatrixTranspose();
        demoMatrixAddition();
        demoMatrixMultiplication();
    }

    /**
     * Creación y visualización de matrices
     */
    private static void demoMatrixCreation() {
        System.out.println("\n\n1️⃣  CREACIÓN Y VISUALIZACIÓN DE MATRICES");
        System.out.println("-".repeat(60));

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz 3×3:");
        printMatrix(matrix);

        System.out.println("\nAcceso a elementos:");
        System.out.println("matrix[0][0] = " + matrix[0][0]);
        System.out.println("matrix[1][1] = " + matrix[1][1]);
        System.out.println("matrix[2][2] = " + matrix[2][2]);

        System.out.println("\nDimensiones:");
        System.out.println("Filas: " + matrix.length);
        System.out.println("Columnas: " + matrix[0].length);

        // Tabla de multiplicar como matriz
        System.out.println("\n--- Tabla de multiplicar (5×5) ---");
        int[][] multiplicationTable = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        printMatrix(multiplicationTable);
    }

    /**
     * Transposición de matriz: cambia filas por columnas
     */
    private static void demoMatrixTranspose() {
        System.out.println("\n\n2️⃣  TRANSPOSICIÓN DE MATRIZ");
        System.out.println("-".repeat(60));

        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matriz original (2×3):");
        printMatrix(original);

        int[][] transposed = transpose(original);

        System.out.println("\nMatriz transpuesta (3×2):");
        printMatrix(transposed);
    }

    /**
     * Suma de matrices
     */
    private static void demoMatrixAddition() {
        System.out.println("\n\n3️⃣  SUMA DE MATRICES");
        System.out.println("-".repeat(60));

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        System.out.println("Matriz A:");
        printMatrix(matrixA);

        System.out.println("\nMatriz B:");
        printMatrix(matrixB);

        int[][] sum = addMatrices(matrixA, matrixB);

        System.out.println("\nA + B:");
        printMatrix(sum);
    }

    /**
     * Multiplicación de matrices
     */
    private static void demoMatrixMultiplication() {
        System.out.println("\n\n4️⃣  MULTIPLICACIÓN DE MATRICES");
        System.out.println("-".repeat(60));

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        System.out.println("Matriz A (2×3):");
        printMatrix(matrixA);

        System.out.println("\nMatriz B (3×2):");
        printMatrix(matrixB);

        int[][] product = multiplyMatrices(matrixA, matrixB);

        System.out.println("\nA × B (2×2):");
        printMatrix(product);

        System.out.println("\n💡 Regla: Si A es m×n y B es n×p, resultado es m×p");
    }

    /**
     * Transpone una matriz
     */
    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    /**
     * Suma dos matrices
     */
    private static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    /**
     * Multiplica dos matrices
     */
    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    /**
     * Imprime una matriz de forma legible
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d ", value);
            }
            System.out.println();
        }
    }
}

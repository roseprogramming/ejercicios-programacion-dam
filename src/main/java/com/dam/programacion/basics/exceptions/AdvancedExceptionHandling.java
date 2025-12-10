package com.dam.programacion.basics.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Manejo avanzado de excepciones en Java.
 * Demuestra:
 * - Multi-catch (capturar múltiples excepciones en un catch)
 * - Exception chaining (causa raíz de excepciones)
 * - Stack trace personalizado
 * - Re-lanzamiento de excepciones
 * 
 * @author Andrea Gicela Bravo Landeta (Github: @roseprogramming) Estudiante de DAM en ThePower
 * @version 1.0
 */
public class AdvancedExceptionHandling {

    /**
     * Demuestra multi-catch: un catch para múltiples tipos de excepción.
     * Disponible desde Java 7+
     */
    public static void demoMultiCatch() {
        System.out.println("\n1️⃣  MULTI-CATCH (Múltiples excepciones en un catch)");
        System.out.println("================================================");
        
        try {
            System.out.println("Intentando operaciones que pueden fallar...");
            
            int opcion = (int) (Math.random() * 3);
            switch (opcion) {
                case 0:
                    int[] arr = {1, 2, 3};
                    System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
                    break;
                case 1:
                    String str = null;
                    System.out.println(str.length()); // NullPointerException
                    break;
                case 2:
                    int division = 10 / 0; // ArithmeticException
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            // Un único catch maneja 3 tipos diferentes
            System.out.println("✓ Error capturado: " + e.getClass().getSimpleName());
            System.out.println("  Mensaje: " + e.getMessage());
        }
    }

    /**
     * Demuestra exception chaining (causa y efecto de excepciones).
     * Útil para contextualizar errores de bajo nivel en contexto de aplicación.
     */
    public static void demoExceptionChaining() {
        System.out.println("\n2️⃣  EXCEPTION CHAINING (Causa raíz de excepciones)");
        System.out.println("===================================================");
        
        try {
            try {
                // Simular error de bajo nivel
                int valor = Integer.parseInt("abc123");
            } catch (NumberFormatException e) {
                // Capturar y encadenar a excepción de aplicación
                throw new RuntimeException("Error procesando entrada del usuario: " + "abc123", e);
                //                        ↑ mensaje claro              ↑ causa (wrapped exception)
            }
        } catch (RuntimeException e) {
            System.out.println("✓ Excepción capturada: " + e.getClass().getSimpleName());
            System.out.println("  Mensaje: " + e.getMessage());
            System.out.println("  Causa raíz: " + e.getCause().getClass().getSimpleName());
            System.out.println("  Causa mensaje: " + e.getCause().getMessage());
        }
    }

    /**
     * Demuestra re-lanzamiento de excepciones con información adicional.
     */
    public static void demoRethrowingException() {
        System.out.println("\n3️⃣  RE-LANZAMIENTO DE EXCEPCIONES");
        System.out.println("==================================");
        
        try {
            intentarOperacionRiesgosa();
        } catch (Exception e) {
            System.out.println("✓ Excepción capturada en main:");
            System.out.println("  Tipo: " + e.getClass().getSimpleName());
            System.out.println("  Mensaje: " + e.getMessage());
        }
    }

    private static void intentarOperacionRiesgosa() throws Exception {
        try {
            // Operación que falla
            throw new FileNotFoundException("Archivo crítico no encontrado");
        } catch (FileNotFoundException e) {
            System.out.println("  [Nivel bajo] Capturado: " + e.getMessage());
            // Re-lanzar con contexto adicional
            Exception wrapper = new Exception("Operación falló en capa de datos", e);
            throw wrapper;
        }
    }

    /**
     * Demuestra finally y su uso garantizado.
     * El bloque finally SIEMPRE se ejecuta, incluso si hay return o throw.
     */
    public static void demoFinallyBlock() {
        System.out.println("\n4️⃣  BLOQUE FINALLY (Ejecución garantizada)");
        System.out.println("==========================================");
        
        String resultado = procesarConFinally("datos");
        System.out.println("✓ Resultado: " + resultado);
    }

    private static String procesarConFinally(String datos) {
        try {
            System.out.println("  Procesando: " + datos);
            if (datos.isEmpty()) {
                throw new IllegalArgumentException("Datos vacíos");
            }
            return "Éxito: " + datos;
        } catch (IllegalArgumentException e) {
            System.out.println("  Error: " + e.getMessage());
            return "Fallido";
        } finally {
            // Esto se ejecuta SIEMPRE, antes del return
            System.out.println("  ✓ Finally: Limpieza de recursos realizada");
        }
    }

    /**
     * Demuestra try-with-resources (AutoCloseable).
     * Automáticamente cierra recursos al salir del bloque.
     * Disponible desde Java 7+
     */
    public static void demoTryWithResources() {
        System.out.println("\n5️⃣  TRY-WITH-RESOURCES (Cierre automático)");
        System.out.println("==========================================");
        
        // Sin try-with-resources (manual):
        System.out.println("  Forma manual (antiguo):");
        Scanner scanner = new Scanner("1 2 3");
        try {
            System.out.println("    nextInt: " + scanner.nextInt());
        } finally {
            scanner.close(); // Debe cerrarse manualmente
        }
        
        // Con try-with-resources (moderno):
        System.out.println("  Forma con try-with-resources (Java 7+):");
        try (Scanner autoClose = new Scanner("4 5 6")) {
            System.out.println("    nextInt: " + autoClose.nextInt());
            // Se cierra automáticamente al salir del bloque
        }
        System.out.println("  ✓ Recurso cerrado automáticamente");
    }

    /**
     * Demuestra stack trace y análisis de errores.
     */
    public static void demoStackTrace() {
        System.out.println("\n6️⃣  STACK TRACE (Rastreo de la pila de llamadas)");
        System.out.println("================================================");
        
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("✓ Excepción capturada:");
            System.out.println("  Tipo: " + e.getClass().getSimpleName());
            System.out.println("  Mensaje: " + e.getMessage());
            System.out.println("\n  Stack trace:");
            
            // Obtener todos los elementos de la pila
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i = 0; i < stackTrace.length && i < 5; i++) {
                StackTraceElement ste = stackTrace[i];
                System.out.printf("    [%d] %s.%s (línea %d)%n",
                    i,
                    ste.getClassName(),
                    ste.getMethodName(),
                    ste.getLineNumber()
                );
            }
        }
    }

    private static void metodo1() throws Exception {
        metodo2();
    }

    private static void metodo2() throws Exception {
        metodo3();
    }

    private static void metodo3() throws Exception {
        throw new RuntimeException("Error originado en metodo3");
    }

    /**
     * Demuestra creación de excepciones personalizadas avanzadas.
     */
    public static void demoCustomExceptions() {
        System.out.println("\n7️⃣  EXCEPCIONES PERSONALIZADAS AVANZADAS");
        System.out.println("========================================");
        
        try {
            validarCredenciales("", "password123");
        } catch (CredentialException e) {
            System.out.println("✓ Error de autenticación: " + e.getMessage());
            System.out.println("  Campo problemático: " + e.getInvalidField());
            System.out.println("  Código error: " + e.getErrorCode());
        }
    }

    private static void validarCredenciales(String username, String password) 
            throws CredentialException {
        if (username.isEmpty()) {
            throw new CredentialException(
                "El nombre de usuario no puede estar vacío",
                "username",
                "EMPTY_USERNAME"
            );
        }
    }

    /**
     * Excepción personalizada con información adicional.
     */
    static class CredentialException extends Exception {
        private String invalidField;
        private String errorCode;

        public CredentialException(String message, String field, String code) {
            super(message);
            this.invalidField = field;
            this.errorCode = code;
        }

        public String getInvalidField() {
            return invalidField;
        }

        public String getErrorCode() {
            return errorCode;
        }
    }

    /**
     * Demuestra supresión de excepciones (Java 7+).
     */
    public static void demoSuppressedExceptions() {
        System.out.println("\n8️⃣  EXCEPCIONES SUPRIMIDAS (Suppressed)");
        System.out.println("========================================");
        
        try {
            try {
                throw new RuntimeException("Error principal");
            } finally {
                try {
                    throw new IOException("Error en finally");
                } catch (IOException e) {
                    // En Java 7+, el error de finally se "suprime" (no anula el principal)
                }
            }
        } catch (RuntimeException e) {
            System.out.println("✓ Error capturado: " + e.getMessage());
            System.out.println("  (El error del finally se mantuvo oculto)");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("🎯 MANEJO AVANZADO DE EXCEPCIONES EN JAVA");
        System.out.println("═".repeat(50));

        demoMultiCatch();
        demoExceptionChaining();
        demoRethrowingException();
        demoFinallyBlock();
        demoTryWithResources();
        demoStackTrace();
        demoCustomExceptions();
        demoSuppressedExceptions();

        System.out.println("\n" + "═".repeat(50));
        System.out.println("✅ Demostración completada");
        System.out.println("═".repeat(50));
    }
}

package com.dam.programacion.basics.operators;

/**
 * Clase que demuestra el uso de operadores en Java.
 * Incluye operadores aritméticos, lógicos, relacionales y de asignación.
 * 
 * @author Andrea Gicela Bravo Landeta (Github: @roseprogramming) Estudiante de DAM en ThePower
 * @version 1.0
 */
public class Operators {
    
    /**
     * Demuestra operadores aritméticos: +, -, *, /, %
     */
    public static void demostracionOperadoresAritmeticos() {
        System.out.println("\n========== OPERADORES ARITMÉTICOS ==========");
        
        int a = 20;
        int b = 5;
        
        System.out.println("Variables: a = " + a + ", b = " + b);
        System.out.println("Suma (a + b): " + (a + b));
        System.out.println("Resta (a - b): " + (a - b));
        System.out.println("Multiplicación (a * b): " + (a * b));
        System.out.println("División (a / b): " + (a / b));
        System.out.println("Módulo/Resto (a % b): " + (a % b));
    }
    
    /**
     * Demuestra operadores de asignación: =, +=, -=, *=, /=, %=
     */
    public static void demostracionOperadoresAsignacion() {
        System.out.println("\n========== OPERADORES DE ASIGNACIÓN ==========");
        
        int valor = 10;
        System.out.println("Valor inicial: " + valor);
        
        valor += 5;  // valor = valor + 5
        System.out.println("Después de += 5: " + valor);
        
        valor -= 3;  // valor = valor - 3
        System.out.println("Después de -= 3: " + valor);
        
        valor *= 2;  // valor = valor * 2
        System.out.println("Después de *= 2: " + valor);
        
        valor /= 4;  // valor = valor / 4
        System.out.println("Después de /= 4: " + valor);
        
        valor %= 3;  // valor = valor % 3
        System.out.println("Después de %= 3: " + valor);
    }
    
    /**
     * Demuestra operadores incremento/decremento: ++, --
     */
    public static void demostracionOperadoresIncremento() {
        System.out.println("\n========== OPERADORES INCREMENTO/DECREMENTO ==========");
        
        int contador = 5;
        System.out.println("Valor inicial: " + contador);
        
        contador++;  // Post-incremento
        System.out.println("Después de contador++ (post-incremento): " + contador);
        
        ++contador;  // Pre-incremento
        System.out.println("Después de ++contador (pre-incremento): " + contador);
        
        contador--;  // Post-decremento
        System.out.println("Después de contador-- (post-decremento): " + contador);
        
        --contador;  // Pre-decremento
        System.out.println("Después de --contador (pre-decremento): " + contador);
        
        // Diferencia entre pre y post
        System.out.println("\n--- Diferencia Pre vs Post ---");
        int x = 5;
        System.out.println("int x = 5;");
        System.out.println("System.out.println(x++); // Imprime: " + x + " (post-incremento)");
        x = 5;
        System.out.println("System.out.println(++x); // Imprime: " + (++x) + " (pre-incremento)");
    }
    
    /**
     * Demuestra operadores relacionales: ==, !=, <, >, <=, >=
     */
    public static void demostracionOperadoresRelacionales() {
        System.out.println("\n========== OPERADORES RELACIONALES ==========");
        
        int x = 10;
        int y = 20;
        
        System.out.println("Variables: x = " + x + ", y = " + y);
        System.out.println("x == y: " + (x == y));  // false
        System.out.println("x != y: " + (x != y));  // true
        System.out.println("x < y: " + (x < y));    // true
        System.out.println("x > y: " + (x > y));    // false
        System.out.println("x <= y: " + (x <= y));  // true
        System.out.println("x >= y: " + (x >= y));  // false
    }
    
    /**
     * Demuestra operadores lógicos: &&, ||, !
     */
    public static void demostracionOperadoresLogicos() {
        System.out.println("\n========== OPERADORES LÓGICOS ==========");
        
        boolean a = true;
        boolean b = false;
        
        System.out.println("Variables: a = " + a + ", b = " + b);
        
        // AND (&&)
        System.out.println("\n--- AND (&&) ---");
        System.out.println("a && b: " + (a && b));      // false
        System.out.println("a && true: " + (a && true)); // true
        System.out.println("false && false: " + (false && false)); // false
        
        // OR (||)
        System.out.println("\n--- OR (||) ---");
        System.out.println("a || b: " + (a || b));      // true
        System.out.println("false || false: " + (false || false)); // false
        System.out.println("true || false: " + (true || false));   // true
        
        // NOT (!)
        System.out.println("\n--- NOT (!) ---");
        System.out.println("!a: " + (!a));  // false
        System.out.println("!b: " + (!b));  // true
        System.out.println("!(a && b): " + (!(a && b)));  // true
    }
    
    /**
     * Demuestra operadores bit a bit: &, |, ^, ~, <<, >>
     */
    public static void demostracionOperadoresBit() {
        System.out.println("\n========== OPERADORES BIT A BIT ==========");
        
        int x = 5;   // 0101 en binario
        int y = 3;   // 0011 en binario
        
        System.out.println("Variables: x = " + x + " (binario: " + Integer.toBinaryString(x) + ")");
        System.out.println("          y = " + y + " (binario: " + Integer.toBinaryString(y) + ")");
        
        System.out.println("\nAND bit a bit (x & y): " + (x & y) + " (binario: " + Integer.toBinaryString(x & y) + ")");
        System.out.println("OR bit a bit (x | y): " + (x | y) + " (binario: " + Integer.toBinaryString(x | y) + ")");
        System.out.println("XOR bit a bit (x ^ y): " + (x ^ y) + " (binario: " + Integer.toBinaryString(x ^ y) + ")");
        System.out.println("NOT bit a bit (~x): " + (~x));
        System.out.println("Desplazamiento izquierda (x << 1): " + (x << 1));
        System.out.println("Desplazamiento derecha (x >> 1): " + (x >> 1));
    }
    
    /**
     * Demuestra operador ternario: ? :
     */
    public static void demostracionOperadorTernario() {
        System.out.println("\n========== OPERADOR TERNARIO ==========");
        
        int edad = 25;
        String estado = edad >= 18 ? "Mayor de edad" : "Menor de edad";
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        
        int numero = 10;
        String tipo = numero % 2 == 0 ? "PAR" : "IMPAR";
        System.out.println("\nNúmero: " + numero);
        System.out.println("Tipo: " + tipo);
    }
    
    /**
     * Demuestra precedencia de operadores.
     */
    public static void demostracionPrecedencia() {
        System.out.println("\n========== PRECEDENCIA DE OPERADORES ==========");
        
        int resultado1 = 2 + 3 * 4;  // Multiplicación primero
        int resultado2 = (2 + 3) * 4; // Paréntesis primero
        
        System.out.println("2 + 3 * 4 = " + resultado1 + " (multiplicación primero)");
        System.out.println("(2 + 3) * 4 = " + resultado2 + " (paréntesis primero)");
        
        boolean resultado3 = true && false || true;  // && tiene mayor precedencia que ||
        boolean resultado4 = (true && false) || true;
        
        System.out.println("\ntrue && false || true = " + resultado3);
        System.out.println("(true && false) || true = " + resultado4);
    }
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║    OPERADORES EN JAVA - DEMOSTRACIÓN   ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        demostracionOperadoresAritmeticos();
        demostracionOperadoresAsignacion();
        demostracionOperadoresIncremento();
        demostracionOperadoresRelacionales();
        demostracionOperadoresLogicos();
        demostracionOperadoresBit();
        demostracionOperadorTernario();
        demostracionPrecedencia();
        
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║     FIN DE LA DEMOSTRACIÓN             ║");
        System.out.println("╚════════════════════════════════════════╝");
    }
}

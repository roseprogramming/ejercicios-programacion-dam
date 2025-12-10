package com.dam.programacion.basics.operators;

/**
 * Demostración de todos los tipos de operadores en Java
 * Categorías: Aritméticos, Lógicos, Relacionales, Bitwise, Asignación
 */
public class OperatorExamples {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("➕ OPERADORES EN JAVA");
        System.out.println("=".repeat(60));

        demoArithmeticOperators();
        demoRelationalOperators();
        demoLogicalOperators();
        demoAssignmentOperators();
        demoBitwiseOperators();
        demoStringConcatenation();
    }

    /**
     * Operadores aritméticos: +, -, *, /, %
     */
    private static void demoArithmeticOperators() {
        System.out.println("\n\n1️⃣  OPERADORES ARITMÉTICOS");
        System.out.println("-".repeat(60));

        int a = 15, b = 4;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println();

        System.out.println("Suma (a + b):       " + (a + b));
        System.out.println("Resta (a - b):      " + (a - b));
        System.out.println("Multiplicación (a * b): " + (a * b));
        System.out.println("División (a / b):   " + (a / b));
        System.out.println("Módulo (a % b):     " + (a % b));

        System.out.println("\nIncremento y decremento:");
        int counter = 10;
        System.out.println("counter = " + counter);
        System.out.println("++counter (pre-incremento): " + (++counter));
        System.out.println("counter++ (post-incremento): " + (counter++));
        System.out.println("Valor actual: " + counter);
        System.out.println("--counter (pre-decremento): " + (--counter));
    }

    /**
     * Operadores relacionales: ==, !=, <, >, <=, >=
     */
    private static void demoRelationalOperators() {
        System.out.println("\n\n2️⃣  OPERADORES RELACIONALES");
        System.out.println("-".repeat(60));

        int x = 20, y = 15;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println();

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y:  " + (x > y));
        System.out.println("x < y:  " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        System.out.println("\nComparación de strings:");
        String name1 = "Juan";
        String name2 = "Juan";
        String name3 = new String("Juan");
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name1.equals(name3): " + name1.equals(name3));
        System.out.println("name1 == name3 (referencia): " + (name1 == name3));
    }

    /**
     * Operadores lógicos: &&, ||, !
     */
    private static void demoLogicalOperators() {
        System.out.println("\n\n3️⃣  OPERADORES LÓGICOS");
        System.out.println("-".repeat(60));

        boolean p = true, q = false;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println();

        System.out.println("AND (p && q): " + (p && q));
        System.out.println("OR  (p || q): " + (p || q));
        System.out.println("NOT (!p):     " + (!p));
        System.out.println("NOT (!q):     " + (!q));

        System.out.println("\nCombinaciones complejas:");
        int age = 25;
        boolean hasLicense = true;
        boolean insurance = true;

        if (age >= 18 && hasLicense && insurance) {
            System.out.println("✅ Puede conducir");
        } else {
            System.out.println("❌ No puede conducir");
        }

        System.out.println("\nCorto-circuito (short-circuit):");
        System.out.println("true || false (false no se evalúa): " + (true || false));
        System.out.println("false && true (true no se evalúa): " + (false && true));
    }

    /**
     * Operadores de asignación: =, +=, -=, *=, /=, %=
     */
    private static void demoAssignmentOperators() {
        System.out.println("\n\n4️⃣  OPERADORES DE ASIGNACIÓN");
        System.out.println("-".repeat(60));

        int value = 10;
        System.out.println("value inicial: " + value);
        System.out.println();

        value += 5;
        System.out.println("Después de += 5:  " + value);

        value -= 3;
        System.out.println("Después de -= 3:  " + value);

        value *= 2;
        System.out.println("Después de *= 2:  " + value);

        value /= 4;
        System.out.println("Después de /= 4:  " + value);

        value %= 3;
        System.out.println("Después de %= 3:  " + value);
    }

    /**
     * Operadores bitwise: &, |, ^, ~, <<, >>, >>>
     */
    private static void demoBitwiseOperators() {
        System.out.println("\n\n5️⃣  OPERADORES BITWISE (a nivel de bits)");
        System.out.println("-".repeat(60));

        int m = 5;    // 0101 en binario
        int n = 3;    // 0011 en binario
        System.out.println("m = " + m + " (binario: " + Integer.toBinaryString(m) + ")");
        System.out.println("n = " + n + " (binario: " + Integer.toBinaryString(n) + ")");
        System.out.println();

        System.out.println("AND (m & n):  " + (m & n) + " (binario: " + 
            Integer.toBinaryString(m & n) + ")");
        System.out.println("OR  (m | n):  " + (m | n) + " (binario: " + 
            Integer.toBinaryString(m | n) + ")");
        System.out.println("XOR (m ^ n):  " + (m ^ n) + " (binario: " + 
            Integer.toBinaryString(m ^ n) + ")");
        System.out.println("NOT (~m):     " + (~m));

        System.out.println("\nDesplazamientos bitwise:");
        System.out.println("m << 1 (desplazar izquierda):  " + (m << 1));
        System.out.println("m >> 1 (desplazar derecha):    " + (m >> 1));
    }

    /**
     * Concatenación de strings
     */
    private static void demoStringConcatenation() {
        System.out.println("\n\n6️⃣  CONCATENACIÓN DE STRINGS");
        System.out.println("-".repeat(60));

        String firstName = "Juan";
        String lastName = "García";
        System.out.println("Usando +: " + firstName + " " + lastName);

        System.out.println("Usando concat(): " + firstName.concat(" ").concat(lastName));

        String message = "El resultado es: " + 5 + 3;
        System.out.println(message);

        String result = "El resultado es: " + (5 + 3);
        System.out.println(result);

        System.out.println("\nFormateo con format():");
        String formatted = String.format("Nombre: %s, Edad: %d, Promedio: %.2f", 
            "María", 28, 8.5);
        System.out.println(formatted);
    }
}

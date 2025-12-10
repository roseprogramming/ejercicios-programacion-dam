package com.dam.programacion.basics.control_structures;

/**
 * Demostración de estructuras condicionales: if-else, switch
 * Conceptos: Decisiones lógicas y ramificación de código
 */
public class ConditionalExamples {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("📊 ESTRUCTURAS CONDICIONALES EN JAVA");
        System.out.println("=".repeat(60));

        // Ejemplo 1: if-else simple
        demoIfElse();

        // Ejemplo 2: if-else anidado
        demoNestedIfElse();

        // Ejemplo 3: switch-case
        demoSwitch();

        // Ejemplo 4: ternario
        demoTernaryOperator();
    }

    /**
     * Demuestra if-else simple
     */
    private static void demoIfElse() {
        System.out.println("\n\n1️⃣  IF-ELSE SIMPLE");
        System.out.println("-".repeat(60));

        int age = 25;
        System.out.println("Edad: " + age);

        if (age < 18) {
            System.out.println("❌ Eres menor de edad");
        } else if (age < 65) {
            System.out.println("✅ Eres adulto");
        } else {
            System.out.println("🧓 Eres jubilado");
        }

        // Ejemplo con números
        double score = 75.5;
        System.out.println("\nNota: " + score);

        if (score >= 90) {
            System.out.println("📈 Sobresaliente");
        } else if (score >= 80) {
            System.out.println("📊 Notable");
        } else if (score >= 70) {
            System.out.println("📉 Aprobado");
        } else {
            System.out.println("❌ Reprobado");
        }
    }

    /**
     * Demuestra if-else anidado
     */
    private static void demoNestedIfElse() {
        System.out.println("\n\n2️⃣  IF-ELSE ANIDADO");
        System.out.println("-".repeat(60));

        int salary = 2500;
        String department = "IT";

        System.out.println("Salario: €" + salary);
        System.out.println("Departamento: " + department);

        if (salary > 2000) {
            System.out.println("✅ Salario alto");

            if (department.equals("IT")) {
                System.out.println("   💻 Departamento técnico - Bonus 15%");
            } else if (department.equals("HR")) {
                System.out.println("   👥 Departamento de RRHH - Bonus 10%");
            } else {
                System.out.println("   📊 Otro departamento - Bonus 5%");
            }
        } else {
            System.out.println("❌ Salario bajo");
            System.out.println("   📌 Requiere revisión");
        }
    }

    /**
     * Demuestra switch-case
     */
    private static void demoSwitch() {
        System.out.println("\n\n3️⃣  SWITCH-CASE");
        System.out.println("-".repeat(60));

        // Ejemplo 1: días de la semana
        int dayNumber = 3;
        System.out.println("Día número: " + dayNumber);

        switch (dayNumber) {
            case 1:
                System.out.println("📅 Lunes");
                break;
            case 2:
                System.out.println("📅 Martes");
                break;
            case 3:
                System.out.println("📅 Miércoles");
                break;
            case 4:
                System.out.println("📅 Jueves");
                break;
            case 5:
                System.out.println("📅 Viernes");
                break;
            case 6:
                System.out.println("🎉 Sábado");
                break;
            case 7:
                System.out.println("🎉 Domingo");
                break;
            default:
                System.out.println("❌ Día inválido");
        }

        // Ejemplo 2: menú con switch
        System.out.println("\n--- Ejemplo: Selección de operación ---");
        char operation = '+';
        int a = 10, b = 5;
        System.out.println("Operación: " + a + " " + operation + " " + b);

        switch (operation) {
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
            case '/':
                System.out.println("Resultado: " + (a / b));
                break;
            default:
                System.out.println("❌ Operación no válida");
        }
    }

    /**
     * Demuestra operador ternario
     */
    private static void demoTernaryOperator() {
        System.out.println("\n\n4️⃣  OPERADOR TERNARIO");
        System.out.println("-".repeat(60));

        int number = 42;
        String parity = (number % 2 == 0) ? "par" : "impar";
        System.out.println(number + " es " + parity);

        int grade = 75;
        String status = (grade >= 60) ? "✅ Aprobado" : "❌ Reprobado";
        System.out.println("Calificación: " + grade + " → " + status);

        String season = "summer";
        String clothes = switch (season) {
            case "summer" -> "👕 Camiseta y shorts";
            case "winter" -> "🧥 Abrigo y guantes";
            case "spring", "autumn" -> "👔 Chaqueta moderada";
            default -> "❓ Ropa normal";
        };
        System.out.println("Estación: " + season + " → " + clothes);
    }
}

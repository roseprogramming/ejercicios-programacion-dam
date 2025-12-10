package com.dam.programacion.poo.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Programa que demuestra el polimorfismo en Java.
 * 
 * Conceptos demostrados:
 * - Polimorfismo: Misma interfaz, múltiples implementaciones
 * - Method Override: Cada clase implementa los métodos a su forma
 * - Variables polimórficas: Referencias de tipo Shape apuntando a objetos específicos
 * 
 * Ejemplo clásico: Una lista de figuras geométricas donde cada una
 * implementa de forma diferente calcularArea() y calcularPerimetro()
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Main {
    
    /**
     * Método principal que demuestra polimorfismo.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        
        mostrarIntroduccion();
        
        // Crear figuras
        System.out.println("\n" + "=".repeat(50));
        System.out.println("CREANDO FIGURAS GEOMÉTRICAS");
        System.out.println("=".repeat(50) + "\n");
        
        // Variables polimórficas: tipo Shape, pero objetos específicos
        Shape figura1 = new Rectangle("Rectángulo 1", 5.0, 3.0);
        Shape figura2 = new Circle("Círculo 1", 4.0);
        Shape figura3 = new Triangle("Triángulo 1", 3.0, 4.0, 5.0);
        
        System.out.println("✓ Figuras creadas exitosamente");
        System.out.println("  - 1 Rectángulo");
        System.out.println("  - 1 Círculo");
        System.out.println("  - 1 Triángulo");
        
        // Usar polimorfismo con una lista
        List<Shape> figuras = new ArrayList<>();
        figuras.add(figura1);
        figuras.add(figura2);
        figuras.add(figura3);
        
        // Demostrar polimorfismo
        System.out.println("\n" + "=".repeat(50));
        System.out.println("POLIMORFISMO EN ACCIÓN");
        System.out.println("=".repeat(50) + "\n");
        System.out.println("Procesando todas las figuras con el mismo código:");
        System.out.println("for (Shape f : figuras) { f.mostrarInfo(); }\n");
        
        // Cada figura implementa mostrarInfo() a su forma
        for (Shape figura : figuras) {
            figura.mostrarInfo();
        }
        
        // Dibujar las figuras
        System.out.println("\n" + "=".repeat(50));
        System.out.println("DIBUJANDO LAS FIGURAS");
        System.out.println("=".repeat(50));
        
        for (Shape figura : figuras) {
            figura.dibujar();
        }
        
        // Cálculos específicos con cast
        System.out.println("\n" + "=".repeat(50));
        System.out.println("OPERACIONES ESPECÍFICAS (CON CAST)");
        System.out.println("=".repeat(50) + "\n");
        
        // Cast para usar métodos específicos de Rectangle
        System.out.println("RECTÁNGULO:");
        System.out.println("-".repeat(50));
        Rectangle rect = (Rectangle) figura1;
        System.out.println("Largo: " + rect.getLargo());
        System.out.println("Ancho: " + rect.getAncho());
        System.out.println("Área: " + String.format("%.2f", rect.calcularArea()));
        
        // Cast para usar métodos específicos de Circle
        System.out.println("\nCÍRCULO:");
        System.out.println("-".repeat(50));
        Circle circ = (Circle) figura2;
        System.out.println("Radio: " + circ.getRadio());
        System.out.println("Diámetro: " + String.format("%.2f", circ.calcularDiametro()));
        System.out.println("Área: " + String.format("%.2f", circ.calcularArea()));
        
        // Cast para usar métodos específicos de Triangle
        System.out.println("\nTRIÁNGULO:");
        System.out.println("-".repeat(50));
        Triangle trian = (Triangle) figura3;
        System.out.println("Tipo: " + trian.determinarTipo());
        System.out.println("Válido: " + (trian.esValido() ? "Sí ✓" : "No ✗"));
        System.out.println("Lados: " + trian.getLado1() + ", " + trian.getLado2() + ", " + trian.getLado3());
        System.out.println("Área: " + String.format("%.2f", trian.calcularArea()));
        
        // Demostrar beneficios del polimorfismo
        System.out.println("\n" + "=".repeat(50));
        System.out.println("BENEFICIOS DEL POLIMORFISMO");
        System.out.println("=".repeat(50));
        System.out.println("""
            1. CÓDIGO GENÉRICO: Una variable Shape puede apuntar a
               cualquier forma (Rectángulo, Círculo, Triángulo)
            
            2. EXTENSIBILIDAD: Podemos añadir nuevas figuras sin
               cambiar el código que usa Shape
            
            3. MANTENIBILIDAD: El código es más limpio y fácil de leer
            
            4. REUTILIZACIÓN: Una función que recibe Shape funciona
               con cualquier forma específica
            
            5. POLIMORFISMO REAL: Aunque figure1, figure2 y figure3
               son del tipo Shape, se comportan como sus tipos reales
               cuando se llama a calcularArea() o calcularPerimetro()
            
            EJEMPLO: calcularAreaTotal() trabaja con cualquier tipo de figura
            """);
        
        double areaTotal = calcularAreaTotal(figuras);
        System.out.println("Área total de todas las figuras: " + String.format("%.2f", areaTotal) + " unidades²");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * Muestra la introducción del programa.
     */
    private static void mostrarIntroduccion() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("  DEMOSTRACIÓN DE POLIMORFISMO");
        System.out.println("=".repeat(50));
        System.out.println("""
            El polimorfismo es uno de los pilares de la Programación
            Orientada a Objetos (POO). Permite que objetos de diferentes
            tipos compartan una interfaz común.
            
            En este ejemplo:
            - Shape es la clase base (abstracta)
            - Rectángulo, Círculo y Triángulo heredan de Shape
            - Cada una implementa calcularArea() de forma diferente
            - Podemos usar referencias de tipo Shape para cualquier forma
            
            Beneficio: Código flexible y fácil de mantener.
            """);
        System.out.println("=".repeat(50));
    }
    
    /**
     * Calcula el área total de una lista de figuras.
     * Demuestra el poder del polimorfismo: Esta función
     * funciona con cualquier tipo de figura.
     * 
     * @param figuras Lista de figuras
     * @return El área total
     */
    private static double calcularAreaTotal(List<Shape> figuras) {
        double areaTotal = 0;
        System.out.println("\nCalculando área total (usando polimorfismo):");
        System.out.println("-".repeat(50));
        
        for (Shape figura : figuras) {
            double area = figura.calcularArea();
            areaTotal += area;
            System.out.println(figura.getNombre() + ": " + String.format("%.2f", area) + " unidades²");
        }
        
        return areaTotal;
    }
}

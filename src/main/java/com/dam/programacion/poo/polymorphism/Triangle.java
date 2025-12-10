package com.dam.programacion.poo.polymorphism;

/**
 * Clase que representa un triángulo.
 * Implementa la clase abstracta Figura demostrando polimorfismo.
 * 
 * @author Andrea Gicela Bravo Landeta (Github: @roseprogramming) Estudiante de DAM en ThePower
 * @version 1.0
 */
public class Triangle extends Shape {
    
    private double lado1;
    private double lado2;
    private double lado3;
    
    /**
     * Constructor del triángulo.
     * @param nombre El nombre del triángulo
     * @param lado1 Longitud del primer lado
     * @param lado2 Longitud del segundo lado
     * @param lado3 Longitud del tercer lado
     */
    public Triangle(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * Calcula el área del triángulo usando la fórmula de Herón.
     * Fórmula: área = √[s(s-a)(s-b)(s-c)] donde s es el semiperímetro
     * @return El área del triángulo
     */
    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return Double.isNaN(area) ? 0 : area;
    }
    
    /**
     * Calcula el perímetro del triángulo.
     * Fórmula: perímetro = lado1 + lado2 + lado3
     * @return El perímetro del triángulo
     */
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    /**
     * Dibuja una representación ASCII del triángulo.
     */
    @Override
    public void dibujar() {
        System.out.println("\nDibujando " + nombre + ":");
        System.out.println("       △");
        System.out.println("      ╱ ╲");
        System.out.println("     ╱   ╲");
        System.out.println("    ╱─────╲");
    }
    
    /**
     * Obtiene el primer lado del triángulo.
     * @return Longitud del lado 1
     */
    public double getLado1() {
        return lado1;
    }
    
    /**
     * Obtiene el segundo lado del triángulo.
     * @return Longitud del lado 2
     */
    public double getLado2() {
        return lado2;
    }
    
    /**
     * Obtiene el tercer lado del triángulo.
     * @return Longitud del lado 3
     */
    public double getLado3() {
        return lado3;
    }
    
    /**
     * Establece el primer lado del triángulo.
     * @param lado1 La nueva longitud del lado 1
     */
    public void setLado1(double lado1) {
        if (lado1 > 0) {
            this.lado1 = lado1;
        }
    }
    
    /**
     * Establece el segundo lado del triángulo.
     * @param lado2 La nueva longitud del lado 2
     */
    public void setLado2(double lado2) {
        if (lado2 > 0) {
            this.lado2 = lado2;
        }
    }
    
    /**
     * Establece el tercer lado del triángulo.
     * @param lado3 La nueva longitud del lado 3
     */
    public void setLado3(double lado3) {
        if (lado3 > 0) {
            this.lado3 = lado3;
        }
    }
    
    /**
     * Determina el tipo de triángulo.
     * @return El tipo de triángulo (equilátero, isósceles, escaleno)
     */
    public String determinarTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    /**
     * Verifica si es un triángulo válido.
     * @return true si el triángulo es válido
     */
    public boolean esValido() {
        return (lado1 + lado2 > lado3) &&
               (lado2 + lado3 > lado1) &&
               (lado1 + lado3 > lado2);
    }
    
    /**
     * Representación en texto del triángulo.
     * @return Información del triángulo
     */
    @Override
    public String toString() {
        return String.format("Triángulo {nombre='%s', lados=[%.2f, %.2f, %.2f], tipo='%s', area=%.2f}",
                nombre, lado1, lado2, lado3, determinarTipo(), calcularArea());
    }
}

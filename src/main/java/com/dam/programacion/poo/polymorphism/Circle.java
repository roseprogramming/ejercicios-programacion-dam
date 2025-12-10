package com.dam.programacion.poo.polymorphism;

/**
 * Clase que representa un círculo.
 * Implementa la clase abstracta Figura demostrando polimorfismo.
 * 
 * @author Andrea Gicela Bravo Landeta (Github: @roseprogramming) Estudiante de DAM en ThePower
 * @version 1.0
 */
public class Circle extends Shape {
    
    private double radio;
    
    /**
     * Constructor del círculo.
     * @param nombre El nombre del círculo
     * @param radio El radio del círculo
     */
    public Circle(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    /**
     * Calcula el área del círculo.
     * Fórmula: área = π × r²
     * @return El área del círculo
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    /**
     * Calcula el perímetro (circunferencia) del círculo.
     * Fórmula: perímetro = 2 × π × r
     * @return El perímetro del círculo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    /**
     * Dibuja una representación ASCII del círculo.
     */
    @Override
    public void dibujar() {
        System.out.println("\nDibujando " + nombre + ":");
        System.out.println("     ███");
        System.out.println("   ██   ██");
        System.out.println("  █       █");
        System.out.println("  █       █");
        System.out.println("   ██   ██");
        System.out.println("     ███");
    }
    
    /**
     * Obtiene el radio del círculo.
     * @return El radio
     */
    public double getRadio() {
        return radio;
    }
    
    /**
     * Establece el radio del círculo.
     * @param radio El nuevo radio
     */
    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }
    
    /**
     * Calcula el diámetro del círculo.
     * @return El diámetro (2 × radio)
     */
    public double calcularDiametro() {
        return 2 * radio;
    }
    
    /**
     * Representación en texto del círculo.
     * @return Información del círculo
     */
    @Override
    public String toString() {
        return String.format("Círculo {nombre='%s', radio=%.2f, area=%.2f}",
                nombre, radio, calcularArea());
    }
}

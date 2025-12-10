package com.dam.programacion.poo.polymorphism;

/**
 * Clase base que demuestra polimorfismo por método Override.
 * Una misma interfaz (Figura) es implementada de diferentes formas
 * por diferentes clases especializadas.
 * 
 * @author Andrea Gicela Bravo Landeta (Github: @roseprogramming) Estudiante de DAM en ThePower
 * @version 1.0
 */
public abstract class Shape {
    
    protected String nombre;
    
    /**
     * Constructor de la clase abstracta Figura.
     * @param nombre El nombre de la figura
     */
    public Shape(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método abstracto que calcula el área.
     * Cada subclase lo implementa según su forma.
     * @return El área de la figura
     */
    public abstract double calcularArea();
    
    /**
     * Método abstracto que calcula el perímetro.
     * Cada subclase lo implementa según su forma.
     * @return El perímetro de la figura
     */
    public abstract double calcularPerimetro();
    
    /**
     * Método abstracto que dibuja la figura.
     * Cada subclase lo implementa de forma específica.
     */
    public abstract void dibujar();
    
    /**
     * Método concreto que muestra información de la figura.
     */
    public void mostrarInfo() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("  " + nombre.toUpperCase());
        System.out.println("=".repeat(40));
        System.out.println("Área:      " + String.format("%.2f", calcularArea()) + " unidades²");
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()) + " unidades");
        System.out.println("=".repeat(40));
    }
    
    /**
     * Obtiene el nombre de la figura.
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Representación en texto de la figura.
     * @return Información de la figura
     */
    @Override
    public String toString() {
        return String.format("%s {nombre='%s', area=%.2f, perimetro=%.2f}",
                this.getClass().getSimpleName(), nombre, calcularArea(), calcularPerimetro());
    }
}

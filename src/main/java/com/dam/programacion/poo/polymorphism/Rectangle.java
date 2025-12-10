package com.dam.programacion.poo.polymorphism;

/**
 * Clase que representa un rectángulo.
 * Implementa la clase abstracta Figura demostrando polimorfismo.
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Rectangle extends Shape {
    
    private double largo;
    private double ancho;
    
    /**
     * Constructor del rectángulo.
     * @param nombre El nombre del rectángulo
     * @param largo La longitud del lado largo
     * @param ancho La longitud del lado ancho
     */
    public Rectangle(String nombre, double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }
    
    /**
     * Calcula el área del rectángulo.
     * Fórmula: área = largo × ancho
     * @return El área del rectángulo
     */
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
    
    /**
     * Calcula el perímetro del rectángulo.
     * Fórmula: perímetro = 2 × (largo + ancho)
     * @return El perímetro del rectángulo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
    
    /**
     * Dibuja una representación ASCII del rectángulo.
     */
    @Override
    public void dibujar() {
        System.out.println("\nDibujando " + nombre + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("█ ");
            }
            System.out.println();
        }
    }
    
    /**
     * Obtiene el largo del rectángulo.
     * @return El largo
     */
    public double getLargo() {
        return largo;
    }
    
    /**
     * Obtiene el ancho del rectángulo.
     * @return El ancho
     */
    public double getAncho() {
        return ancho;
    }
    
    /**
     * Establece el largo del rectángulo.
     * @param largo El nuevo largo
     */
    public void setLargo(double largo) {
        if (largo > 0) {
            this.largo = largo;
        }
    }
    
    /**
     * Establece el ancho del rectángulo.
     * @param ancho El nuevo ancho
     */
    public void setAncho(double ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }
    
    /**
     * Representación en texto del rectángulo.
     * @return Información del rectángulo
     */
    @Override
    public String toString() {
        return String.format("Rectángulo {nombre='%s', largo=%.2f, ancho=%.2f, area=%.2f}",
                nombre, largo, ancho, calcularArea());
    }
}

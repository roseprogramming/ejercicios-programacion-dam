package com.dam.programacion.projects.superheroes;

/**
 * Clase abstracta que representa a un superhéroe
 * Define atributos comunes a todos los superhéroes
 *
 */
 abstract public class SuperHero {
    protected String nombre;
    private String identidadSecreta;

    /**
     * Constructor de la clase superhéroe
     * @param nombre del superhéroe
     * @param identidadSecreta
     */
    public SuperHero(String nombre, String identidadSecreta) {
        this.nombre = nombre;
        this.identidadSecreta = identidadSecreta;
    }
    public SuperHero() {}

    /**
     * Método que presenta al superhéroe mostrando su nombre e identidad
     */
    public void presentarse() {
        System.out.println("Soy: " + nombre + " y mi identidad Secreta es: " + identidadSecreta);
    }

    /**
     * Muestra información completa del superhéroe
     */
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Identidad Secreta: " + identidadSecreta);
    }

    /**
     * Método abstracto que cada superhéroe implementará para usar su poder único.
     */
    public abstract void usarPoder();
 }

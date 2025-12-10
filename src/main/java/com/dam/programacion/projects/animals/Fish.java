package com.dam.programacion.projects.animals;

/**
 * Clase que representa un pez.
 * Extiende de Animal y representa animales acuáticos que viven en el agua.
 * Los peces no vuelan ni picotean, solo nadan.
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Fish extends Animal {
    
    /**
     * Constructor con parámetros para inicializar el pez.
     * @param nombre El nombre del pez
     * @param edad La edad del pez en años
     * @param especie La especie del pez
     */
    public Fish(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }
    
    // Métodos abstractos implementados
    
    /**
     * Implementa el sonido característico del pez.
     * Los peces hacen burbujas en el agua.
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace burbujas: glu glu glu...");
    }

    /**
     * Implementa el método de reproducción para peces.
     */
    @Override
    public void reproducir() {
        System.out.println(getNombre() + " (Pez) se reproduce poniendo huevos en el agua.");
    }
    
    // Métodos propios del pez
    
    /**
     * Hace que el pez nade en el agua.
     */
    public void nadar() {
        System.out.println(getNombre() + " nada tranquilamente por el agua.");
    }
}

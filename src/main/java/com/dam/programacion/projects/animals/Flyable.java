package com.dam.programacion.projects.animals;

/**
 * Interfaz que define las capacidades de un animal volador.
 */
public interface Flyable {
    /** Altura maxima de vuelo en metros */
    int ALTURA_MAXIMA_VUELO = 1000;
    
    /**
     * El animal vuela.
     */
    void volar();
    
    /**
     * El animal aterriza.
     */
    void aterrizar();
    
    /**
     * El animal se cae.
     */
    void caerse();
}

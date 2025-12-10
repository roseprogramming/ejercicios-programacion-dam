package com.dam.programacion.projects.animals;

/**
 * Clase que representa un pájaro.
 * Extiende de Animal e implementa las interfaces Flyable y Picotear.
 * Los pájaros pueden volar, aterrizar, caerse y picotear.
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Bird extends Animal implements Flyable, Peck {
    
    /**
     * Constructor por defecto.
     */
    public Bird() {
        super();
    }
    
    /**
     * Constructor con parámetros para inicializar el pájaro.
     * @param nombre El nombre del pájaro
     * @param edad La edad del pájaro en años
     * @param especie La especie del pájaro
     */
    public Bird(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }
    
    // Métodos abstractos implementados
    
    /**
     * Implementa el método de reproducción para pájaros.
     */
    @Override
    public void reproducir() {
        System.out.println(getNombre() + " (Pájaro) se reproduce poniendo huevos en un nido.");
    }

    /**
     * Implementa el sonido característico del pájaro.
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " canta: ¡PÍO PÍO PÍO!");
    }
    
    // Métodos de la interfaz Picotear
    
    /**
     * Implementa la acción de picotear.
     */
    @Override
    public void picoteo() {
        System.out.println(getNombre() + " picotea semillas y miguitas de pan.");
    }
    
    // Métodos de la interfaz Volador
    
    /**
     * Implementa la acción de volar.
     */
    @Override
    public void volar() {
        System.out.println(getNombre() + " despliega sus alas y vuela muy alto en el cielo.");
    }
    
    /**
     * Implementa la acción de aterrizar.
     */
    @Override
    public void aterrizar() {
        System.out.println(getNombre() + " aterriza suavemente en una rama.");
    }
    
    /**
     * Implementa la acción de caerse.
     */
    @Override
    public void caerse() {
        System.out.println(getNombre() + " pierde el equilibrio y se cae del árbol. ¡PLAF!");
    }
}

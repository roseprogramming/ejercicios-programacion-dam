package com.dam.programacion.projects.animals;

/**
 * Clase que representa un mosquito.
 * Extiende de Animal e implementa las interfaces Flyable y Picotear.
 * Los mosquitos pueden volar, picar para alimentarse y son conocidos por ser molestos.
 * 
 * @author Andrea Gicela Bravo Landeta (Github: @roseprogramming) Estudiante de DAM en ThePower
 * @version 1.0
 */
public class Mosquito extends Animal implements Flyable, Peck {
    
    /**
     * Constructor con parámetros para inicializar el mosquito.
     * @param nombre El nombre del mosquito
     * @param edad La edad del mosquito
     * @param especie La especie del mosquito
     */
    public Mosquito(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }
    
    // Métodos abstractos implementados
    
    /**
     * Implementa el método de reproducción para mosquitos.
     */
    @Override
    public void reproducir() {
        System.out.println(getNombre() + " (Mosquito) pone cientos de huevos en agua estancada.");
    }

    /**
     * Implementa el sonido característico del mosquito.
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " zumba: ¡BZZZZZZZZ!");
    }
    
    // Métodos de la interfaz Picotear
    
    /**
     * Implementa la acción de picotear (picar para alimentarse de sangre).
     */
    @Override
    public void picoteo() {
        System.out.println(getNombre() + " te pica y extrae sangre. ¡Qué molesto!");
    }
    
    // Métodos de la interfaz Volador
    
    /**
     * Implementa la acción de volar.
     */
    @Override
    public void volar() {
        System.out.println(getNombre() + " vuela a tu alrededor zumbando y no te deja dormir.");
    }
    
    /**
     * Implementa la acción de aterrizar.
     */
    @Override
    public void aterrizar() {
        System.out.println(getNombre() + " aterriza silenciosamente en tu piel.");
    }
    
    /**
     * Implementa la acción de caerse.
     */
    @Override
    public void caerse() {
        System.out.println(getNombre() + " es golpeado y cae al suelo.");
    }
    
    // Métodos propios del mosquito
    
    /**
     * Simula la acción de eliminar al mosquito.
     */
    public void matarMosquito() {
        System.out.println("¡Has aplastado a " + getNombre() + "! Ya no molestará más.");
    }
}

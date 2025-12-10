package com.dam.programacion.projects.animals;

/**
 * Clase que representa un Gato.
 * Los gatos tienen 7 vidas y pueden maullar.
 */
public class Cat extends Animal {
    private int numVidas;
    
    /**
     * Constructor de Gato.
     * @param nombre Nombre del gato
     * @param edad Edad del gato
     * @param color Color del pelaje
     */
    public Cat(String nombre, int edad, String color) {
        super(nombre, edad, color);
        this.numVidas = 7;
    }

    // Métodos abstractos implementados
    
    /**
     * Implementa el sonido característico del gato.
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡MIAU MIAU!");
    }

    /**
     * Implementa el método de reproducción para gatos.
     */
    @Override
    public void reproducir() {
        System.out.println(getNombre() + " (Gato) se reproduce de forma vivípara teniendo gatitos.");
    }
    
    // Getters y Setters
    
    /**
     * Obtiene el número de vidas restantes del gato.
     * @return El número de vidas
     */
    public int getNumVidas() {
        return numVidas;
    }
    
    /**
     * Establece el número de vidas del gato.
     * @param numVidas El nuevo número de vidas
     */
    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }

    // Métodos propios del gato
    
    /**
     * Hace que el gato arañe.
     */
    public void aranyar() {
        System.out.println(getNombre() + " te araña: ¡SCRATCH!");
    }
    
    /**
     * Hace que el gato ronronee.
     */
    public void ronronear() {
        System.out.println(getNombre() + " ronronea: purrr purrr...");
    }
    
    /**
     * Reduce en una unidad el número de vidas del gato.
     * Si llega a cero, el gato ha agotado sus vidas.
     */
    public void restarVidas() {
        if (numVidas > 0) {
            this.numVidas--;
            System.out.println(getNombre() + " ha perdido una vida. Vidas restantes: " + numVidas);
            if (numVidas == 0) {
                System.out.println("¡" + getNombre() + " ha agotado todas sus vidas!");
            }
        } else {
            System.out.println(getNombre() + " no tiene más vidas.");
        }
    }
}

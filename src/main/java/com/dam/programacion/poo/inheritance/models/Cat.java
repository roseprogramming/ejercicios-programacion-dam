package com.dam.programacion.poo.inheritance.models;

import java.util.Random;

/**
 * Clase que representa un gato, extiende la clase Animal.
 * Implementa comportamientos específicos de los gatos.
 * 
 * Características:
 * - Hacer sonido: "¡Miau miau!"
 * - Jugar: Solo juega si está de buen humor
 * - Acicalar: Comportamiento específico del gato
 * - Humor variable: Afecta su disposición a jugar
 * 
 * @author [Tu nombre]
 * @version 2.0
 */
public class Cat extends Animal {
    
    // Atributos específicos del gato
    private boolean tieneHumorParaJugar;
    private int nivelAfeccion;
    private String color;
    
    /**
     * Constructor con nombre del gato.
     * El humor se define aleatoriamente.
     * @param nombre El nombre del gato
     */
    public Cat(String nombre) {
        super(nombre);
        this.tieneHumorParaJugar = new Random().nextBoolean();
        this.nivelAfeccion = 50;
        this.color = "Desconocido";
    }
    
    /**
     * Constructor completo del gato.
     * @param nombre El nombre del gato
     * @param edad La edad en años
     * @param color El color del pelaje
     */
    public Cat(String nombre, int edad, String color) {
        super(nombre, edad);
        this.tieneHumorParaJugar = new Random().nextBoolean();
        this.nivelAfeccion = 50;
        this.color = color;
    }
    
    // ==================== GETTERS ====================
    
    /**
     * Verifica si el gato tiene humor para jugar.
     * @return true si tiene humor, false en caso contrario
     */
    public boolean isTieneHumorParaJugar() {
        return tieneHumorParaJugar;
    }
    
    /**
     * Obtiene el nivel de afección del gato.
     * @return Nivel de afección (0-100)
     */
    public int getNivelAfeccion() {
        return nivelAfeccion;
    }
    
    /**
     * Obtiene el color del pelaje.
     * @return El color del gato
     */
    public String getColor() {
        return color;
    }
    
    // ==================== SETTERS ====================
    
    /**
     * Establece el humor del gato.
     * @param tieneHumorParaJugar true si tiene humor
     */
    public void setTieneHumorParaJugar(boolean tieneHumorParaJugar) {
        this.tieneHumorParaJugar = tieneHumorParaJugar;
    }
    
    /**
     * Establece el nivel de afección.
     * @param nivelAfeccion Nuevo nivel (se ajusta entre 0-100)
     */
    public void setNivelAfeccion(int nivelAfeccion) {
        this.nivelAfeccion = Math.max(0, Math.min(100, nivelAfeccion));
    }
    
    /**
     * Establece el color del pelaje.
     * @param color El nuevo color
     */
    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        }
    }
    
    // ==================== MÉTODOS IMPLEMENTADOS ====================
    
    /**
     * El gato hace su sonido característico.
     */
    @Override
    public void hacerSonido() {
        if (tieneHumorParaJugar) {
            System.out.println(nombre + " dice: ¡Miau miau! 😸");
        } else {
            System.out.println(nombre + " dice: Miau... (desinteresado) 😒");
        }
    }
    
    /**
     * El gato juega con otro animal, pero solo si está de buen humor.
     * @param otro El animal con el que jugar
     */
    @Override
    public void jugarCon(Animal otro) {
        if (energia < 20) {
            System.out.println(nombre + " está descansando, no quiere jugar");
            return;
        }
        
        System.out.println("\n" + nombre + " (gato) reacciona a " + otro.nombre);
        
        if (!tieneHumorParaJugar) {
            System.out.println(nombre + " no está de humor y se va a dormir");
            System.out.println(nombre + " salta elegantemente hacia la ventana");
            dormir();
            return;
        }
        
        energia -= 8;
        otro.energia -= 3;
        nivelAfeccion = Math.min(100, nivelAfeccion + 5);
        
        if (otro instanceof Puppy) {
            System.out.println(nombre + " juega cautelosamente con " + otro.nombre);
            System.out.println(nombre + " extiende sus garras de forma juguetona");
            otro.hacerSonido();
        } else if (otro instanceof Bird) {
            System.out.println(nombre + " intenta cazar a " + otro.nombre);
            System.out.println(nombre + ": ¿Ese es mi almuerzo?");
            otro.hacerSonido();
        } else if (otro instanceof Cat) {
            System.out.println(nombre + " juega con " + otro.nombre + " de manera elegante");
            otro.hacerSonido();
        } else {
            System.out.println(nombre + " juega con " + otro.nombre);
            otro.hacerSonido();
        }
    }
    
    /**
     * El gato se acicala (comportamiento típico de los gatos).
     */
    public void acicalar() {
        System.out.println(nombre + " se está acicalando cuidadosamente");
        System.out.println(nombre + ": *pasa la lengua por las patas* *se limpia la cara*");
        nivelAfeccion = Math.min(100, nivelAfeccion + 10);
    }
    
    /**
     * El gato muestra afección al humano.
     */
    public void mostrarAfeccion() {
        if (nivelAfeccion > 70) {
            System.out.println(nombre + " ronronea y se frota contra tus patas: prrrr prrrr");
        } else if (nivelAfeccion > 40) {
            System.out.println(nombre + " te ignora pero permanece cerca");
        } else {
            System.out.println(nombre + " se aleja desinteresado");
        }
    }
    
    /**
     * Cambia el humor del gato aleatoriamente.
     */
    public void cambiarHumor() {
        tieneHumorParaJugar = new Random().nextBoolean();
        String estado = tieneHumorParaJugar ? "está de buen humor" : "está de mal humor";
        System.out.println(nombre + " " + estado);
    }
    
    /**
     * Muestra información detallada del gato.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("\n" + "=".repeat(45));
        System.out.println("  INFORMACIÓN DE " + nombre.toUpperCase() + " (GATO)");
        System.out.println("=".repeat(45));
        System.out.println("Nombre:           " + nombre);
        System.out.println("Edad:             " + edad + " años");
        System.out.println("Color:            " + color);
        System.out.println("Energía:          " + generarBarraProgreso(energia) + " (" + energia + "/100)");
        System.out.println("Humor:            " + (tieneHumorParaJugar ? "De buen humor 😸" : "De mal humor 😾"));
        System.out.println("Afección:         " + generarBarraProgreso(nivelAfeccion) + " (" + nivelAfeccion + "/100)");
        System.out.println("=".repeat(45) + "\n");
    }
    
    /**
     * Representación en texto del gato.
     * @return Información del gato
     */
    @Override
    public String toString() {
        return String.format("Gato {nombre='%s', edad=%d, color='%s', energia=%d, afeccion=%d}",
                nombre, edad, color, energia, nivelAfeccion);
    }
}

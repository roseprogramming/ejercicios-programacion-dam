package com.dam.programacion.poo.inheritance.models;

/**
 * Clase que representa un perro pequeño, extiende la clase Animal.
 * Implementa comportamientos específicos de los perros.
 * 
 * Características:
 * - Hacer sonido: "¡Guau guau!"
 * - Jugar: Interacciona de diferentes formas con otros animales
 * - Traer: Comportamiento específico de los perros
 * 
 * @author [Tu nombre]
 * @version 2.0
 */
public class Puppy extends Animal {
    
    // Atributos específicos del perro
    private String raza;
    private boolean adiestramiento;
    
    /**
     * Constructor con nombre del perro.
     * @param nombre El nombre del perrito
     */
    public Puppy(String nombre) {
        super(nombre);
        this.raza = "Mixta";
        this.adiestramiento = false;
    }
    
    /**
     * Constructor completo del perro.
     * @param nombre El nombre del perrito
     * @param edad La edad en años
     * @param raza La raza del perrito
     */
    public Puppy(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
        this.adiestramiento = false;
    }
    
    // ==================== GETTERS ====================
    
    /**
     * Obtiene la raza del perro.
     * @return La raza
     */
    public String getRaza() {
        return raza;
    }
    
    /**
     * Verifica si el perro está adiestrado.
     * @return true si está adiestrado, false en caso contrario
     */
    public boolean isAdiestramiento() {
        return adiestramiento;
    }
    
    // ==================== SETTERS ====================
    
    /**
     * Establece la raza del perro.
     * @param raza La nueva raza
     */
    public void setRaza(String raza) {
        if (raza != null && !raza.isEmpty()) {
            this.raza = raza;
        }
    }
    
    /**
     * Establece el estado de adiestramiento.
     * @param adiestramiento true si está adiestrado
     */
    public void setAdiestramiento(boolean adiestramiento) {
        this.adiestramiento = adiestramiento;
    }
    
    // ==================== MÉTODOS IMPLEMENTADOS ====================
    
    /**
     * El perro hace su sonido característico.
     */
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
    
    /**
     * El perro juega con otro animal, con comportamiento específico según el tipo.
     * @param otro El animal con el que jugar
     */
    @Override
    public void jugarCon(Animal otro) {
        if (energia < 20) {
            System.out.println(nombre + " está muy cansado para jugar");
            return;
        }
        
        energia -= 10;
        otro.energia -= 5;
        
        System.out.println("\n" + nombre + " (perro) está intentando jugar con " + otro.nombre);
        
        if (otro instanceof Cat) {
            System.out.println(nombre + ": ¡Guau! ¿Quieres jugar?");
            System.out.println(otro.nombre + " (gato) arquea la espalda desconfiado...");
            otro.hacerSonido();
        } else if (otro instanceof Bird) {
            System.out.println(nombre + " intenta saltar para alcanzar a " + otro.nombre);
            System.out.println(otro.nombre + " (pájaro) se asusta y vuela rápidamente");
            otro.hacerSonido();
        } else if (otro instanceof Puppy) {
            System.out.println(nombre + " y " + otro.nombre + " juegan alegremente");
            otro.hacerSonido();
        } else {
            System.out.println(nombre + " quiere jugar con " + otro.nombre);
            otro.hacerSonido();
        }
    }
    
    /**
     * El perro trae un objeto (comportamiento típico de perros).
     */
    public void traer() {
        if (energia >= 10) {
            energia -= 10;
            System.out.println(nombre + " trae la pelota alegremente: ¡guau!");
        } else {
            System.out.println(nombre + " está muy cansado para traer la pelota");
        }
    }
    
    /**
     * El perro recibe adiestramiento.
     */
    public void adiestrar() {
        if (!adiestramiento) {
            adiestramiento = true;
            System.out.println(nombre + " está siendo adiestrado...");
            System.out.println(nombre + " ha aprendido nuevos comandos: Siéntate, Ven, Trae");
        } else {
            System.out.println(nombre + " ya está adiestrado");
        }
    }
    
    /**
     * Muestra información detallada del perro.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("\n" + "=".repeat(45));
        System.out.println("  INFORMACIÓN DE " + nombre.toUpperCase() + " (PERRO)");
        System.out.println("=".repeat(45));
        System.out.println("Nombre:           " + nombre);
        System.out.println("Edad:             " + edad + " años");
        System.out.println("Raza:             " + raza);
        System.out.println("Energía:          " + generarBarraProgreso(energia) + " (" + energia + "/100)");
        System.out.println("Adiestrado:       " + (adiestramiento ? "Sí ✓" : "No ✗"));
        System.out.println("=".repeat(45) + "\n");
    }
    
    /**
     * Representación en texto del perro.
     * @return Información del perro
     */
    @Override
    public String toString() {
        return String.format("Perrito {nombre='%s', edad=%d, raza='%s', energia=%d, adiestrado=%b}",
                nombre, edad, raza, energia, adiestramiento);
    }
}

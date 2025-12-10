package com.dam.programacion.projects.superheroes;

/**
 * Clase que representa a Hulk.
 * Hereda de SuperHeroe e implementa ArtesMarciales.
 * Hulk es un superheroe con una fuerza incrementable y dificil de controlar.
 */
public class Hulk extends SuperHero implements MartialArts {
    private int nivelRabia = 50;
    private int fuerzaBase = 150;
    
    /**
     * Constructor de Hulk.
     * 
     * @param nombre Nombre del superheroe (Hulk)
     * @param identidadSecreta Identidad secreta (Bruce Banner)
     */
    public Hulk(String nombre, String identidadSecreta) {
        super(nombre, identidadSecreta);
    }

    @Override
    public void usarPoder() {
        System.out.println("[Hulk] ¡RRRAAAARGH! Cuanta mas rabia tengo, mas fuerte me vuelvo. Mi fuerza es ilimitada.");
        System.out.println("Nivel de rabia: " + nivelRabia + "%");
    }
    
    /**
     * Incrementa el nivel de rabia de Hulk aumentando su fuerza.
     */
    public void incrementarRabia() {
        if (nivelRabia < 100) {
            nivelRabia += 10;
            System.out.println(nombre + " esta cada vez mas furioso. Rabia: " + nivelRabia + "%");
        }
    }
    
    @Override
    public void pelear() {
        System.out.println(nombre + " pelea con una fuerza bruta descontrolada.");
    }
    
    @Override
    public void hacerPatada() {
        System.out.println(nombre + " propina una patada destructiva que causa un terremoto. ¡BOOM!");
    }
    
    @Override
    public void darPunetazo() {
        System.out.println(nombre + " golpea con ambos puños destruyendo todo a su paso. ¡CRASH!");
    }
    
    public int getNivelRabia() {
        return nivelRabia;
    }
    
    public int getFuerzaActual() {
        return (int)(fuerzaBase * (1 + nivelRabia / 100.0));
    }
}

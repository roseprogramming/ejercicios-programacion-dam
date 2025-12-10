package com.dam.programacion.projects.superheroes;

/**
 * Clase que representa a Superman.
 * Hereda de SuperHeroe e implementa Volar.
 * Superman es el superheroe mas poderoso con capacidades de vuelo y super fuerza.
 */
public class Superman extends SuperHero implements Fly {
    private int nivelFortaleza = 100;
    private double altitudVuelo = 0;
    
    /**
     * Constructor de Superman.
     * 
     * @param nombre Nombre del superheroe (Superman)
     * @param identidadSecreta Identidad secreta (Clark Kent)
     */
    public Superman(String nombre, String identidadSecreta) {
        super(nombre, identidadSecreta);
    }

    @Override
    public void usarPoder() {
        System.out.println("[Superman] Tengo todos los superpoderes! Puedo volar, tengo super fuerza y soy invulnerable.");
    }
    
    @Override
    public void volar() {
        altitudVuelo = 10000;
        System.out.println(nombre + " vuela a una altitud de " + altitudVuelo + " metros a velocidad supersonica.");
    }
    
    /**
     * Superman utiliza su super fuerza para levantar objetos pesados.
     * @param peso Peso del objeto en toneladas
     */
    public void usarSuperFuerza(double peso) {
        System.out.println(nombre + " levanta un objeto de " + peso + " toneladas sin esfuerzo.");
    }

    public int getNivelFortaleza() {
        return nivelFortaleza;
    }

    public void setNivelFortaleza(int nivelFortaleza) {
        this.nivelFortaleza = nivelFortaleza;
    }

    public double getAltitudVuelo() {
        return altitudVuelo;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}

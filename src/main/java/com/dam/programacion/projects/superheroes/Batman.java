package com.dam.programacion.projects.superheroes;

/**
 * Clase que representa a Batman.
 * Hereda de SuperHeroe e implementa ArtesMarciales.
 * Batman es un superheroe que utiliza habilidades de artes marciales y gadgets.
 */
public class Batman extends SuperHero implements MartialArts {
    private String vehiculo = "Batmovil";
    
    /**
     * Constructor de Batman.
     * 
     * @param nombre Nombre del superheroe (Batman)
     * @param identidadSecreta Identidad secreta (Bruce Wayne)
     */
    public Batman(String nombre, String identidadSecreta) {
        super(nombre, identidadSecreta);
    }

    @Override
    public void usarPoder() {
        System.out.println("[Batman] Soy millonario, traumatizado, inteligente y tengo gadgets increibles.");
    }

    @Override
    public void pelear() {
        System.out.println(nombre + " lucha contra el Joker con agilidad y estrategia.");
    }

    @Override
    public void hacerPatada() {
        System.out.println(nombre + " ejecuta una patada de artes marciales. ¡PAM!");
    }

    @Override
    public void darPunetazo() {
        System.out.println(nombre + " propina un puñetazo devastador. ¡POW!");
    }
    
    public String getVehiculo() {
        return vehiculo;
    }
}

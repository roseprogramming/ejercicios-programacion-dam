package com.dam.programacion.projects.superheroes;

/**
 * Clase que representa a Spiderman.
 * Hereda de SuperHeroe e implementa LanzarTelaraña y ArtesMarciales.
 * Spiderman tiene la habilidad de lanzar telaraña y utilizar artes marciales.
 */
public class Spiderman extends SuperHero implements ShootWeb, MartialArts {
    private int telarañasDisponibles = 100;
    private boolean sentidoAraña = true;

    /**
     * Constructor de Spiderman.
     * 
     * @param nombre Nombre del superheroe (Spiderman)
     * @param identidadSecreta Identidad secreta (Peter Parker)
     */
    public Spiderman(String nombre, String identidadSecreta) {
        super(nombre, identidadSecreta);
    }

    @Override
    public void usarPoder() {
        System.out.println("[Spiderman] Lanzo telaraña con precision y atrapo a los criminales. Mi sentido de araña me alerta del peligro.");
    }

    @Override
    public void colgarCamara() {
        System.out.println(nombre + " cuelga una camara para fotografiar la accion. ¡FLASH!");
    }

    @Override
    public void lanzarTelaraña() {
        if (telarañasDisponibles > 0) {
            telarañasDisponibles--;
            System.out.println(nombre + " lanza telaraña y atrapa al criminal. ¡WEBS! Telarañas restantes: " + telarañasDisponibles);
        } else {
            System.out.println(nombre + " se quedo sin telaraña. Necesita recargarse.");
        }
    }
    
    @Override
    public void volarEntreEdificios() {
        System.out.println(nombre + " vuela entre los edificios de Nueva York con su telaraña. ¡WHOOSH!");
    }
    
    @Override
    public void pelear() {
        System.out.println(nombre + " pelea en los tejados con agiles movimientos.");
    }
    
    @Override
    public void hacerPatada() {
        System.out.println(nombre + " ejecuta una patada giratoria. ¡KICK!");
    }
    
    @Override
    public void darPunetazo() {
        System.out.println(nombre + " propina un puñetazo rapido. ¡POW!");
    }
}

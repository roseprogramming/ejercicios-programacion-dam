package com.dam.programacion.projects.superheroes.application;

import com.dam.programacion.projects.superheroes.Batman;
import com.dam.programacion.projects.superheroes.Hulk;
import com.dam.programacion.projects.superheroes.Spiderman;
import com.dam.programacion.projects.superheroes.SuperHero;
import com.dam.programacion.projects.superheroes.Superman;

/**
 * Clase principal para demostrar el uso de los superheroes.
 * Muestra ejemplos de polimorfismo, herencia e interfaces.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("   DEMO DE SUPERHEROES - POLIMORFISMO EN JAVA");
        System.out.println("============================================\n");
        
        // Crear instancias de diferentes superheroes
        Superman superman = new Superman("Superman", "Clark Kent");
        Batman batman = new Batman("Batman", "Bruce Wayne");
        Spiderman spiderman = new Spiderman("Spiderman", "Peter Parker");
        Hulk hulk = new Hulk("Hulk", "Bruce Banner");
        
        // Array de superheroes para demostrar polimorfismo
        SuperHero[] heroes = {superman, batman, spiderman, hulk};
        
        System.out.println("--- INFORMACION DE LOS SUPERHEROES ---\n");
        for (SuperHero heroe : heroes) {
            heroe.mostrarInfo();
            heroe.usarPoder();
            System.out.println();
        }
        
        System.out.println("\n--- DEMOSTRACION DE HABILIDADES ESPECIFICAS ---\n");
        
        // Superman - Volar
        System.out.println(">>> SUPERMAN VOLANDO:");
        superman.volar();
        superman.usarSuperFuerza(500);
        System.out.println();
        
        // Batman - Artes Marciales
        System.out.println(">>> BATMAN EN COMBATE:");
        batman.pelear();
        batman.hacerPatada();
        batman.darPunetazo();
        System.out.println();
        
        // Spiderman - Telaraña y Artes Marciales
        System.out.println(">>> SPIDERMAN EN ACCION:");
        spiderman.lanzarTelaraña();
        spiderman.lanzarTelaraña();
        spiderman.volarEntreEdificios();
        spiderman.hacerPatada();
        System.out.println();
        
        // Hulk - Rabia y Fuerza
        System.out.println(">>> HULK ENOJADO:");
        hulk.incrementarRabia();
        hulk.incrementarRabia();
        System.out.println("Fuerza actual de Hulk: " + hulk.getFuerzaActual());
        hulk.pelear();
        hulk.darPunetazo();
        System.out.println();
        
        System.out.println("============================================");
        System.out.println("   FIN DE LA DEMOSTRACION");
        System.out.println("============================================");
    }
}

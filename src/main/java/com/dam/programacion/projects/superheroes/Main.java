package com.dam.programacion.projects.superheroes;

/**
 * Clase principal alternativa para demostrar el uso de los superheroes.
 * Muestra casting y uso de instanceof para verificar tipos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("   DEMO DE CASTING Y INSTANCEOF");
        System.out.println("============================================\n");
        
        // Array de SuperHero que demuestra polimorfismo
        SuperHero[] heroes = new SuperHero[4];
        
        Superman superman = new Superman("Superman", "Clark Kent");
        Batman batman = new Batman("Batman", "Bruce Wayne");
        Spiderman spiderman = new Spiderman("Spiderman", "Peter Parker");
        Hulk hulk = new Hulk("Hulk", "Bruce Banner");

        heroes[0] = superman;
        heroes[1] = batman;
        heroes[2] = spiderman;
        heroes[3] = hulk;
        
        // Demostrar polimorfismo con todos los heroes
        for (SuperHero heroe : heroes) {
            heroe.usarPoder();
            
            // Usar instanceof para ejecutar metodos especificos
            if (heroe instanceof Superman) {
                ((Superman) heroe).volar();
            } else if (heroe instanceof Batman) {
                ((Batman) heroe).pelear();
            } else if (heroe instanceof Spiderman) {
                ((Spiderman) heroe).lanzarTelaraña();
            } else if (heroe instanceof Hulk) {
                ((Hulk) heroe).incrementarRabia();
            }
            System.out.println();
        }
    }
}
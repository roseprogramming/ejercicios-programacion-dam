package com.dam.programacion.poo.inheritance;

import com.dam.programacion.poo.inheritance.models.Animal;
import com.dam.programacion.poo.inheritance.models.Bird;
import com.dam.programacion.poo.inheritance.models.Cat;
import com.dam.programacion.poo.inheritance.models.Puppy;

/**
 * Programa principal que demuestra los conceptos de herencia y polimorfismo.
 * 
 * Conceptos demostrados:
 * - Herencia: Las clases Puppy, Cat y Bird heredan de Animal
 * - Polimorfismo: Cada animal implementa hacerSonido() y jugarCon() diferente
 * - Métodos abstractos: Implementación de métodos abstractos en subclases
 * - Comportamiento específico: Cada animal tiene comportamientos únicos
 * 
 * @author [Tu nombre]
 * @version 2.0
 */
public class Main {
    
    /**
     * Método principal que crea animales y demuestra interacciones entre ellos.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        
        mostrarIntroduccion();
        
        // Crear animales
        System.out.println("\n" + "=".repeat(50));
        System.out.println("CREANDO ANIMALES...");
        System.out.println("=".repeat(50) + "\n");
        
        Animal miPerro = new Puppy("Pimpi", 3, "Labrador");
        Animal miGato = new Cat("Misu", 2, "Naranja");
        Animal miPajaro = new Bird("Piolín", 1, "Canario", 20.0);
        
        // Mostrar información de cada animal
        System.out.println("\n" + "=".repeat(50));
        System.out.println("INFORMACIÓN DE LOS ANIMALES");
        System.out.println("=".repeat(50));
        
        miPerro.mostrarInfo();
        miGato.mostrarInfo();
        miPajaro.mostrarInfo();
        
        // Demostrar sonidos
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SONIDOS DE LOS ANIMALES");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("El perro:");
        miPerro.hacerSonido();
        
        System.out.println("\nEl gato:");
        miGato.hacerSonido();
        
        System.out.println("\nEl pájaro:");
        miPajaro.hacerSonido();
        
        // Demostrar interacciones entre animales
        System.out.println("\n" + "=".repeat(50));
        System.out.println("INTERACCIONES ENTRE ANIMALES");
        System.out.println("=".repeat(50) + "\n");
        
        // Perro juega con Gato
        System.out.println("INTERACCIÓN 1: Perro juega con Gato");
        System.out.println("-".repeat(50));
        miPerro.jugarCon(miGato);
        
        // Gato juega con Perro
        System.out.println("\nINTERACCIÓN 2: Gato juega con Perro");
        System.out.println("-".repeat(50));
        miGato.jugarCon(miPerro);
        
        // Pájaro juega con Perro
        System.out.println("\nINTERACCIÓN 3: Pájaro juega con Perro");
        System.out.println("-".repeat(50));
        miPajaro.jugarCon(miPerro);
        
        // Gato juega con Pájaro
        System.out.println("\nINTERACCIÓN 4: Gato juega con Pájaro");
        System.out.println("-".repeat(50));
        miGato.jugarCon(miPajaro);
        
        // Demostrar métodos específicos
        System.out.println("\n" + "=".repeat(50));
        System.out.println("COMPORTAMIENTOS ESPECÍFICOS");
        System.out.println("=".repeat(50) + "\n");
        
        // Comportamiento del perro
        System.out.println("COMPORTAMIENTO DEL PERRO:");
        System.out.println("-".repeat(50));
        Puppy perro = (Puppy) miPerro;
        perro.traer();
        perro.adiestrar();
        
        // Comportamiento del gato
        System.out.println("COMPORTAMIENTO DEL GATO:");
        System.out.println("-".repeat(50));
        Cat gato = (Cat) miGato;
        gato.acicalar();
        gato.mostrarAfeccion();
        gato.cambiarHumor();
        
        // Comportamiento del pájaro
        System.out.println("COMPORTAMIENTO DEL PÁJARO:");
        System.out.println("-".repeat(50));
        Bird pajaro = (Bird) miPajaro;
        pajaro.cantar();
        pajaro.hacerNido();
        pajaro.volarAlto();
        
        // Mostrar estado final
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ESTADO FINAL DE LOS ANIMALES");
        System.out.println("=".repeat(50));
        
        miPerro.mostrarInfo();
        miGato.mostrarInfo();
        miPajaro.mostrarInfo();
        
        // Mostrar conclusión
        System.out.println("\n" + "=".repeat(50));
        System.out.println("CONCLUSIÓN");
        System.out.println("=".repeat(50));
        System.out.println("""
            Este programa demuestra:
            
            1. HERENCIA: Las clases Perrito, Gato y Pajaro heredan de Animal
               - Comparten atributos comunes (nombre, edad, energia)
               - Heredan métodos comunes (comer, dormir, envejecer)
            
            2. POLIMORFISMO: Cada animal implementa de forma distinta:
               - hacerSonido(): Cada uno hace su sonido característico
               - jugarCon(): Comportamiento diferente según el animal
            
            3. MÉTODOS ABSTRACTOS: Animal define métodos abstractos que
               todas las subclases deben implementar
            
            4. COMPORTAMIENTOS ESPECÍFICOS: Cada animal tiene:
               - Perro: traer(), adiestrar()
               - Gato: acicalar(), mostrarAfeccion()
               - Pájaro: cantar(), hacerNido(), volarAlto()
            
            Este es un ejemplo clásico de POO bien estructurada.
            """);
        System.out.println("=".repeat(50) + "\n");
    }
    
    /**
     * Muestra la introducción del programa.
     */
    private static void mostrarIntroduccion() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("  DEMOSTRACIÓN DE HERENCIA Y POLIMORFISMO");
        System.out.println("=".repeat(50));
        System.out.println("""
            Este programa crea tres animales diferentes:
            - Un Perro (Labrador llamado Pimpi)
            - Un Gato (Naranja llamado Misu)
            - Un Pájaro (Canario llamado Piolín)
            
            Demostraremos:
            • Comportamientos específicos de cada animal
            • Interacciones entre animales diferentes
            • Polimorfismo en acción
            • Métodos abstractos implementados
            """);
        System.out.println("=".repeat(50));
    }
}




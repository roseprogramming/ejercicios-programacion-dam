package com.dam.programacion.poo.inheritance.models;

/**
 * Clase que representa un pájaro, extiende la clase Animal.
 * Implementa comportamientos específicos de los pájaros.
 * 
 * Características:
 * - Hacer sonido: "¡Pío pío!"
 * - Jugar: Vuela cuando se asusta
 * - Volar: Comportamiento distintivo del pájaro
 * - Cantar: Emite melodías
 * - Anidar: Construye nidos
 * 
 * @author [Tu nombre]
 * @version 2.0
 */
public class Bird extends Animal {
    
    // Atributos específicos del pájaro
    private String especie;
    private double envergaduraAlas;
    private boolean puedeVolar;
    private int alturaVuelo;
    
    /**
     * Constructor con nombre del pájaro.
     * @param nombre El nombre del pájaro
     */
    public Bird(String nombre) {
        super(nombre);
        this.especie = "Gorrión";
        this.envergaduraAlas = 15.0;
        this.puedeVolar = true;
        this.alturaVuelo = 0;
    }
    
    /**
     * Constructor completo del pájaro.
     * @param nombre El nombre del pájaro
     * @param edad La edad en años
     * @param especie La especie del pájaro
     * @param envergaduraAlas Envergadura de las alas en cm
     */
    public Bird(String nombre, int edad, String especie, double envergaduraAlas) {
        super(nombre, edad);
        this.especie = especie;
        this.envergaduraAlas = envergaduraAlas;
        this.puedeVolar = true;
        this.alturaVuelo = 0;
    }
    
    // ==================== GETTERS ====================
    
    /**
     * Obtiene la especie del pájaro.
     * @return La especie
     */
    public String getEspecie() {
        return especie;
    }
    
    /**
     * Obtiene la envergadura de las alas.
     * @return Envergadura en cm
     */
    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }
    
    /**
     * Verifica si el pájaro puede volar.
     * @return true si puede volar
     */
    public boolean isPuedeVolar() {
        return puedeVolar;
    }
    
    /**
     * Obtiene la altura actual de vuelo.
     * @return Altura en metros
     */
    public int getAlturaVuelo() {
        return alturaVuelo;
    }
    
    // ==================== SETTERS ====================
    
    /**
     * Establece la especie del pájaro.
     * @param especie La nueva especie
     */
    public void setEspecie(String especie) {
        if (especie != null && !especie.isEmpty()) {
            this.especie = especie;
        }
    }
    
    /**
     * Establece la envergadura de las alas.
     * @param envergaduraAlas Nueva envergadura en cm
     */
    public void setEnvergaduraAlas(double envergaduraAlas) {
        if (envergaduraAlas > 0) {
            this.envergaduraAlas = envergaduraAlas;
        }
    }
    
    /**
     * Establece la capacidad de vuelo.
     * @param puedeVolar true si puede volar
     */
    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
    
    // ==================== MÉTODOS IMPLEMENTADOS ====================
    
    /**
     * El pájaro hace su sonido característico.
     */
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío! 🐦");
    }
    
    /**
     * El pájaro juega con otro animal, huyendo si se asusta.
     * @param otro El animal con el que interactuar
     */
    @Override
    public void jugarCon(Animal otro) {
        if (energia < 15) {
            System.out.println(nombre + " está muy cansado para jugar");
            return;
        }
        
        System.out.println("\n" + nombre + " (pájaro) percibe la presencia de " + otro.nombre);
        
        if (otro instanceof Puppy) {
            System.out.println(nombre + " se asusta del perro y vuela rápidamente");
            volarAlto();
            otro.hacerSonido();
        } else if (otro instanceof Cat) {
            System.out.println(nombre + " desconfía del gato y se mantiene en altura");
            volarMedio();
            otro.hacerSonido();
        } else if (otro instanceof Bird) {
            System.out.println(nombre + " canta alegremente con " + otro.nombre);
            energia -= 5;
            cantar();
            otro.hacerSonido();
        } else {
            System.out.println(nombre + " canta mientras juega con " + otro.nombre);
            cantar();
            otro.hacerSonido();
        }
    }
    
    /**
     * El pájaro vuela hacia el cielo.
     */
    public void volarAlto() {
        if (!puedeVolar || energia < 20) {
            System.out.println(nombre + " no puede volar en este momento");
            return;
        }
        alturaVuelo = 100;
        energia -= 15;
        System.out.println(nombre + " vuela alto en el cielo (altura: " + alturaVuelo + "m) ✈️");
    }
    
    /**
     * El pájaro vuela a altura media.
     */
    public void volarMedio() {
        if (!puedeVolar || energia < 10) {
            System.out.println(nombre + " no puede volar en este momento");
            return;
        }
        alturaVuelo = 50;
        energia -= 8;
        System.out.println(nombre + " vuela a altura media (altura: " + alturaVuelo + "m)");
    }
    
    /**
     * El pájaro aterriza.
     */
    public void aterrizar() {
        alturaVuelo = 0;
        System.out.println(nombre + " ha aterrizando suavemente");
    }
    
    /**
     * El pájaro canta alegremente.
     */
    public void cantar() {
        if (energia >= 5) {
            energia -= 5;
            System.out.println(nombre + " canta una bella melodía: ♪ ♫ ♪");
        } else {
            System.out.println(nombre + " no tiene energía para cantar");
        }
    }
    
    /**
     * El pájaro construye un nido.
     */
    public void hacerNido() {
        System.out.println(nombre + " está buscando materiales para construir un nido");
        System.out.println(nombre + ": *vuela buscando ramitas y paja*");
        if (energia >= 20) {
            energia -= 20;
            System.out.println(nombre + " ha construido un bonito nido 🏠");
        } else {
            System.out.println(nombre + " está muy cansado para continuar");
        }
    }
    
    /**
     * Muestra información detallada del pájaro.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("\n" + "=".repeat(45));
        System.out.println("  INFORMACIÓN DE " + nombre.toUpperCase() + " (PÁJARO)");
        System.out.println("=".repeat(45));
        System.out.println("Nombre:           " + nombre);
        System.out.println("Edad:             " + edad + " años");
        System.out.println("Especie:          " + especie);
        System.out.println("Envergadura:      " + envergaduraAlas + " cm");
        System.out.println("Energía:          " + generarBarraProgreso(energia) + " (" + energia + "/100)");
        System.out.println("Puede volar:      " + (puedeVolar ? "Sí ✓" : "No ✗"));
        System.out.println("Altura de vuelo:  " + alturaVuelo + " metros");
        System.out.println("=".repeat(45) + "\n");
    }
    
    /**
     * Representación en texto del pájaro.
     * @return Información del pájaro
     */
    @Override
    public String toString() {
        return String.format("Pajaro {nombre='%s', edad=%d, especie='%s', energia=%d, altura=%d}",
                nombre, edad, especie, energia, alturaVuelo);
    }
}

package com.dam.programacion.poo.inheritance.models;

/**
 * Clase abstracta que define la estructura base para todos los animales.
 * Implementa el concepto de herencia y polimorfismo en POO.
 * 
 * Esta clase establece un contrato que todas las subclases deben cumplir,
 * forzándolas a implementar métodos específicos como hacer sonidos y jugar.
 * 
 * Atributos:
 * - nombre: Nombre del animal
 * - edad: Edad en años
 * - energia: Nivel de energía (0-100)
 * 
 * @author [Tu nombre]
 * @version 2.0
 */
public abstract class Animal {
    
    // Atributos protegidos - Accesibles a subclases
    protected String nombre;
    protected int edad;
    protected int energia;
    
    // Constantes
    protected static final int ENERGIA_MAX = 100;
    protected static final int ENERGIA_MIN = 0;
    
    /**
     * Constructor de la clase Animal.
     * @param nombre El nombre del animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.energia = ENERGIA_MAX;
    }
    
    /**
     * Constructor completo del Animal.
     * @param nombre El nombre del animal
     * @param edad La edad en años
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.energia = ENERGIA_MAX;
    }
    
    // ==================== GETTERS ====================
    
    /**
     * Obtiene el nombre del animal.
     * @return El nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene la edad del animal.
     * @return La edad en años
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Obtiene el nivel de energía.
     * @return La energía actual (0-100)
     */
    public int getEnergia() {
        return energia;
    }
    
    // ==================== SETTERS ====================
    
    /**
     * Establece el nombre del animal.
     * @param nombre El nuevo nombre
     */
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
    
    /**
     * Establece la edad del animal.
     * @param edad La nueva edad (debe ser no negativa)
     */
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    /**
     * Establece el nivel de energía.
     * @param energia El nuevo nivel (se ajusta entre 0-100)
     */
    public void setEnergia(int energia) {
        this.energia = Math.max(ENERGIA_MIN, Math.min(ENERGIA_MAX, energia));
    }
    
    // ==================== MÉTODOS ABSTRACTOS ====================
    
    /**
     * Método abstracto que debe implementar cada animal.
     * Define el sonido característico que hace el animal.
     */
    public abstract void hacerSonido();
    
    /**
     * Método abstracto para que los animales jueguen entre sí.
     * @param otro El otro animal con el que jugar
     */
    public abstract void jugarCon(Animal otro);
    
    // ==================== MÉTODOS CONCRETOS ====================
    
    /**
     * El animal come, incrementando su energía.
     */
    public void comer() {
        energia = Math.min(ENERGIA_MAX, energia + 15);
        System.out.println(nombre + " está comiendo...");
    }
    
    /**
     * El animal duerme, recuperando toda su energía.
     */
    public void dormir() {
        energia = ENERGIA_MAX;
        System.out.println(nombre + " está durmiendo... zzzzZZZZzz");
    }
    
    /**
     * El animal envejece un año.
     */
    public void envejecer() {
        edad++;
        System.out.println(nombre + " ha cumplido " + edad + " años");
    }
    
    /**
     * Muestra información del animal.
     */
    public void mostrarInfo() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("  INFORMACIÓN DE " + nombre.toUpperCase());
        System.out.println("=".repeat(40));
        System.out.println("Nombre:       " + nombre);
        System.out.println("Edad:         " + edad + " años");
        System.out.println("Energía:      " + generarBarraProgreso(energia) + " (" + energia + "/100)");
        System.out.println("Tipo:         " + this.getClass().getSimpleName());
        System.out.println("=".repeat(40) + "\n");
    }
    
    /**
     * Genera una barra de progreso visual.
     * @param valor El valor actual (0-100)
     * @return Una representación visual con barras
     */
    protected String generarBarraProgreso(int valor) {
        int bloques = valor / 10;
        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            barra.append(i < bloques ? "█" : "░");
        }
        barra.append("]");
        return barra.toString();
    }
    
    /**
     * Representación en texto del animal.
     * @return Información del animal
     */
    @Override
    public String toString() {
        return String.format("%s {nombre='%s', edad=%d, energia=%d}",
                this.getClass().getSimpleName(), nombre, edad, energia);
    }
}


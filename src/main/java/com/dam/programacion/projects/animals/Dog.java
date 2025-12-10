package com.dam.programacion.projects.animals;

/**
 * Clase que representa un Perro.
 * Los perros tienen raza y pueden ladrar.
 */
public class Dog extends Animal {
    private String raza;
    private int numeroPatas;

    /**
     * Constructor basico de Perro.
     * @param nombre Nombre del perro
     * @param edad Edad del perro
     * @param color Color del pelaje
     */
    public Dog(String nombre, int edad, String color) {
        super(nombre, edad, color);
        this.raza = "Mestizo";
        this.numeroPatas = 4;
    }

    /**
     * Constructor completo de Perro con raza.
     * @param nombre Nombre del perro
     * @param edad Edad del perro
     * @param color Color del pelaje
     * @param raza Raza del perro
     */
    public Dog(String nombre, int edad, String color, String raza){
        super(nombre, edad, color);
        this.raza = raza;
        this.numeroPatas = 4;
    }

    /**
     * Constructor vacio con valores por defecto.
     */
    public Dog(){
        super("Thor", 0, "Blue");
        this.raza = "Mestizo";
        this.numeroPatas = 4;
    }

    // Métodos de la clase
    
    /**
     * Hace que el perro ladre.
     */
    public void ladrar() {
        System.out.println(getNombre() + " hace: ¡GUAU GUAU!");
    }

    // Métodos abstractos implementados
    
    /**
     * Implementa el método de reproducción para perros.
     */
    @Override
    public void reproducir() {
        System.out.println(getNombre() + " se reproduce como un perro vivíparo.");
    }
    
    /**
     * Implementa el sonido característico del perro.
     */
    @Override
    public void hacerSonido() {
        ladrar();
    }
    
    // Getters y Setters
    
    /**
     * Obtiene la raza del perro.
     * @return La raza del perro
     */
    public String getRaza() {
        return raza;
    }
    
    /**
     * Establece la raza del perro.
     * @param raza La nueva raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /**
     * Obtiene el número de patas del perro.
     * @return El número de patas (siempre 4)
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
}

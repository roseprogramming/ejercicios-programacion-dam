package com.dam.programacion.projects.animals;

/**
 * Clase abstracta que representa un Animal generico.
 * Define las caracteristicas basicas y comportamientos que todo animal debe tener.
 */
abstract public class Animal {
    protected String nombre;
    protected int edad;
    protected String color;

    /**
     * Constructor completo de Animal.
     * @param nombre Nombre del animal
     * @param edad Edad del animal en años
     * @param color Color del animal
     */
    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    
    /**
     * Constructor vacio de Animal.
     */
    public Animal(){}

    //SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * El animal respira.
     */
    public void respirar(){
        System.out.println(nombre + " esta respirando.");
    }

    /**
     * El animal come.
     */
    public void comer(){
        System.out.println(nombre + " esta comiendo.");
    }
    
    /**
     * Muestra informacion del animal.
     */
    public void presentarse(){
        System.out.println("Mi nombre es " + nombre + " | Edad: " + edad + " años | Color: " + color);
    }

    /**
     * Metodo abstracto para reproduccion del animal.
     */
    public abstract void reproducir();
    
    /**
     * Metodo abstracto para el sonido del animal.
     */
    public abstract void hacerSonido();
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{nombre='" + nombre + "', edad=" + edad + ", color='" + color + "'}";
    }
}

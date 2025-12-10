package com.dam.programacion.io.files.serializable;


import java.io.Serializable;

public class PersonSerializable implements Serializable {
    private String nombre;
    private int edad;

    public PersonSerializable(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
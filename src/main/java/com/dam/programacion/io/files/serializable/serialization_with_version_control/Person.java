package com.dam.programacion.io.files.serializable.serialization_with_version_control;


import java.io.Serializable;

public class Person implements Serializable {
    private String nombre;
    private int edad;

    public Person(String nombre, int edad) {
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
        return "Person{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
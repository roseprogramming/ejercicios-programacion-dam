package com.dam.programacion.projects.races.models;

abstract public class Runner {
    //ATRIBUTOS
    String nombre;
    int edad;
    String ciudad;
    double tiempoCarrera;


    //CONSTRUCTORES
    public Runner(String nombre, int edad, String ciudad, Double tiempoCarrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.tiempoCarrera = tiempoCarrera;
    }

    //METODOS
    public abstract void mostrarInformacion();
}

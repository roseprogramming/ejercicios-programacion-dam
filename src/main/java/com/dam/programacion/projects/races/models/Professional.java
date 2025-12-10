package com.dam.programacion.projects.races.models;

public class Professional extends Runner implements Training, Sponsorable {
    String patrocinador;

    public Professional(String nombre, int edad, String ciudad, double tiempoCarrera, String patrocinador) {
        super(nombre, edad, ciudad, tiempoCarrera);
        this.patrocinador = patrocinador;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Ciudad: " + ciudad + " | Tiempo de Carrera: " + tiempoCarrera) ;
        System.out.println("CATEGORIA: CORREDOR FEDERADO");
        System.out.println("Patrocinador: " + patrocinador);
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenamiento de profesional");

    }

    @Override
    public void estorbar() {
        System.out.println("Estorbo poco");
    }

    @Override
    public void doparse() {
        System.out.println("viva el EPO");

    }

    @Override
    public void mostrarPatrocinador() {
        System.out.println("Patrocinador: " + patrocinador);
    }
}

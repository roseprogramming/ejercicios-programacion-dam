package com.dam.programacion.projects.races.models;

public class JuniorRunner extends Professional{
    String categoriaEdad;
    public JuniorRunner(String nombre, int edad, String ciudad, double tiempoCarrera, String patrocinador, String categoriaEdad) {
        super(nombre, edad, ciudad, tiempoCarrera, patrocinador);
        this.categoriaEdad = categoriaEdad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre " + nombre + "| Edad + " + edad);
        System.out.println("Categoria JUVENIL | Rango edad " + categoriaEdad);
        mostrarPatrocinador();
    }
}

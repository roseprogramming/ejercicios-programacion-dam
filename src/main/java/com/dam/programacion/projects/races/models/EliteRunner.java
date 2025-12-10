package com.dam.programacion.projects.races.models;

public class EliteRunner extends Professional {
    public EliteRunner(String nombre, int edad, String ciudad, double tiempoCarrera, String patrocinador){
        super(nombre, edad, ciudad, tiempoCarrera, patrocinador);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    public void premidoGanado(double premio) {
        System.out.println("He ganado un premio de " + premio);
    }
}

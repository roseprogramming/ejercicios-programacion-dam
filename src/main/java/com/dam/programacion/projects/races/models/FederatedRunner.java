package com.dam.programacion.projects.races.models;

public class FederatedRunner extends Runner implements Training {

    String licenciaFederativa;

    public FederatedRunner(String nombre, int edad, String ciudad, double tiempoCarrera, String licenciaFederativa) {
        super(nombre, edad, ciudad, tiempoCarrera);
        this.licenciaFederativa = licenciaFederativa;
    }
@Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Ciudad: " + ciudad + " | Tiempo de Carrera: " + tiempoCarrera) ;
        System.out.println("CATEGORIA: CORREDOR FEDERADO");
        System.out.println("Licencia Federativa: " + licenciaFederativa);
    }

    @Override
    public void entrenar() {
        System.out.println("Entreno como un pro");
    }

    @Override
    public void estorbar() {
        System.out.println("Circulo por media de la carretera en filas de 5");
    }

    @Override
    public void doparse() {
        System.out.println("No me dopo");

    }
}

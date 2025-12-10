package com.dam.programacion.io.files.serializable.car_management;


//        Ejercicio: Serialización de Objetos Coche
//        Crea una clase llamada Coche con los siguientes atributos: marca, modelo y matricula.
//        Implementa la interfaz Serializable.
//        Crea 5 objetos de tipo Coche y guárdalos en un ArrayList.
//        Implementa dos métodos:
//        Uno para guardar la lista en un archivo llamado coches.dat.
//        Otro para leer ese archivo y mostrar los coches por consola.


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarManager {

    public static void main(String[] args) {
        ArrayList<Car> listaCoches = new ArrayList<>();

        // Crear 5 coches de ejemplo
        listaCoches.add(new Car("Toyota", "Corolla", "1234ABC"));
        listaCoches.add(new Car("Ford", "Focus", "5678DEF"));
        listaCoches.add(new Car("Honda", "Civic", "9012GHI"));
        listaCoches.add(new Car("Renault", "Clio", "3456JKL"));
        listaCoches.add(new Car("Volkswagen", "Golf", "7890MNO"));

        // Guardar en archivo
        guardarCoches(listaCoches, "coches.ser");

        // Leer del archivo
        ArrayList<Car> cochesLeidos = leerCoches("coches.ser");

        // Mostrar resultados
        System.out.println("Coches leídos desde archivo:");
        for (Car c : cochesLeidos) {
            System.out.println(c);
        }
    }

    public static void guardarCoches(ArrayList<Car> coches, String archivo) {
        //try with resources
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(coches);
            System.out.println(" Lista de coches guardada correctamente.");
        } catch (IOException e) {
            System.out.println(" Error al guardar coches: " + e.getMessage());
        }
    }

    public static ArrayList<Car> leerCoches(String archivo) {
        ArrayList<Car> coches = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            coches = (ArrayList<Car>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Error al leer coches: " + e.getMessage());
        }
        return coches;
    }
}


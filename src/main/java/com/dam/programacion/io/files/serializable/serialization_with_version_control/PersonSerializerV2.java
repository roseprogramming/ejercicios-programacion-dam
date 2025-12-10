package com.dam.programacion.io.files.serializable.serialization_with_version_control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonSerializerV2 {
    public static void main(String[] args) {

        Person[] personas = {
                new Person("Jose", 23),
                new Person("Ita", 18),
                new Person("Aihoe", 18)
        };
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            oos.writeObject(personas);
            System.out.println("Persona guardado");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        //Leemos
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            Person[] p2;
            p2 = (Person[]) ois.readObject();

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        for (Person persona : personas) {
            System.out.println(persona);
        }
    }
}

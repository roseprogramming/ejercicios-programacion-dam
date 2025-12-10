package com.dam.programacion.io.files.binary;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersonBinaryWriter {
    public static void main(String[] args) {
        Person[] personas = {
                new Person("Aaron", 18),
                new Person("Jose", 23),
                new Person("Marcos", 18)
        };
        String rutaArchivo = "personas.bin";
        //METODO PARA GUARDAR PERSONAS
        guardarPersonas(personas, rutaArchivo);

        //METODO PARA LEER PERSONAS
        leerPersonas(personas, rutaArchivo);

    }


    public static void guardarPersonas(Person[] personas, String rutaArchivo) {
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo);) {
            for (Person p : personas) {
                fos.write(p.getNombre().length());
                for (char c : p.getNombre().toCharArray()) {
                    fos.write(c);
                }
                //Edad. Ocupamos 4 bytes
                fos.write((p.getEdad() >> 24) & 0xFF);
                fos.write((p.getEdad() >> 16) & 0xFF);
                fos.write((p.getEdad() >> 8) & 0xFF);
                fos.write(p.getEdad() & 0xFF);
                System.out.println("Personas guardadas exitosamente");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }

    public static void leerPersonas(Person[] personas, String rutaArchivo) {
        StringBuilder nombre = new StringBuilder();
        char c;
        int edad;
        try (FileInputStream fis = new FileInputStream(rutaArchivo)) {
            while (fis.available() > 0) {
                //Leer longitud del nombre
                int longitud = fis.read();
                for (int i = 0; i < longitud; i++) {
                    c = (char) fis.read();
                    nombre.append(c);
                }
                //Leer edad
                edad = ( (fis.read() << 24) | (fis.read() << 16) | (fis.read() << 8) | (fis.read()) );
                Person p = new Person(nombre.toString(), edad);
                System.out.println(p);

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

    }
}

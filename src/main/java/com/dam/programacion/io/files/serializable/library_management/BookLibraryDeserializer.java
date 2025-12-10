package com.dam.programacion.io.files.serializable.library_management;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BookLibraryDeserializer {
    public static void main(String[] args) {
        ArrayList<Book> miBiblioteca;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("biblioteca.ser"))) {
            miBiblioteca = (ArrayList<Book>) ois.readObject();

            for (Book l : miBiblioteca) {
                System.out.println(l.toString());
            }

        }catch (IOException  | ClassNotFoundException e) {
            System.out.println("Error de lectura");
        }



    }
}

package com.dam.programacion.io.files.serializable.library_management;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookLibrarySerializer {
    public static void main(String[] args) {
        ArrayList<Book> miBiblioteca = new ArrayList<>();
        miBiblioteca.add(new Book("La guardia", "Terry Pratched", "Editorial 1"));
        miBiblioteca.add(new Book("Elocuent javascript", "asdf", "Editorial 2"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.ser"));) {
            oos.writeObject(miBiblioteca);
        }catch (IOException ioe) {
            System.out.println("Error de escritura");
        }
    }
}

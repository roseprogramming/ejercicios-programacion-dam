package com.dam.programacion.io.files.library;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LibrarySerializer {
    public static void main(String[] args) {
        ArrayList<Book> miBiblioteca = new ArrayList<>();
        miBiblioteca.add(new Book ("La guardia", "Terry Pratched","MundoDisco"));
        miBiblioteca.add( new Book ("Elocuent javascript","asdf","asd"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.ser"));) {
            oos.writeObject(miBiblioteca);
        }catch (IOException ioe) {
            System.out.println("Error de escritura");
        }
    }
}

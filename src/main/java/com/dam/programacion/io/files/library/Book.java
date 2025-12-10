package com.dam.programacion.io.files.library;
import java.io.Serializable;

public class Book implements Serializable {
    private String titulo;
    private String autor;
    private String editorial;

    public Book(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}

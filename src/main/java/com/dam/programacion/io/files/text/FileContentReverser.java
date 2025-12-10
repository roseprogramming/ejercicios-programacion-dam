package com.dam.programacion.io.files.text;
//INVERTIR EL CONTENIDO DE UN FICHERO.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileContentReverser {
    public static void main(String[] args) {
        StringBuilder texto = new StringBuilder();

        //LEEMOS EL CONTENIDO DEL ARCHIVO
        try (FileReader fr = new FileReader("entrada.txt")) {
            int c;
            while ( (c = fr.read()) != -1) {
                texto.append((char) c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        //INVERTIMOS EL CONTENIDO
        String textoConvertido = texto.reverse().toString();

        //ESCRIBIR EL CONTENIDO DE TEXTOCONVERTIDO EN OTRO FICHERO
        try (FileWriter fw = new FileWriter("salida.txt")) {
                fw.write(textoConvertido);
        } catch (IOException ioe) {
            System.out.println("Error al leer el fichero: " + ioe.getMessage());
            ioe.printStackTrace();
        }
        System.out.println("Contenido invertido en el fichero de salida");
    }
}

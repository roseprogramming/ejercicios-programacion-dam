package com.dam.programacion.io.files.text;
//CON BUFFER
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileReadWrite {
    public static void main(String[] args) {
        //ESCRIBIMOS CON BUFFER
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saludo.txt", true))) {
            bw.write("Hola");
            bw.newLine();
            bw.write("¿Como estáis?");
            bw.newLine();
            bw.write("LAS NOTAS IRAN BIEN***");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //LEEMOS UN FICHERO CON BUFFER

        try ( BufferedReader br = new BufferedReader(new FileReader("saludo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

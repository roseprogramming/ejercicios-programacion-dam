package com.dam.programacion.io.files.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("saludo.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("copiaSaludo.txt", true))
                ) {
                    String linea;

                    while ((linea = br.readLine()) != null) {
                        bw.write(linea);
                        bw.newLine();
                    }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

package com.dam.programacion.basics.exceptions;

import javax.swing.JOptionPane;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Ingrese el valor");

        try {
            int divisor = Integer.parseInt(userInput);
            int resultado = 10/divisor;
            System.out.println(resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Error diviendo por cero");

        } catch (NumberFormatException nfe) {
            System.out.println("Error no has introducido un entero");
        }

        //JOptionPane.showMessageDialog(null, "EL PROGRAMA FINALIZADO");



    }
}

package com.dam.programacion.poo.basic_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Programa principal que demuestra el uso de la clase Dog.
 * Implementa un simulador de mascotas interactivo con menú de opciones.
 * 
 * Funcionalidades:
 * - Crear nuevos perros
 * - Alimentar perros
 * - Jugar con perros
 * - Hacer dormir a los perros
 * - Ver estado de los perros
 * - Listar todos los perros
 * 
 * @author [Tu nombre]
 * @version 2.0
 */
public class Main {
    
    private static Scanner lector = new Scanner(System.in);
    private static List<Dog> perros = new ArrayList<>();
    
    /**
     * Método principal que ejecuta el simulador de mascotas.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        int opcion;
        
        mostrarBienvenida();
        
        // Ciclo principal del programa
        do {
            opcion = mostrarMenuPrincipal();
            
            switch (opcion) {
                case 1:
                    crearPerro();
                    break;
                case 2:
                    alimentarPerro();
                    break;
                case 3:
                    jugarConPerro();
                    break;
                case 4:
                    hacerDormirPerro();
                    break;
                case 5:
                    mostrarEstadoPerro();
                    break;
                case 6:
                    listarTodosLosPerros();
                    break;
                case 7:
                    mostrarEstadisticas();
                    break;
                case 8:
                    System.out.println("\n¡Gracias por jugar! Adiós 👋\n");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 8);
        
        lector.close();
    }
    
    /**
     * Muestra el mensaje de bienvenida.
     */
    private static void mostrarBienvenida() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("  BIENVENIDO AL SIMULADOR DE MASCOTAS 🐕");
        System.out.println("=".repeat(50));
        System.out.println("Crea y cuida de tus propios perros virtuales");
        System.out.println("=".repeat(50) + "\n");
    }
    
    /**
     * Muestra el menú principal y obtiene la opción del usuario.
     * @return La opción seleccionada
     */
    private static int mostrarMenuPrincipal() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  MENÚ PRINCIPAL");
        System.out.println("-".repeat(50));
        System.out.println("1. Crear un nuevo perro");
        System.out.println("2. Alimentar a un perro");
        System.out.println("3. Jugar con un perro");
        System.out.println("4. Hacer dormir a un perro");
        System.out.println("5. Ver estado de un perro");
        System.out.println("6. Listar todos los perros");
        System.out.println("7. Ver estadísticas");
        System.out.println("8. Salir");
        System.out.println("-".repeat(50));
        System.out.print("Selecciona una opción (1-8): ");
        
        int opcion = 0;
        try {
            opcion = lector.nextInt();
            lector.nextLine(); // Limpiar el buffer
        } catch (Exception e) {
            lector.nextLine(); // Limpiar el buffer en caso de error
            System.out.println("❌ Entrada inválida");
        }
        
        return opcion;
    }
    
    /**
     * Crea un nuevo perro y lo añade a la lista.
     */
    private static void crearPerro() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  CREAR NUEVO PERRO");
        System.out.println("-".repeat(50));
        
        System.out.print("¿Cómo quieres llamar al nuevo perro? ");
        String nombre = lector.nextLine().trim();
        
        if (nombre.isEmpty()) {
            System.out.println("❌ El nombre no puede estar vacío");
            return;
        }
        
        Dog nuevoPerro = new Dog(nombre);
        perros.add(nuevoPerro);
        
        System.out.println("✓ ¡Ha nacido un nuevo cachorro llamado " + nombre + "! 🐕");
        System.out.println("Total de perros: " + perros.size());
    }
    
    /**
     * Alimenta al perro seleccionado.
     */
    private static void alimentarPerro() {
        if (perros.isEmpty()) {
            System.out.println("❌ No hay perros. Crea uno primero.");
            return;
        }
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  ALIMENTAR A UN PERRO");
        System.out.println("-".repeat(50));
        
        Dog perro = seleccionarPerro();
        if (perro != null) {
            perro.comer();
        }
    }
    
    /**
     * Juega con el perro seleccionado.
     */
    private static void jugarConPerro() {
        if (perros.isEmpty()) {
            System.out.println("❌ No hay perros. Crea uno primero.");
            return;
        }
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  JUGAR CON UN PERRO");
        System.out.println("-".repeat(50));
        
        Dog perro = seleccionarPerro();
        if (perro != null) {
            perro.jugar();
        }
    }
    
    /**
     * Hace dormir al perro seleccionado.
     */
    private static void hacerDormirPerro() {
        if (perros.isEmpty()) {
            System.out.println("❌ No hay perros. Crea uno primero.");
            return;
        }
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  HACER DORMIR A UN PERRO");
        System.out.println("-".repeat(50));
        
        Dog perro = seleccionarPerro();
        if (perro != null) {
            perro.dormir();
        }
    }
    
    /**
     * Muestra el estado del perro seleccionado.
     */
    private static void mostrarEstadoPerro() {
        if (perros.isEmpty()) {
            System.out.println("❌ No hay perros. Crea uno primero.");
            return;
        }
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  ESTADO DE UN PERRO");
        System.out.println("-".repeat(50));
        
        Dog perro = seleccionarPerro();
        if (perro != null) {
            perro.mostrarEstado();
        }
    }
    
    /**
     * Lista todos los perros creados.
     */
    private static void listarTodosLosPerros() {
        if (perros.isEmpty()) {
            System.out.println("❌ No hay perros. Crea uno primero.");
            return;
        }
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  LISTA DE TODOS LOS PERROS (" + perros.size() + ")");
        System.out.println("-".repeat(50));
        
        for (int i = 0; i < perros.size(); i++) {
            System.out.println((i + 1) + ". " + perros.get(i).toString());
        }
    }
    
    /**
     * Muestra estadísticas generales de los perros.
     */
    private static void mostrarEstadisticas() {
        if (perros.isEmpty()) {
            System.out.println("❌ No hay perros. Crea uno primero.");
            return;
        }
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("  ESTADÍSTICAS");
        System.out.println("-".repeat(50));
        System.out.println("Total de perros: " + perros.size());
        
        int energiaTotal = 0;
        int hambreTotal = 0;
        
        for (Dog perro : perros) {
            energiaTotal += perro.getNivelEnergia();
            hambreTotal += perro.getNivelHambre();
        }
        
        double energiaPromedio = energiaTotal / (double) perros.size();
        double hambrePromedio = hambreTotal / (double) perros.size();
        
        System.out.println("Energía promedio: " + String.format("%.2f", energiaPromedio) + "/100");
        System.out.println("Hambre promedio: " + String.format("%.2f", hambrePromedio) + "/100");
        System.out.println("-".repeat(50));
    }
    
    /**
     * Permite al usuario seleccionar un perro de la lista.
     * @return El perro seleccionado o null si la selección es inválida
     */
    private static Dog seleccionarPerro() {
        System.out.println("\nPerros disponibles:");
        for (int i = 0; i < perros.size(); i++) {
            System.out.println((i + 1) + ". " + perros.get(i).getNombre());
        }
        
        System.out.print("Selecciona un perro (número): ");
        
        try {
            int indice = lector.nextInt() - 1;
            lector.nextLine(); // Limpiar el buffer
            
            if (indice >= 0 && indice < perros.size()) {
                return perros.get(indice);
            } else {
                System.out.println("❌ Selección inválida");
                return null;
            }
        } catch (Exception e) {
            lector.nextLine(); // Limpiar el buffer
            System.out.println("❌ Entrada inválida");
            return null;
        }
    }
}

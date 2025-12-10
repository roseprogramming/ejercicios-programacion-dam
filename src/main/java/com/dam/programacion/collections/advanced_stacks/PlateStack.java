package com.dam.programacion.collections.advanced_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Ejemplo práctico: Simulación de una pila de platos.
 * Demuestra cómo usar Deque como pila (LIFO - Last In First Out).
 * 
 * Concepto: El último plato que apilas es el primero que desapilas.
 */
public class PlateStack {
    private Deque<String> stack;
    private int capacity;

    /**
     * Constructor con capacidad máxima.
     *
     * @param capacity número máximo de platos que pueden estar apilados
     */
    public PlateStack(int capacity) {
        this.stack = new ArrayDeque<>();
        this.capacity = capacity;
    }

    /**
     * Apila un nuevo plato.
     *
     * @param plate descripción del plato
     * @return true si se agregó exitosamente
     */
    public boolean pushPlate(String plate) {
        if (isFull()) {
            System.out.println("❌ ¡Pila llena! No caben más platos.");
            return false;
        }
        stack.push(plate);
        System.out.println("📚 Plato apilado: " + plate + " (Total: " + stack.size() + ")");
        return true;
    }

    /**
     * Desapila el plato del tope.
     *
     * @return descripción del plato desapilado, null si está vacía
     */
    public String popPlate() {
        if (isEmpty()) {
            System.out.println("❌ ¡Pila vacía! No hay platos para desapilar.");
            return null;
        }
        String plate = stack.pop();
        System.out.println("📤 Plato desapilado: " + plate + " (Total: " + stack.size() + ")");
        return plate;
    }

    /**
     * Ve el plato del tope sin desapilarlo.
     *
     * @return descripción del plato del tope, null si está vacía
     */
    public String peekPlate() {
        if (isEmpty()) {
            System.out.println("⚠️  Pila vacía, no hay platos");
            return null;
        }
        return stack.peek();
    }

    /**
     * Verifica si la pila está vacía.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Verifica si la pila está llena.
     */
    public boolean isFull() {
        return stack.size() >= capacity;
    }

    /**
     * Obtiene la cantidad actual de platos.
     */
    public int getSize() {
        return stack.size();
    }

    /**
     * Muestra el contenido de la pila.
     */
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("\n📭 Pila vacía\n");
            return;
        }

        System.out.println("\n" + "=".repeat(40));
        System.out.println("📚 ESTADO ACTUAL DE LA PILA");
        System.out.println("=".repeat(40));
        
        int position = 1;
        for (String plate : stack) {
            System.out.println("[" + position + "] " + plate);
            position++;
        }
        
        System.out.println("Total de platos: " + stack.size() + "/" + capacity);
        System.out.println("=".repeat(40) + "\n");
    }

    /**
     * Vacía completamente la pila.
     */
    public void clearStack() {
        stack.clear();
        System.out.println("🧹 Pila vaciada");
    }
}

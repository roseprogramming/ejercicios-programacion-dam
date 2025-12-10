package com.dam.programacion.collections.advanced_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Simulación de navegador web con historial hacia atrás.
 * Demuestra el uso de Deque como pila para guardar el historial de navegación.
 * 
 * Concepto: Cada página visitada se guarda en una pila.
 * Cuando presionas "atrás", se desapila la última página.
 */
public class WebBrowser {
    private Deque<String> backHistory;
    private Deque<String> forwardHistory;
    private String currentPage;

    /**
     * Constructor que inicializa el navegador.
     *
     * @param initialPage página inicial
     */
    public WebBrowser(String initialPage) {
        this.backHistory = new ArrayDeque<>();
        this.forwardHistory = new ArrayDeque<>();
        this.currentPage = initialPage;
        System.out.println("🌐 Navegador iniciado en: " + currentPage);
    }

    /**
     * Navega a una nueva página.
     *
     * @param url dirección de la nueva página
     */
    public void visit(String url) {
        // Guardar página actual en el historial hacia atrás
        backHistory.push(currentPage);
        
        // Limpiar el historial hacia adelante cuando se visita una nueva página
        forwardHistory.clear();
        
        currentPage = url;
        System.out.println("📄 Visitando: " + currentPage);
    }

    /**
     * Navega hacia atrás en el historial.
     *
     * @return true si fue posible, false si no hay historial
     */
    public boolean goBack() {
        if (backHistory.isEmpty()) {
            System.out.println("⚠️  No hay páginas anteriores en el historial");
            return false;
        }

        // Guardar página actual en el historial hacia adelante
        forwardHistory.push(currentPage);
        
        // Restaurar página anterior
        currentPage = backHistory.pop();
        System.out.println("⬅️  Atrás: " + currentPage);
        return true;
    }

    /**
     * Navega hacia adelante en el historial.
     *
     * @return true si fue posible, false si no hay historial
     */
    public boolean goForward() {
        if (forwardHistory.isEmpty()) {
            System.out.println("⚠️  No hay páginas siguientes en el historial");
            return false;
        }

        // Guardar página actual en el historial hacia atrás
        backHistory.push(currentPage);
        
        // Restaurar página siguiente
        currentPage = forwardHistory.pop();
        System.out.println("➡️  Adelante: " + currentPage);
        return true;
    }

    /**
     * Obtiene la página actual.
     */
    public String getCurrentPage() {
        return currentPage;
    }

    /**
     * Obtiene el tamaño del historial hacia atrás.
     */
    public int getBackHistorySize() {
        return backHistory.size();
    }

    /**
     * Obtiene el tamaño del historial hacia adelante.
     */
    public int getForwardHistorySize() {
        return forwardHistory.size();
    }

    /**
     * Muestra el estado del navegador.
     */
    public void displayBrowserState() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("🌐 ESTADO DEL NAVEGADOR");
        System.out.println("=".repeat(50));
        
        System.out.println("📍 Página actual: " + currentPage);
        System.out.println("⬅️  Páginas anteriores: " + backHistory.size());
        System.out.println("➡️  Páginas siguientes: " + forwardHistory.size());
        
        if (!backHistory.isEmpty()) {
            System.out.println("\n📜 Últimas 3 páginas visitadas:");
            int count = 0;
            for (String page : backHistory) {
                System.out.println("   - " + page);
                count++;
                if (count >= 3) break;
            }
        }
        
        System.out.println("=".repeat(50) + "\n");
    }

    /**
     * Limpia el historial completo.
     */
    public void clearHistory() {
        backHistory.clear();
        forwardHistory.clear();
        System.out.println("🧹 Historial borrado");
    }
}

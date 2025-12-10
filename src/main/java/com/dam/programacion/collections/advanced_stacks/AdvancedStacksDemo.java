package com.dam.programacion.collections.advanced_stacks;

/**
 * Demostraciones de pilas avanzadas usando Deque.
 * Muestra ejemplos prácticos: pila de platos y navegador web.
 */
public class AdvancedStacksDemo {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("📚 DEMOSTRACIONES DE PILAS AVANZADAS");
        System.out.println("=".repeat(60));

        // Demo 1: Pila de Platos
        demoPlateStack();

        // Demo 2: Navegador Web
        demoWebBrowser();
    }

    /**
     * Demostración de la pila de platos.
     */
    private static void demoPlateStack() {
        System.out.println("\n\n1️⃣  DEMO: PILA DE PLATOS");
        System.out.println("=".repeat(60));
        System.out.println("Concepto: Cada plato que pones va al tope de la pila.");
        System.out.println("Cuando quitas platos, sacas desde el tope (LIFO).\n");

        PlateStack dishwasher = new PlateStack(5);

        // Apilar platos
        System.out.println("--- Apilando platos ---");
        dishwasher.pushPlate("Plato hondo blanco");
        dishwasher.pushPlate("Plato plano grande");
        dishwasher.pushPlate("Plato de postre");
        dishwasher.pushPlate("Plato de ensalada");
        dishwasher.pushPlate("Tazón de cerámica");

        // Intentar agregar uno más (deberá fallar)
        dishwasher.pushPlate("Plato extra");

        // Ver estado
        dishwasher.displayStack();

        // Ver el plato del tope sin desapilarlo
        System.out.println("--- Viendo el plato del tope ---");
        String topPlate = dishwasher.peekPlate();
        System.out.println("Plato del tope sigue en: " + topPlate + "\n");

        // Desapilar platos
        System.out.println("--- Desapilando platos ---");
        dishwasher.popPlate();
        dishwasher.popPlate();
        dishwasher.popPlate();

        // Ver estado final
        dishwasher.displayStack();

        System.out.println("💡 Nota: Observa que el orden de salida es inverso al de entrada");
        System.out.println("   Ese es el comportamiento LIFO (Last In First Out)");
    }

    /**
     * Demostración del navegador web.
     */
    private static void demoWebBrowser() {
        System.out.println("\n\n2️⃣  DEMO: NAVEGADOR WEB CON HISTORIAL");
        System.out.println("=".repeat(60));
        System.out.println("Concepto: El navegador guarda el historial usando dos pilas:");
        System.out.println("- Una para las páginas que visitaste (atrás)");
        System.out.println("- Una para las páginas que fuiste deshaciendo (adelante)\n");

        WebBrowser browser = new WebBrowser("https://www.google.com");

        // Simulación de navegación
        System.out.println("--- Navegando por sitios web ---");
        browser.visit("https://www.github.com");
        browser.visit("https://www.stackoverflow.com");
        browser.visit("https://www.wikipedia.org");
        browser.visit("https://www.stackoverflow.com/questions");

        browser.displayBrowserState();

        // Navegar hacia atrás
        System.out.println("--- Navegando hacia atrás ---");
        browser.goBack();
        browser.goBack();
        browser.goBack();

        browser.displayBrowserState();

        // Navegar hacia adelante
        System.out.println("--- Navegando hacia adelante ---");
        browser.goForward();
        browser.goForward();

        browser.displayBrowserState();

        // Visitar nueva página
        System.out.println("--- Visitando nueva página ---");
        browser.visit("https://www.reddit.com");

        browser.displayBrowserState();

        // Intentar navegar adelante (el historial se limpió)
        System.out.println("--- Intentando navegar adelante ---");
        browser.goForward();

        System.out.println("\n💡 Nota: Cuando visitas una nueva página después de ir hacia atrás,");
        System.out.println("   el historial hacia adelante se limpia (comportamiento real)");
    }
}

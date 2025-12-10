package com.dam.programacion.collections.shopping_cart;

import java.util.Scanner;

/**
 * Aplicación de tienda con carrito de compras interactivo.
 * Demuestra el uso de ArrayList con operaciones CRUD.
 */
public class Store {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        String option;

        System.out.println("\n" + "=".repeat(50));
        System.out.println("🛍️  BIENVENIDO A LA TIENDA");
        System.out.println("=".repeat(50));

        do {
            displayMenu();
            System.out.print("Seleccione una opción: ");
            option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    addProduct(cart, scanner);
                    break;
                case "2":
                    removeProduct(cart, scanner);
                    break;
                case "3":
                    updateProductQuantity(cart, scanner);
                    break;
                case "4":
                    findProduct(cart, scanner);
                    break;
                case "5":
                    cart.displayCart();
                    break;
                case "6":
                    showTotal(cart);
                    break;
                case "7":
                    cart.clear();
                    break;
                case "8":
                    System.out.println("\n👋 ¡Gracias por su compra! Hasta pronto.\n");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intente de nuevo.\n");
            }
        } while (!option.equals("8"));

        scanner.close();
    }

    /**
     * Muestra el menú de opciones.
     */
    private static void displayMenu() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("📋 MENÚ PRINCIPAL");
        System.out.println("-".repeat(50));
        System.out.println("1. Agregar producto al carrito");
        System.out.println("2. Eliminar producto del carrito");
        System.out.println("3. Actualizar cantidad de producto");
        System.out.println("4. Buscar producto");
        System.out.println("5. Ver carrito");
        System.out.println("6. Ver total");
        System.out.println("7. Vaciar carrito");
        System.out.println("8. Salir");
        System.out.println("-".repeat(50));
    }

    /**
     * Agrega un producto interactivamente.
     */
    private static void addProduct(ShoppingCart cart, Scanner scanner) {
        System.out.print("\nIngrese nombre del producto: ");
        String name = scanner.nextLine().trim();

        System.out.print("Ingrese precio unitario (€): ");
        double price = getDoubleInput(scanner);

        System.out.print("Ingrese cantidad: ");
        int quantity = getIntInput(scanner);

        try {
            cart.addProduct(name, price, quantity);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    /**
     * Elimina un producto interactivamente.
     */
    private static void removeProduct(ShoppingCart cart, Scanner scanner) {
        if (cart.isEmpty()) {
            System.out.println("\n⚠️  El carrito está vacío");
            return;
        }

        System.out.print("\nIngrese nombre del producto a eliminar: ");
        String name = scanner.nextLine().trim();
        cart.removeProduct(name);
    }

    /**
     * Actualiza la cantidad de un producto.
     */
    private static void updateProductQuantity(ShoppingCart cart, Scanner scanner) {
        if (cart.isEmpty()) {
            System.out.println("\n⚠️  El carrito está vacío");
            return;
        }

        System.out.print("\nIngrese nombre del producto: ");
        String name = scanner.nextLine().trim();

        System.out.print("Ingrese nueva cantidad: ");
        int quantity = getIntInput(scanner);

        if (!cart.updateQuantity(name, quantity)) {
            System.out.println("❌ Producto no encontrado");
        }
    }

    /**
     * Busca un producto.
     */
    private static void findProduct(ShoppingCart cart, Scanner scanner) {
        System.out.print("\nIngrese nombre del producto a buscar: ");
        String name = scanner.nextLine().trim();

        Product product = cart.findProduct(name);
        if (product != null) {
            System.out.println("\n✅ Producto encontrado:");
            System.out.println(product);
        } else {
            System.out.println("\n❌ Producto no encontrado");
        }
    }

    /**
     * Muestra el total del carrito.
     */
    private static void showTotal(ShoppingCart cart) {
        if (cart.isEmpty()) {
            System.out.println("\n⚠️  El carrito está vacío");
        } else {
            System.out.println("\n💰 TOTAL DEL CARRITO: €" + 
                String.format("%.2f", cart.calculateTotal()));
        }
    }

    /**
     * Obtiene un número entero del usuario.
     */
    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("❌ Entrada inválida. Ingrese un número: ");
            scanner.nextLine();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    /**
     * Obtiene un número decimal del usuario.
     */
    private static double getDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("❌ Entrada inválida. Ingrese un número: ");
            scanner.nextLine();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}

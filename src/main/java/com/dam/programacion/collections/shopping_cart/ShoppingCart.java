package com.dam.programacion.collections.shopping_cart;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que gestiona un carrito de compras usando ArrayList.
 * Demuestra operaciones CRUD (Create, Read, Update, Delete) en colecciones.
 */
public class ShoppingCart {
    private ArrayList<Product> items;

    /**
     * Constructor que inicializa un carrito vacío.
     */
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * Agrega un producto al carrito.
     *
     * @param product producto a agregar
     */
    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        items.add(product);
        System.out.println("✅ Producto agregado: " + product.getName());
    }

    /**
     * Agrega un producto especificando sus parámetros.
     *
     * @param name nombre del producto
     * @param price precio unitario
     * @param quantity cantidad
     */
    public void addProduct(String name, double price, int quantity) {
        addProduct(new Product(name, price, quantity));
    }

    /**
     * Elimina un producto por nombre.
     *
     * @param name nombre del producto a eliminar
     * @return true si fue eliminado, false si no existe
     */
    public boolean removeProduct(String name) {
        Iterator<Product> iterator = items.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("❌ Producto eliminado: " + name);
                return true;
            }
        }
        System.out.println("⚠️  Producto no encontrado: " + name);
        return false;
    }

    /**
     * Busca un producto por nombre.
     *
     * @param name nombre del producto
     * @return el producto si existe, null en caso contrario
     */
    public Product findProduct(String name) {
        for (Product product : items) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Actualiza la cantidad de un producto.
     *
     * @param name nombre del producto
     * @param newQuantity nueva cantidad
     * @return true si fue actualizado, false si no existe
     */
    public boolean updateQuantity(String name, int newQuantity) {
        Product product = findProduct(name);
        if (product != null) {
            product.setQuantity(newQuantity);
            System.out.println("🔄 Cantidad actualizada: " + name + " → " + newQuantity);
            return true;
        }
        return false;
    }

    /**
     * Calcula el total del carrito.
     *
     * @return suma de todos los subtotales
     */
    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.calculateTotal();
        }
        return total;
    }

    /**
     * Obtiene la cantidad de productos en el carrito.
     *
     * @return número de productos
     */
    public int getProductCount() {
        return items.size();
    }

    /**
     * Verifica si el carrito está vacío.
     *
     * @return true si está vacío
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Muestra el contenido del carrito.
     */
    public void displayCart() {
        if (isEmpty()) {
            System.out.println("\n🛒 CARRITO VACÍO\n");
            return;
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("📦 CONTENIDO DEL CARRITO");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
            System.out.println("-".repeat(50));
        }
        
        System.out.println("💰 TOTAL: €" + String.format("%.2f", calculateTotal()));
        System.out.println("=".repeat(50) + "\n");
    }

    /**
     * Vacía el carrito.
     */
    public void clear() {
        items.clear();
        System.out.println("🗑️  Carrito vaciado");
    }

    /**
     * Obtiene una copia de la lista de productos.
     *
     * @return ArrayList con los productos
     */
    public ArrayList<Product> getItems() {
        return new ArrayList<>(items);
    }
}

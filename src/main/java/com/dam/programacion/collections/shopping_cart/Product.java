package com.dam.programacion.collections.shopping_cart;

/**
 * Clase que representa un producto en el carrito de compras.
 * Demuestra encapsulación y cálculo de totales.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    /**
     * Constructor con parámetros.
     *
     * @param name nombre del producto
     * @param price precio unitario
     * @param quantity cantidad disponible
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.setPrice(price);
        this.quantity = quantity;
    }

    // Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.quantity = quantity;
    }

    /**
     * Calcula el total del producto (precio * cantidad).
     *
     * @return total del producto
     */
    public double calculateTotal() {
        return this.quantity * this.price;
    }

    @Override
    public String toString() {
        return String.format(
            "🛍️  %s\n   Precio: €%.2f | Cantidad: %d | Subtotal: €%.2f",
            this.name, this.price, this.quantity, this.calculateTotal()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
}

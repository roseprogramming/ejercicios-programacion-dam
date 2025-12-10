# 🛒 Carrito de Compras - ArrayList Avanzado

## 📋 Descripción

Este módulo demuestra cómo crear una aplicación de carrito de compras usando `ArrayList`.
Implementa operaciones **CRUD** (Create, Read, Update, Delete) sobre una colección dinámica.

## 🎯 Conceptos Clave

- **ArrayList**: Colección dinámica que crece según se necesita
- **Encapsulación**: Validación en getters y setters
- **Iteración segura**: Uso de Iterator y for-each
- **Búsqueda y actualización**: Operaciones comunes en colecciones
- **Cálculos agregados**: Suma de totales

## 📂 Estructura

```
shopping_cart/
├── Product.java           # Modelo de producto
├── ShoppingCart.java      # Gestor del carrito (operaciones CRUD)
└── Store.java            # Aplicación principal con menú
```

## 💻 Clases Principales

### Product

Representa un producto con:

- Nombre, precio y cantidad
- Cálculo del subtotal (precio × cantidad)
- Validaciones en setters
- Búsqueda por nombre (equals)

```java
Product p = new Product("Laptop", 999.99, 1);
System.out.println(p.calculateTotal());  // 999.99
```

### ShoppingCart

Gestiona la colección de productos:

- `addProduct()` - Agregar productos
- `removeProduct()` - Eliminar por nombre
- `findProduct()` - Buscar producto
- `updateQuantity()` - Cambiar cantidad
- `calculateTotal()` - Suma de todos los subtotales
- `displayCart()` - Mostrar contenido formateado

```java
ShoppingCart cart = new ShoppingCart();
cart.addProduct("Mouse", 25.50, 2);
cart.addProduct("Teclado", 75.00, 1);
System.out.println(cart.calculateTotal());  // 176.00
```

### Store

Aplicación interactiva con menú:

1. Agregar producto
2. Eliminar producto
3. Actualizar cantidad
4. Buscar producto
5. Ver carrito
6. Ver total
7. Vaciar carrito
8. Salir

## 🚀 Ejecución

```bash
# Compilar
javac com/dam/programacion/collections/shopping_cart/*.java

# Ejecutar
java com.dam.programacion.collections.shopping_cart.Store
```

## 🔍 Ejemplo de Salida

```
==================================================
🛍️  BIENVENIDO A LA TIENDA
==================================================

--------------------------------------------------
📋 MENÚ PRINCIPAL
--------------------------------------------------
1. Agregar producto al carrito
2. Eliminar producto del carrito
3. Actualizar cantidad de producto
4. Buscar producto
5. Ver carrito
6. Ver total
7. Vaciar carrito
8. Salir
--------------------------------------------------

Seleccione una opción: 1
Ingrese nombre del producto: Laptop
Ingrese precio unitario (€): 999.99
Ingrese cantidad: 1
✅ Producto agregado: Laptop

Seleccione una opción: 5

==================================================
📦 CONTENIDO DEL CARRITO
==================================================
1. 🛍️  Laptop
   Precio: €999.99 | Cantidad: 1 | Subtotal: €999.99
--------------------------------------------------
💰 TOTAL: €999.99
==================================================
```

## 📚 Conceptos Demostrables

### Operaciones CRUD

- **C**reate: `addProduct()` agrega nuevos productos
- **R**ead: `findProduct()` busca productos
- **U**pdate: `updateQuantity()` modifica cantidades
- **D**elete: `removeProduct()` elimina productos

### Iteración Segura

```java
// Forma 1: For-each (más simple)
for (Product p : cart.getItems()) {
    System.out.println(p);
}

// Forma 2: Iterator (permite modificar durante iteración)
Iterator<Product> it = items.iterator();
while (it.hasNext()) {
    Product p = it.next();
    if (p.getName().equals("X")) {
        it.remove();
    }
}
```

### Búsqueda y Validación

```java
// Búsqueda por nombre
Product found = cart.findProduct("Laptop");
if (found != null) {
    System.out.println("Encontrado: " + found);
}

// Validación de entrada
if (price < 0) {
    throw new IllegalArgumentException("Precio no válido");
}
```

## ✅ Checklist de Aprendizaje

- [ ] Entiendo cómo crear un ArrayList
- [ ] Puedo agregar elementos con `add()`
- [ ] Sé cómo eliminar elementos de forma segura
- [ ] Entiendo la diferencia entre búsqueda y actualización
- [ ] Puedo calcular agregados (suma, promedio)
- [ ] Entiendo cuándo usar Iterator vs for-each
- [ ] Sé validar datos antes de agregarlos
- [ ] Puedo iterar y modificar al mismo tiempo

## 🔗 Conceptos Relacionados

- **Collections/list/** - Ejemplos básicos de ArrayList y LinkedList
- **collections/queue/** - Colas FIFO
- **collections/stack/** - Pilas LIFO y usos avanzados

---

**Siguiente:** Explora los ejemplos avanzados de pilas en `advanced_stacks/`

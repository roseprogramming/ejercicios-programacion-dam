# 📊 Arrays (Arreglos) en Java

## 📋 Descripción

Los arrays son estructuras de datos que permiten almacenar múltiples valores del mismo tipo en una sola variable. Este módulo cubre arrays unidimensionales (vectores) y bidimensionales (matrices).

## 🎯 Conceptos Clave

### ¿Qué es un Array?

Un **array** es un contenedor de datos que:

- Almacena **múltiples elementos** del mismo tipo
- Tiene un **tamaño fijo** definido al crear el array
- Accede a elementos mediante un **índice** (comenzando desde 0)
- Se almacena en **memoria contigua**

### Ventajas de Arrays

✅ Acceso rápido a elementos mediante índice (O(1))  
✅ Memoria eficiente (datos contiguos)  
✅ Fácil iteración con bucles  
✅ Ideal para datos del mismo tipo

### Desventajas de Arrays

❌ Tamaño fijo (no puede crecer dinámicamente)  
❌ Eliminar elementos es complicado  
❌ Puede haber desperdicio de memoria

## 📚 Arrays Unidimensionales (Vectores)

### Declaración

```java
// Forma 1: Especificando tamaño
int[] numeros = new int[5];

// Forma 2: Inicialización con valores
int[] numeros = {10, 20, 30, 40, 50};

// Forma 3: Declaración y creación
String[] nombres = new String[3];
```

### Acceso a Elementos

```java
int[] arr = {10, 20, 30, 40, 50};

// Leer elementos
int primero = arr[0];      // 10
int ultimo = arr[4];       // 50

// Modificar elementos
arr[2] = 99;               // {10, 20, 99, 40, 50}

// Longitud del array
int tamaño = arr.length;   // 5
```

### Iteración

```java
int[] numeros = {10, 20, 30, 40, 50};

// Bucle for tradicional
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}

// Bucle for-each
for (int numero : numeros) {
    System.out.println(numero);
}

// Bucle while
int i = 0;
while (i < numeros.length) {
    System.out.println(numeros[i]);
    i++;
}
```

### Operaciones Comunes

#### Búsqueda de Elementos

```java
int[] arr = {10, 20, 30, 40, 50};

// Buscar posición
int posicion = -1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 30) {
        posicion = i;
        break;
    }
}
// posicion = 2
```

#### Suma de Elementos

```java
int[] numeros = {10, 20, 30, 40, 50};
int suma = 0;

for (int numero : numeros) {
    suma += numero;
}
// suma = 150
```

#### Encontrar Máximo y Mínimo

```java
int[] numeros = {15, 23, 8, 42, 16};

int max = numeros[0];
int min = numeros[0];

for (int num : numeros) {
    if (num > max) max = num;
    if (num < min) min = num;
}
// max = 42, min = 8
```

## 📐 Arrays Bidimensionales (Matrices)

### Declaración

```java
// Matriz de 3 filas x 4 columnas
int[][] matriz = new int[3][4];

// Matriz con valores iniciales
int[][] matriz = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};

// Matriz irregular (filas de diferente tamaño)
int[][] irregular = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
```

### Acceso a Elementos

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Acceder a elemento (fila 1, columna 2)
int elemento = matriz[1][2];  // 6

// Modificar elemento
matriz[0][0] = 99;

// Dimensiones
int filas = matriz.length;     // 3
int columnas = matriz[0].length; // 3
```

### Iteración en Matrices

```java
int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

// Bucles anidados
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}

// For-each anidado
for (int[] fila : matriz) {
    for (int elemento : fila) {
        System.out.print(elemento + " ");
    }
    System.out.println();
}
```

## 📂 Estructura del Proyecto

```
arrays/
├── README.md                          # Este archivo
├── one_dimensional/
│   ├── ejercicio2/
│   │   └── Main.java
│   ├── ejercicio3/
│   │   └── Main.java
│   ├── ejercicio4/ (ejericio4)
│   │   └── Main.java
│   ├── ejercicio5/
│   │   └── Main.java
│   ├── matrices/
│   │   └── Main.java
│   └── vlarrays/
│       └── Main.java
└── bidimensionales/
    └── MatrixFindMinMaxExample.java
```

## 💡 Ejemplos Prácticos

### Ejemplo 1: Invertir un Array

```java
int[] original = {1, 2, 3, 4, 5};
int[] invertido = new int[original.length];

for (int i = 0; i < original.length; i++) {
    invertido[i] = original[original.length - 1 - i];
}
// invertido = {5, 4, 3, 2, 1}
```

### Ejemplo 2: Contar Pares e Impares

```java
int[] numeros = {10, 15, 22, 33, 44, 55};
int pares = 0, impares = 0;

for (int num : numeros) {
    if (num % 2 == 0) {
        pares++;
    } else {
        impares++;
    }
}
// pares = 3, impares = 3
```

### Ejemplo 3: Tabla de Multiplicar como Matriz

```java
int[][] tabla = new int[10][10];

for (int i = 1; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
        tabla[i][j] = i * j;
    }
}
```

### Ejemplo 4: Transpuesta de una Matriz

```java
int[][] original = {{1, 2}, {3, 4}, {5, 6}};  // 3x2
int[][] transpuesta = new int[2][3];           // 2x3

for (int i = 0; i < original.length; i++) {
    for (int j = 0; j < original[0].length; j++) {
        transpuesta[j][i] = original[i][j];
    }
}
```

## 🔧 Métodos Útiles de la Clase Arrays

```java
import java.util.Arrays;

int[] arr = {5, 2, 8, 1, 9};

// Ordenar
Arrays.sort(arr);                    // {1, 2, 5, 8, 9}

// Buscar (requiere array ordenado)
int indice = Arrays.binarySearch(arr, 5);  // 2

// Copiar
int[] copia = Arrays.copyOf(arr, arr.length);

// Llenar
Arrays.fill(arr, 0);                 // Todos los elementos = 0

// Convertir a String
String str = Arrays.toString(arr);   // "[0, 0, 0, 0, 0]"

// Comparar
boolean iguales = Arrays.equals(arr1, arr2);
```

## ⚠️ Errores Comunes

### Error 1: IndexOutOfBoundsException

```java
int[] arr = {1, 2, 3};
int valor = arr[3];  // ❌ ERROR: el índice máximo es 2
```

### Error 2: NullPointerException

```java
int[] arr = null;
arr[0] = 5;  // ❌ ERROR: arr no está inicializado
```

### Error 3: Confundir índice con valor

```java
int[] arr = {10, 20, 30};
// arr.length = 3 (hay 3 elementos)
// arr[3] no existe (índices: 0, 1, 2)
```

## 📊 Comparación: Arrays vs Collections

| Característica     | Array      | ArrayList              |
| ------------------ | ---------- | ---------------------- |
| Tamaño             | Fijo       | Dinámico               |
| Tipos primitivos   | Sí         | No (requiere wrappers) |
| Rendimiento        | Más rápido | Más lento              |
| Facilidad de uso   | Moderada   | Fácil                  |
| Eliminar elementos | Difícil    | Fácil                  |

## 🚀 Siguientes Pasos

1. **Arrays Multidimensionales**: Matrices de más de 2 dimensiones
2. **Collections Framework**: ArrayList, LinkedList, HashMap
3. **Algoritmos de búsqueda y ordenamiento**: Binary Search, QuickSort
4. **Estructuras de datos avanzadas**: Pilas, Colas, Árboles

## ✅ Checklist de Aprendizaje

- [ ] Sé declarar e inicializar arrays
- [ ] Puedo acceder a elementos mediante índices
- [ ] Sé iterar arrays con for, for-each y while
- [ ] Entiendo cómo funcionan los índices
- [ ] Puedo crear matrices (arrays 2D)
- [ ] Sé iterar matrices con bucles anidados
- [ ] Entiendo la diferencia entre arrays y colecciones
- [ ] Conozco métodos comunes de Arrays
- [ ] Puedo evitar IndexOutOfBoundsException
- [ ] Sé copiar, ordenar y buscar en arrays

---

**Siguiente tema:** Aprende **Programación Orientada a Objetos** en la carpeta `poo/`

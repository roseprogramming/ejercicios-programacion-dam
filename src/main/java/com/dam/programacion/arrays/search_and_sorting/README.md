# 🔍 Búsqueda y Ordenamiento - Arrays Avanzados

## 📋 Descripción

Este módulo demuestra algoritmos fundamentales de búsqueda y ordenamiento en arrays.
Incluye implementaciones, análisis de complejidad y comparaciones de rendimiento.

## 🎯 Conceptos Clave

- **Búsqueda Lineal**: Recorrido secuencial O(n)
- **Búsqueda Binaria**: División y conquista O(log n)
- **Bubble Sort**: Intercambio de adyacentes O(n²)
- **Selection Sort**: Búsqueda de mínimo O(n²)
- **Insertion Sort**: Construcción ordenada O(n²)
- **Quick Sort**: Particionamiento O(n log n)
- **Complejidad**: Análisis temporal y espacial

## 📂 Estructura

```
search_and_sorting/
├── SearchExamples.java      # Búsqueda lineal y binaria
├── SortingExamples.java     # Múltiples algoritmos de ordenamiento
└── MatrixExamples.java      # Operaciones con matrices 2D
```

## 💻 Clases Principales

### SearchExamples

Implementa dos tipos de búsqueda:

**Búsqueda Lineal**

- Recorre el array elemento a elemento
- Complejidad: O(n)
- Funciona en arrays desordenados
- Útil para arrays pequeños o datos sin orden específico

**Búsqueda Binaria**

- Requiere array ORDENADO
- Complejidad: O(log n) - mucho más rápida
- Divide el array por la mitad en cada iteración
- Ejemplo: búsqueda de 9999 en 10,000 elementos es 100x+ más rápida

### SortingExamples

Implementa cinco algoritmos de ordenamiento:

| Algoritmo          | Complejidad | Ventajas                 | Desventajas      |
| ------------------ | ----------- | ------------------------ | ---------------- |
| Bubble Sort        | O(n²)       | Fácil de entender        | Muy lento        |
| Selection Sort     | O(n²)       | Pocos intercambios       | Lento            |
| Insertion Sort     | O(n²)       | Eficiente en pequeños    | Lento en grandes |
| Quick Sort         | O(n log n)  | Muy rápido (en promedio) | Complejo         |
| Java's Arrays.sort | O(n log n)  | Optimizado               | Caja negra       |

### MatrixExamples

Operaciones con matrices 2D:

- **Creación**: Inicialización y acceso a elementos
- **Transposición**: Cambia filas por columnas
- **Suma**: Suma de dos matrices elemento a elemento
- **Multiplicación**: Producto de matrices (A m×n × B n×p = C m×p)

## 🚀 Ejecución

```bash
# Compilar
javac com/dam/programacion/arrays/search_and_sorting/*.java

# Ejecutar búsqueda
java com.dam.programacion.arrays.search_and_sorting.SearchExamples

# Ejecutar ordenamiento
java com.dam.programacion.arrays.search_and_sorting.SortingExamples

# Ejecutar matrices
java com.dam.programacion.arrays.search_and_sorting.MatrixExamples
```

## 🔍 Ejemplo de Búsqueda

```java
int[] numbers = {45, 23, 67, 12, 89, 34, 56, 78};
int target = 89;

// Búsqueda lineal: examina cada elemento
// Itera hasta encontrar o llegar al final
// Resultado: encontrado en índice 4

// Búsqueda binaria (requiere ordenado):
// Dividir por la mitad, comparar, eliminar mitad innecesaria
// Mucho más rápido en arrays grandes
```

## 📊 Ejemplo de Ordenamiento

```java
int[] arr = {64, 34, 25, 12, 22, 11, 90};

// Bubble Sort: compara vecinos y intercambia
// 64,34,25,12,22,11,90 → 34,25,12,22,11,64,90

// Selection Sort: encuentra mínimo y lo coloca
// 64,34,25,12,22,11,90 → 11,34,25,12,22,64,90

// Quick Sort: particiona y ordena recursivamente
// Mucho más rápido
```

## 📐 Ejemplo de Matrices

```java
// Matriz 3×3
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Transposición
// Original:  1 2 3      Transpuesta: 1 4 7
//            4 5 6                   2 5 8
//            7 8 9                   3 6 9

// Multiplicación A(2×3) × B(3×2) = C(2×2)
```

## ✅ Checklist de Aprendizaje

- [ ] Entiendo cómo funciona búsqueda lineal
- [ ] Sé por qué búsqueda binaria es más rápida
- [ ] Conozco los 5 algoritmos de ordenamiento principales
- [ ] Puedo comparar complejidades O(n), O(n²), O(n log n)
- [ ] Entiendo la transposición de matrices
- [ ] Puedo multiplicar dos matrices
- [ ] Sé cuándo usar cada algoritmo
- [ ] Entiendo la importancia de arrays ordenados

## 💡 Desafíos Propuestos

1. **Búsqueda avanzada**: Implementar búsqueda en array 2D
2. **Ordenamiento personalizado**: Ordenar por múltiples criterios
3. **Merge Sort**: Implementar otro algoritmo eficiente
4. **Determinante de matriz**: Calcular determinante 3×3
5. **Validar si es matriz simétrica**: Comparar con transpuesta

## 🔗 Conceptos Relacionados

- **basics/control_structures/** - Bucles necesarios para estos algoritmos
- **arrays/one_dimensional/** - Arrays básicos
- **arrays/two_dimensional/** - Más operaciones matriciales
- **collections/list/** - Alternativa con ArrayList

---

**Siguiente:** Explora conceptos de **Excepciones** o **POO Avanzado**

# 📚 Pilas Avanzadas - Deque con Aplicaciones Prácticas

## 📋 Descripción

Este módulo demuestra casos de uso reales y prácticos de pilas (stacks) usando `Deque`.
Implementa dos ejemplos clásicos: pila de platos y navegador web con historial.

## 🎯 Conceptos Clave

- **LIFO (Last In, First Out)**: El último que entra es el primero que sale
- **Deque**: Estructura de datos bidireccional (deque = double-ended queue)
- **push/pop/peek**: Operaciones fundamentales de pilas
- **Aplicaciones prácticas**: Casos reales donde se usan pilas
- **Historial bidireccional**: Pilas hacia atrás y adelante

## 📂 Estructura

```
advanced_stacks/
├── PlateStack.java         # Simulación de pila de platos
├── WebBrowser.java         # Navegador con historial
└── AdvancedStacksDemo.java # Demostración de ambos casos
```

## 💻 Clases Principales

### PlateStack

Simula una pila de platos en el lava platos:

**Métodos:**

- `pushPlate()` - Apilar un nuevo plato
- `popPlate()` - Desapilar el plato del tope
- `peekPlate()` - Ver el plato del tope sin desapilarlo
- `isEmpty()` / `isFull()` - Estado de la pila
- `displayStack()` - Mostrar contenido ordenado

**Características:**

- Capacidad máxima configurable
- Validaciones antes de apilar/desapilar
- Mensajes claros del estado

```java
PlateStack stack = new PlateStack(5);
stack.pushPlate("Plato hondo");
stack.pushPlate("Plato plano");
stack.displayStack();
String plate = stack.popPlate();  // Saca el último
```

### WebBrowser

Implementa un navegador web con historial bidireccional:

**Métodos:**

- `visit()` - Navegar a una nueva página
- `goBack()` - Volver a la página anterior
- `goForward()` - Avanzar a la siguiente página
- `displayBrowserState()` - Mostrar estado actual

**Características:**

- Historial hacia atrás (páginas visitadas)
- Historial hacia adelante (páginas deshechas)
- Limpieza automática del historial adelante al visitar nueva página
- Validaciones antes de navegar

```java
WebBrowser browser = new WebBrowser("https://www.google.com");
browser.visit("https://www.github.com");
browser.visit("https://www.stackoverflow.com");
browser.goBack();      // Vuelve a github
browser.goBack();      // Vuelve a google
browser.goForward();   // Va a github nuevamente
```

## 🚀 Ejecución

```bash
# Compilar
javac com/dam/programacion/collections/advanced_stacks/*.java

# Ejecutar la demostración completa
java com.dam.programacion.collections.advanced_stacks.AdvancedStacksDemo
```

## 🔍 Ejemplo de Salida

```
============================================================
📚 DEMOSTRACIONES DE PILAS AVANZADAS
============================================================

1️⃣  DEMO: PILA DE PLATOS
============================================================
Concepto: Cada plato que pones va al tope de la pila.
Cuando quitas platos, sacas desde el tope (LIFO).

--- Apilando platos ---
📚 Plato apilado: Plato hondo blanco (Total: 1)
📚 Plato apilado: Plato plano grande (Total: 2)
📚 Plato apilado: Plato de postre (Total: 3)
📚 Plato apilado: Plato de ensalada (Total: 4)
📚 Plato apilado: Tazón de cerámica (Total: 5)
❌ ¡Pila llena! No caben más platos.

========================================
📚 ESTADO ACTUAL DE LA PILA
========================================
[1] Tazón de cerámica
[2] Plato de ensalada
[3] Plato de postre
[4] Plato plano grande
[5] Plato hondo blanco
Total de platos: 5/5
========================================

--- Viendo el plato del tope sin desapilarlo ---
Plato del tope sigue en: Tazón de cerámica

--- Desapilando platos ---
📤 Plato desapilado: Tazón de cerámica (Total: 4)
📤 Plato desapilado: Plato de ensalada (Total: 3)
📤 Plato desapilado: Plato de postre (Total: 2)

💡 Nota: Observa que el orden de salida es inverso al de entrada
   Ese es el comportamiento LIFO (Last In First Out)
```

## 📚 Conceptos Demostrables

### LIFO (Last In, First Out)

```
Apilamos: 1 → 2 → 3
Orden en memoria: [3, 2, 1]  (3 está al tope)

Desapilamos: 3 ← 2 ← 1
Orden de salida: 3, 2, 1 (inverso al de entrada)
```

### Deque vs Stack

```java
// Deque es más moderno y recomendado
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);
stack.pop();
stack.peek();

// Stack es la clase clásica pero menos eficiente
Stack<Integer> oldStack = new Stack<>();
oldStack.push(1);
oldStack.pop();
oldStack.peek();
```

### Aplicaciones Reales de Pilas

| Aplicación                        | Descripción                           |
| --------------------------------- | ------------------------------------- |
| **Navegador web**                 | Botón "atrás" usa pila de historial   |
| **Editor de texto**               | Deshacer (Ctrl+Z) usa pila de cambios |
| **Evaluación de expresiones**     | Cálculos con paréntesis y operadores  |
| **Validación de paréntesis**      | Detectar paréntesis balanceados       |
| **DFS (Búsqueda en profundidad)** | Exploración de grafos                 |
| **Gestión de memoria**            | Stack frame en llamadas de función    |

## ✅ Checklist de Aprendizaje

- [ ] Entiendo qué es LIFO
- [ ] Conozco la diferencia entre push, pop y peek
- [ ] Puedo crear un Deque y usar sus métodos
- [ ] Entiendo casos de uso reales de pilas
- [ ] Puedo simular un navegador con historial
- [ ] Sé validar estados (isEmpty, isFull)
- [ ] Entiendo por qué Deque es mejor que Stack
- [ ] Puedo implementar pilas en problemas reales

## 🔗 Conceptos Relacionados

- **collections/stack/** - Ejemplos básicos de StackDemo
- **collections/queue/** - Colas FIFO (opuesto a pilas)
- **collections/list/** - ArrayList y LinkedList
- **advanced_stacks/shopping_cart/** - Otro ejemplo de ArrayList avanzado

## 💡 Desafíos Propuestos

1. **Validador de paréntesis**: Usa una pila para validar que paréntesis, corchetes y llaves estén balanceados
2. **Editor de texto simple**: Implementa deshacer/rehacer usando dos pilas
3. **Evaluador de expresiones**: Calcula expresiones matemáticas usando pilas (notación postfija)
4. **Explorador de directorios**: Navega con "atrás" y "adelante" como el navegador web

---

**Siguiente:** Explora más conceptos en `collections/queue/` o `collections/list/`

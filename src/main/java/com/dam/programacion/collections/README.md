# Collections (Java Collections Framework)

Ejemplos básicos y claros de las principales colecciones en Java, con nombres en inglés y siguiendo buenas prácticas.

## Contenido

- `stack/`: uso de `Deque` como pila (push/peek/pop) con comprobación de vacío.
- `queue/`: cola FIFO con `ArrayDeque` (offer/poll/peek) y simulación de turnos.
- `list/`: ejemplos con `ArrayList` y `LinkedList` (inserción, orden, búsqueda, iteración segura).
- `set/`: unicidad y orden con `HashSet`, `LinkedHashSet`, `TreeSet`.
- `map/`: pares clave-valor con `HashMap`, `LinkedHashMap`, `TreeMap`.
- **`shopping_cart/`**: aplicación de carrito de compras con operaciones CRUD avanzadas en ArrayList.
- **`advanced_stacks/`**: casos prácticos de pilas: simulación de pila de platos y navegador web.

## Ejecución rápida

```bash
# Stack básico
java com.dam.programacion.collections.stack.StackDemo

# Queue
java com.dam.programacion.collections.queue.QueueDemo

# ArrayList
java com.dam.programacion.collections.list.ArrayListDemo

# LinkedList
java com.dam.programacion.collections.list.LinkedListDemo

# Set
java com.dam.programacion.collections.set.SetDemo

# Map
java com.dam.programacion.collections.map.MapDemo

# ⭐ NUEVO: Carrito de compras interactivo
java com.dam.programacion.collections.shopping_cart.Store

# ⭐ NUEVO: Pilas avanzadas (pila de platos + navegador)
java com.dam.programacion.collections.advanced_stacks.AdvancedStacksDemo
```

## Buenas prácticas destacadas

- Usar interfaces (`List`, `Deque`, `Queue`) en las referencias.
- Preferir `ArrayDeque` para pilas/colas frente a `Stack` o `LinkedList` en uso de pila.
- Validar antes de extraer (`isEmpty`) para evitar excepciones.
- Usar iteradores o bucles for-each para recorridos seguros.
- Separar responsabilidades en métodos cortos y descriptivos.

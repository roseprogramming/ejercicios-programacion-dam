# 🏛️ Programación Orientada a Objetos (POO) en Java

## 📋 Descripción

La Programación Orientada a Objetos (POO) es un paradigma que organiza el software usando **objetos** y **clases**. Este módulo cubre los **cuatro pilares fundamentales**: **encapsulación**, **abstracción**, **herencia** y **polimorfismo**.

---

## 🎯 Los Cuatro Pilares de POO

### 1️⃣ Encapsulación

**Definición**: Agrupar datos (atributos) y métodos en una clase, protegiendo el acceso interno.

**Principios**:

- Usar `private` para atributos
- Proporcionar `public` getters y setters
- Validar datos antes de asignarlos
- Ocultar detalles de implementación

**Beneficios**:

- ✅ Control sobre el acceso a los datos
- ✅ Validación automática de valores
- ✅ Cambios internos sin afectar la interfaz
- ✅ Código más mantenible

**Ejemplo en nuestro código**: `Perro.java`

```java
public class Perro {
    private String nombre;        // Privado
    private int nivelEnergia;     // Privado

    public String getNombre() {   // Getter público
        return nombre;
    }

    public void setNombre(String nombre) {  // Setter con validación
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
}
```

---

### 2️⃣ Abstracción

**Definición**: Mostrar solo lo esencial, ocultando la complejidad interna.

**Mecanismos en Java**:

- Clases abstractas (`abstract class`)
- Interfaces (`interface`)
- Métodos abstractos (`abstract void metodo()`)

**Ventajas**:

- ✅ Simplificar interfaces complejas
- ✅ Definir contratos que deben cumplir las subclases
- ✅ Facilitar el entendimiento del código
- ✅ Promover reutilización de código

**Ejemplo en nuestro código**: `Animal.java`

```java
public abstract class Animal {
    protected String nombre;
    protected int edad;

    // Métodos abstractos que DEBEN implementar las subclases
    public abstract void hacerSonido();
    public abstract void jugarCon(Animal otro);

    // Métodos concretos compartidos
    public void comer() {
        energia = Math.min(ENERGIA_MAX, energia + 15);
        System.out.println(nombre + " está comiendo...");
    }
}
```

---

### 3️⃣ Herencia

**Definición**: Crear nuevas clases basadas en clases existentes, reutilizando y extendiendo código.

**Sintaxis**:

```java
public class Subclase extends Superclase {
    // Código específico de la subclase
}
```

**Conceptos**:

- **Superclase/Clase padre**: La clase original
- **Subclase/Clase hija**: La clase derivada
- **extends**: Palabra clave para heredar
- **super**: Acceder a métodos de la superclase

**Beneficios**:

- ✅ Reutilizar código de la clase padre
- ✅ Crear jerarquías lógicas
- ✅ Extender funcionalidad sin modificar el original
- ✅ Código más organizado

**Ejemplo en nuestro código**:

```java
// Clase padre: Animal
public abstract class Animal {
    protected String nombre;
    public abstract void hacerSonido();
}

// Clases hijas
public class Perrito extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
}
```

---

### 4️⃣ Polimorfismo

**Definición**: "Muchas formas" - La capacidad de usar un objeto de diferentes formas.

**Tipos**:

#### Polimorfismo de Método (Override)

```java
Animal miPerro = new Perrito("Pimpi");
Animal miGato = new Gato("Misu");

// Mismo método, diferente comportamiento
miPerro.hacerSonido();  // Output: ¡Guau guau!
miGato.hacerSonido();   // Output: ¡Miau miau!
```

#### Polimorfismo de Sobrecarga (Overload)

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }
}
```

**Beneficios**:

- ✅ Código flexible y reutilizable
- ✅ Fácil de extender con nuevos tipos
- ✅ Interfaces consistentes
- ✅ Reducir complejidad

**Ejemplo en nuestro código**: `polymorphism/` - Figuras Geométricas

```java
List<Figura> figuras = new ArrayList<>();
figuras.add(new Rectangulo("Rect", 5, 3));
figuras.add(new Circulo("Circ", 4));
figuras.add(new Triangulo("Trian", 3, 4, 5));

// Una línea, múltiples comportamientos
for (Figura f : figuras) {
    f.mostrarInfo();  // Polimorfismo en acción
}
```

---

## 📁 Estructura del Módulo POO

```
poo/
├── clases_basicas/
│   ├── Perro.java          (Encapsulación)
│   └── Main.java           (Simulador interactivo)
│
├── herencia/
│   ├── Modelos/
│   │   ├── Animal.java     (Clase abstracta)
│   │   ├── Perrito.java    (Herencia)
│   │   ├── Gato.java       (Herencia)
│   │   └── Pajaro.java     (Herencia)
│   └── Main.java           (Demostración de herencia)
│
├── polymorphism/
│   ├── Figura.java         (Clase abstracta)
│   ├── Rectangulo.java     (Implementación)
│   ├── Circulo.java        (Implementación)
│   ├── Triangulo.java      (Implementación)
│   └── Main.java           (Demostración de polimorfismo)
│
└── README.md               (Este archivo)
```

---

## 🚀 Cómo Ejecutar los Ejemplos

### 1. Encapsulación - Simulador de Mascotas

```bash
# Compilar
javac src/main/java/com/dam/programacion/poo/clases_basicas/*.java

# Ejecutar
java -cp src/main/java com.dam.programacion.poo.clases_basicas.Main
```

**Características**:

- Crear múltiples perros
- Alimentar, jugar, dormir
- Ver estado individual
- Estadísticas generales

### 2. Herencia - Animales Diversos

```bash
java -cp src/main/java com.dam.programacion.poo.herencia.Main
```

**Demuestra**:

- Jerarquía de clases
- Métodos abstractos implementados
- Comportamientos específicos por tipo
- Interacciones polimórficas

### 3. Polimorfismo - Figuras Geométricas

```bash
java -cp src/main/java com.dam.programacion.poo.polymorphism.Main
```

**Demuestra**:

- Variables polimórficas
- Method Override
- Procesamiento genérico
- Cast de tipos

---

## 📊 Comparativa de Conceptos

| Concepto          | Propósito               | Implementación                            |
| ----------------- | ----------------------- | ----------------------------------------- |
| **Encapsulación** | Proteger datos          | `private`/`public` getters/setters        |
| **Abstracción**   | Simplificar complejidad | `abstract` class/methods, `interface`     |
| **Herencia**      | Reutilizar código       | `extends`                                 |
| **Polimorfismo**  | Flexibilidad            | Method Override, referencias polimórficas |

---

## 💡 Buenas Prácticas

### 1. **Siempre usar encapsulación**

```java
// ❌ Malo
public String nombre;

// ✅ Bueno
private String nombre;
public String getNombre() { return nombre; }
public void setNombre(String nombre) { /* validar */ }
```

### 2. **Usar nombres significativos**

```java
// ❌ Malo
public void m() { }

// ✅ Bueno
public void mostrarEstado() { }
```

### 3. **Documentar con JavaDoc**

```java
/**
 * Calcula el área del rectángulo.
 * @param largo Longitud del lado largo
 * @param ancho Longitud del lado ancho
 * @return El área calculada
 */
public double calcularArea(double largo, double ancho) {
    return largo * ancho;
}
```

### 4. **Validar en setters**

```java
public void setEdad(int edad) {
    if (edad > 0 && edad < 150) {
        this.edad = edad;
    }
}
```

### 5. **Usar constantes para valores fijos**

```java
public static final int ENERGIA_MAX = 100;
public static final String ESTADO_FELIZ = "feliz";
```

---

## 🔗 Relación Entre Conceptos

```
    ┌─────────────────────────────┐
    │   ENCAPSULACIÓN             │
    │  (Controlar el acceso)      │
    └──────────────┬──────────────┘
                   │
                   ▼
    ┌─────────────────────────────┐
    │   ABSTRACCIÓN               │
    │  (Ocultar complejidad)      │
    └──────────────┬──────────────┘
                   │
                   ▼
    ┌─────────────────────────────┐
    │   HERENCIA                  │
    │  (Reutilizar código)        │
    └──────────────┬──────────────┘
                   │
                   ▼
    ┌─────────────────────────────┐
    │   POLIMORFISMO              │
    │  (Múltiples comportamientos)│
    └─────────────────────────────┘
```

---

## 📚 Recursos de Aprendizaje

### Conceptos Clave a Dominar

- [ ] Diferencia entre atributos privados, protegidos y públicos
- [ ] Cuándo usar clases abstractas vs interfaces
- [ ] Cómo implementar métodos heredados correctamente
- [ ] Usar variables polimórficas para procesamiento genérico
- [ ] Cast seguro entre tipos

### Ejercicios Propuestos

1. **Extender Animal**: Crear nuevas clases (Pez, Insecto) que hereden de Animal
2. **Nuevas Figuras**: Agregar Cuadrado, Pentágono, Hexágono a polimorfismo
3. **Sistema de Empleados**: Crear jerarquía con Empleado, Gerente, Programador
4. **Carrito de Compras**: Diferentes tipos de productos con precios dinámicos

---

## ✨ Ventajas de Aplicar POO Correctamente

- 📦 Código modular y reutilizable
- 🔒 Datos protegidos y validados
- 🔧 Fácil de mantener y modificar
- 📈 Escalable para proyectos grandes
- 👥 Colaboración en equipo mejorada
- 🐛 Menos errores y bugs
- 💻 Mejor rendimiento y eficiencia

---

## 🎓 Conclusión

La POO es fundamental en Java y en la programación moderna. Dominar estos cuatro pilares te permitirá:

- Escribir código más limpio y profesional
- Diseñar sistemas complejos de forma elegante
- Colaborar mejor en equipos de desarrollo
- Mantener y evolucionar código a lo largo del tiempo

**Recuerda**: La POO no es solo sintaxis, es una forma de pensar en la solución de problemas.

---

**Última actualización**: 2024  
**Versión**: 2.0  
**Estado**: ✅ Completo y funcional

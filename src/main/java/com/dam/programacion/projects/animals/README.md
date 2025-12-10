# 🐾 Sistema de Simulación de Animales

## 📋 Descripción

Proyecto educativo que implementa un sistema completo de simulación de animales utilizando **Programación Orientada a Objetos (POO)** en Java. Este proyecto demuestra el uso de conceptos avanzados como **herencia**, **polimorfismo**, **clases abstractas** e **interfaces**.

El sistema modela diferentes tipos de animales (terrestres, acuáticos y voladores) con sus comportamientos específicos, permitiendo crear simulaciones interactivas donde los animales demuestran sus capacidades únicas.

## 🎯 Objetivos de Aprendizaje

Este proyecto te ayudará a comprender y aplicar:

- ✅ **Clases abstractas**: Definición de comportamientos base que deben implementar las subclases
- ✅ **Herencia**: Reutilización de código mediante jerarquías de clases
- ✅ **Polimorfismo**: Tratamiento uniforme de objetos de diferentes tipos
- ✅ **Interfaces**: Contratos que definen capacidades específicas (volar, picotear)
- ✅ **Encapsulación**: Protección de atributos mediante getters/setters
- ✅ **Pattern matching con instanceof** (Java 14+)
- ✅ **Documentación JavaDoc profesional**

## 🏗️ Estructura del Proyecto

```
animales/
├── Animal.java           # Clase abstracta base
├── Volador.java          # Interface para animales voladores
├── Picotear.java         # Interface para animales que picotean
├── Gato.java            # Animal terrestre con 7 vidas
├── Perro.java           # Animal terrestre con raza
├── Pez.java             # Animal acuático
├── Pajaro.java          # Animal volador que picotea
├── Mosquito.java        # Insecto volador que pica
├── Main.java            # Programa de demostración
└── README.md            # Este archivo
```

## 📚 Jerarquía de Clases

```
Animal (abstracta)
├── Gato
├── Perro
├── Pez
├── Pajaro (implements Volador, Picotear)
└── Mosquito (implements Volador, Picotear)

<<interface>> Volador
├── Pajaro
└── Mosquito

<<interface>> Picotear
├── Pajaro
└── Mosquito
```

## 🐱 Descripción de los Animales

### Clase Abstracta `Animal`

Clase base que define los atributos y comportamientos comunes a todos los animales:

- **Atributos**: nombre, edad, especie
- **Métodos abstractos**: `hacerSonido()`, `reproducir()`
- **Métodos concretos**: `presentarse()`, `respirar()`, `comer()`, `toString()`

### Interface `Volador`

Define las capacidades de vuelo:

- `ALTURA_MAXIMA_VUELO`: Constante de 1000 metros
- `volar()`: Despegar y volar
- `aterrizar()`: Descender al suelo
- `caerse()`: Perder el control

### Interface `Picotear`

Define la capacidad de picotear:

- `picoteo()`: Acción de picotear

### `Gato` 🐱

Animal terrestre con sistema de vidas múltiples:

- **Atributo especial**: `numVidas` (inicialmente 7)
- **Métodos únicos**: `ronronear()`, `aranyar()`, `restarVidas()`
- **Comportamiento**: Pierde vidas cuando sufre daño

### `Perro` 🐕

Animal terrestre con raza:

- **Atributos especiales**: `raza`, `numeroPatas` (4)
- **Métodos únicos**: `ladrar()`
- **Constructores**: 3 variantes para diferentes inicializaciones

### `Pez` 🐟

Animal acuático simple:

- **Métodos únicos**: `nadar()`
- **Reproducción**: Pone huevos en el agua
- **Sonido**: Hace burbujas (glu glu)

### `Pajaro` 🐦

Animal volador que también puede picotear:

- **Implementa**: `Volador`, `Picotear`
- **Capacidades**: Volar alto, aterrizar en ramas, picotear semillas
- **Reproducción**: Pone huevos en nidos

### `Mosquito` 🦟

Insecto volador molesto:

- **Implementa**: `Volador`, `Picotear`
- **Capacidades**: Volar zumbando, picar para extraer sangre
- **Método único**: `matarMosquito()` para eliminarlo
- **Reproducción**: Pone cientos de huevos en agua estancada

## 🚀 Ejecución del Programa

### Compilación

```bash
# Desde el directorio del proyecto
javac com/dam/programacion/proyectos/animales/*.java
```

### Ejecución

```bash
# Ejecutar el programa principal
java com.dam.programacion.proyectos.animales.Main
```

### Salida Esperada

El programa ejecuta 5 demostraciones:

1. **Presentación de todos los animales**: Cada animal se presenta y hace su sonido
2. **Capacidades específicas**: Demuestra comportamientos únicos de cada tipo
3. **Animales voladores**: Filtra y muestra solo los que implementan `Volador`
4. **Animales que picotean**: Filtra y muestra solo los que implementan `Picotear`
5. **Información completa**: Muestra el `toString()` de cada animal

## 💡 Ejemplos de Uso

### Crear un gato y usar sus capacidades

```java
Gato garfield = new Gato("Garfield", 3, "Gato naranja");
garfield.presentarse();      // Presenta al gato
garfield.hacerSonido();      // ¡MIAU MIAU!
garfield.ronronear();        // purrr purrr...
garfield.aranyar();          // ¡SCRATCH!
garfield.restarVidas();      // Pierde una vida (quedan 6)
```

### Crear un perro con raza

```java
Perro rex = new Perro("Rex", 5, "Pastor Alemán");
rex.ladrar();                // ¡GUAU GUAU!
rex.hacerSonido();           // Llama a ladrar()
System.out.println(rex.getRaza());      // Pastor Alemán
System.out.println(rex.getNumeroPatas()); // 4
```

### Polimorfismo con arrays de animales

```java
Animal[] animales = new Animal[3];
animales[0] = new Gato("Michi", 2, "Gato siamés");
animales[1] = new Perro("Toby", 4, "Labrador");
animales[2] = new Pez("Nemo", 1, "Pez payaso");

// Todos responden al método abstracto
for (Animal animal : animales) {
    animal.hacerSonido();  // Cada uno hace su sonido específico
}
```

### Usar interfaces para filtrar capacidades

```java
Animal[] todos = {new Pajaro(...), new Mosquito(...), new Gato(...)};

// Solo los que pueden volar
for (Animal animal : todos) {
    if (animal instanceof Volador volador) {
        volador.volar();
        volador.aterrizar();
    }
}
```

## 🔍 Conceptos Técnicos Destacados

### 1. Clases Abstractas

```java
public abstract class Animal {
    // No se puede instanciar directamente
    protected String nombre;

    // Métodos abstractos deben implementarse
    public abstract void hacerSonido();
    public abstract void reproducir();

    // Métodos concretos heredados
    public void presentarse() { ... }
}
```

### 2. Interfaces

```java
public interface Volador {
    int ALTURA_MAXIMA_VUELO = 1000; // Constante pública
    void volar();                    // Métodos abstractos
    void aterrizar();
}
```

### 3. Polimorfismo

```java
Animal animal = new Gato("Felix", 2, "Gato negro");
// Referencia de tipo Animal apunta a objeto Gato
animal.hacerSonido(); // Ejecuta la versión de Gato
```

### 4. Pattern Matching (Java 14+)

```java
if (animal instanceof Gato gato) {
    // 'gato' ya está casteado automáticamente
    gato.ronronear();
}
```

## 🎓 Aplicaciones Educativas

Este proyecto es ideal para:

- **Estudiantes de DAM/DAW**: Práctica de POO avanzada
- **Preparación de certificaciones Java**: Conceptos fundamentales bien implementados
- **Portfolio de GitHub**: Demuestra comprensión de principios SOLID
- **Ejercicios de refactoring**: Código limpio y bien documentado

## 📊 Diagramas

### Diagrama de Clases Simplificado

```
┌─────────────────┐
│   <<abstract>>  │
│     Animal      │
├─────────────────┤
│ - nombre        │
│ - edad          │
│ - especie       │
├─────────────────┤
│ + hacerSonido() │◄──┐
│ + reproducir()  │   │
│ + presentarse() │   │  herencia
└─────────────────┘   │
         △            │
         │            │
    ┌────┴────┬───────┼────────┬────────┐
    │         │       │        │        │
┌───┴───┐ ┌──┴──┐ ┌──┴───┐ ┌──┴───┐ ┌──┴────┐
│ Gato  │ │Perro│ │ Pez  │ │Pajaro│ │Mosqui-│
│       │ │     │ │      │ │      │ │  to   │
└───────┘ └─────┘ └──────┘ └──┬───┘ └───┬───┘
                              │          │
                              │implements│
                          ┌───┴──────────┴───┐
                          │                  │
                    ┌─────┴──────┐    ┌─────┴──────┐
                    │  Volador   │    │  Picotear  │
                    │<<interface>>    │<<interface>>
                    └────────────┘    └────────────┘
```

## 🛠️ Mejoras Futuras

Posibles extensiones del proyecto:

- [ ] Añadir más tipos de animales (reptiles, anfibios)
- [ ] Implementar sistema de alimentación
- [ ] Crear hábitats para cada tipo de animal
- [ ] Añadir sistema de edades y ciclo de vida
- [ ] Implementar patrón Observer para eventos
- [ ] Crear GUI con JavaFX para visualización
- [ ] Añadir persistencia de datos (serialización)
- [ ] Implementar tests unitarios con JUnit

## 📝 Notas Técnicas

- **Versión de Java**: 21 (compatible con versiones anteriores desde Java 8)
- **Encoding**: UTF-8
- **Convenciones**: Nombres de clases en PascalCase, métodos en camelCase
- **Documentación**: Todos los métodos públicos tienen JavaDoc

## 👨‍💻 Autor

**Andrea Gicela Bravo Landeta** (@roseprogramming)
Estudiante de **DAM** - Desarrollo de Aplicaciones Multiplataforma
**ThePower** - Centro de Formación Profesional

## 📄 Licencia

Este proyecto se distribuye bajo **Licencia de Uso Libre** - Libre para usar, modificar y distribuir con propósitos educativos y profesionales.

---

**¿Preguntas o sugerencias?** Abre un issue en el repositorio de GitHub.

# 🚀 Proyectos Integrales en Java

## 📋 Descripción

Colección de proyectos completos que aplican y combinan todos los conceptos aprendidos: **POO**, **estructuras de datos**, **interfaces**, **herencia** y **polimorfismo**. Cada proyecto es un caso práctico real.

## 🎯 Proyectos Disponibles

### 1️⃣ **Superhéroes** 🦸

**Ubicación**: `superheroes/`

**Descripción**: Sistema de gestión de superhéroes con diferentes poderes y habilidades especiales.

**Conceptos aplicados:**

- ✅ Herencia (clase abstracta `SuperHeroe`)
- ✅ Interfaces múltiples (`Volador`, `ArtesMarciales`, `LanzarTelaraña`)
- ✅ Polimorfismo (método `usarPoder()`)
- ✅ Encapsulación (atributos privados/protected)
- ✅ Pattern matching moderno (Java 14+)

**Clases principales:**

- `SuperHeroe`: Clase abstracta base
- `Superman`: Implementa `Volador`
- `Batman`: Implementa `ArtesMarciales`
- `Spiderman`: Implementa `Volador` + `ArtesMarciales` + `LanzarTelaraña`
- `Hulk`: Sistema de rabia progresiva

**Ejemplo de uso:**

```bash
java com.dam.programacion.proyectos.superheroes.aplicacion.Main
```

---

### 2️⃣ **Animales** 🐾

**Ubicación**: `animales/`

**Descripción**: Simulador de animales con diferentes tipos y comportamientos.

**Conceptos aplicados:**

- ✅ Jerarquía de clases (Animal → Perro, Gato, Pez, Pajaro, Mosquito)
- ✅ Interfaces segregadas (`Volador`, `Picotear`)
- ✅ Métodos abstractos y concretos
- ✅ Atributos especiales por especie
- ✅ Polimorfismo de interfaces

**Clases principales:**

- `Animal`: Clase abstracta con métodos comunes
- `Gato`: Sistema de 7 vidas
- `Perro`: Raza variable
- `Pez`: Comportamiento acuático
- `Pajaro`: Volador + Picotero
- `Mosquito`: Pequeño depredador volador

**Capacidades especiales:**

- 🐱 Gato: `ronronear()`, `aranyar()`, `restarVidas()`
- 🐕 Perro: `ladrar()`, constructor con raza
- 🐟 Pez: `nadar()`
- 🐦 Pajaro: `volar()`, `aterrizar()`, `picoteo()`
- 🦟 Mosquito: `volar()`, `picoteo()`, `matarMosquito()`

**Ejemplo de uso:**

```bash
java com.dam.programacion.proyectos.animales.Main
```

---

### 3️⃣ **Carreras** 🏃

**Ubicación**: `carreras/`

**Descripción**: Sistema de gestión de corredores en competiciones de carreras.

**Conceptos aplicados:**

- ✅ Herencia de tipos de corredores
- ✅ Interface `Patrocinable`
- ✅ Polimorfismo en métodos de entrenamiento
- ✅ Cálculo de cuotas según categoría
- ✅ Gestión de patrocinadores

**Clases principales:**

- `Entrenamiento`: Datos del entrenamiento
- `CorredorPopular`: Aficionado sin patrocinio
- `CorredorJuvenil`: Menores de edad
- `CorredorFederado`: Federado con cuota
- `CorredorElite`: Profesional con patrocinadores
- `Patrocinable`: Interface para patrocinios
- `Profesional`: Interface para corredores pro

**Características:**

- 👤 Corredor Popular: Cuota base baja
- 👨‍🎓 Corredor Juvenil: Descuento por edad
- 🏅 Corredor Federado: Cuota estándar
- 🌟 Corredor Elite: Múltiples patrocinadores

**Ejemplo de uso:**

```bash
java com.dam.programacion.proyectos.carreras.aplicacion.Main
```

---

### 4️⃣ **Urgencias** 🏥

**Ubicación**: `urgencias/`

**Descripción**: Sistema de triage para emergencias hospitalarias.

**Conceptos aplicados:**

- ✅ Gestión de casos clínicos
- ✅ Clasificación de urgencia
- ✅ Diagnóstico basado en síntomas
- ✅ Estructuras de control complejas
- ✅ Manejo de entrada/salida

**Clases principales:**

- `EmergencyTriageSystem`: Motor de evaluación
- `EmergencyTriageExample`: Programa de demostración

**Clasificación de urgencia:**

- 🔴 **Crítico**: Vida en peligro inmediato
- 🟠 **Muy Urgente**: Riesgo potencial importante
- 🟡 **Urgente**: Necesita atención rápida
- 🟢 **Normal**: Puede esperar

**Síntomas evaluados:**

- Dolor en el pecho
- Dificultad respiratoria
- Pérdida de conciencia
- Sangrado severo
- Fracturas
- Y más...

**Ejemplo de uso:**

```bash
java com.dam.programacion.proyectos.urgencias.EmergencyTriageExample
```

---

## 📊 Matriz de Conceptos

| Concepto      | Superhéroes | Animales | Carreras | Urgencias |
| ------------- | :---------: | :------: | :------: | :-------: |
| Herencia      |     ✅      |    ✅    |    ✅    |    ❌     |
| Interfaces    |     ✅      |    ✅    |    ✅    |    ❌     |
| Polimorfismo  |     ✅      |    ✅    |    ✅    |    ❌     |
| Encapsulación |     ✅      |    ✅    |    ✅    |    ✅     |
| Abstractas    |     ✅      |    ✅    |    ✅    |    ❌     |
| Enums         |     ❌      |    ❌    |    ❌    |    ❌     |
| Colecciones   |     ✅      |    ✅    |    ✅    |    ✅     |
| I/O           |     ✅      |    ✅    |    ✅    |    ✅     |

---

## 🏗️ Estructura del Proyecto

```
proyectos/
├── README.md                    # Este archivo
├── superheroes/
│   ├── README.md
│   ├── SuperHeroe.java          # Clase abstracta
│   ├── Volar.java               # Interface
│   ├── ArtesMarciales.java      # Interface
│   ├── LanzarTelaraña.java      # Interface
│   ├── Superman.java
│   ├── Batman.java
│   ├── Spiderman.java
│   ├── Hulk.java
│   ├── Main.java                # Demo simple
│   └── aplicacion/
│       └── Main.java            # Demo avanzada
├── animales/
│   ├── README.md
│   ├── Animal.java              # Clase abstracta
│   ├── Volador.java             # Interface
│   ├── Picotear.java            # Interface
│   ├── Perro.java
│   ├── Gato.java
│   ├── Pajaro.java
│   ├── Mosquito.java
│   ├── Pez.java
│   └── Main.java
├── carreras/
│   ├── README.md
│   ├── modelos/
│   │   ├── Entrenamiento.java
│   │   ├── Patrocinable.java    # Interface
│   │   ├── Profesional.java     # Interface
│   │   ├── CorredorPopular.java
│   │   ├── CorredorJuvenil.java
│   │   ├── CorredorFederado.java
│   │   └── CorredorElite.java
│   └── aplicacion/
│       └── Main.java
└── urgencias/
    ├── README.md
    ├── EmergencyTriageSystem.java
    └── EmergencyTriageExample.java
```

---

## 🎓 Progresión de Dificultad

### Nivel 1️⃣ - Básico

**Superhéroes** + **Animales**

- Entender herencia simple
- Usar interfaces básicas
- Implementar polimorfismo

### Nivel 2️⃣ - Intermedio

**Carreras**

- Múltiples niveles de herencia
- Interfaces avanzadas
- Lógica de negocio

### Nivel 3️⃣ - Avanzado

**Urgencias**

- Sistemas complejos de control de flujo
- Gestión de casos clínicos
- Toma de decisiones basada en datos

---

## 💡 Patrones Aplicados

### Patrón Template Method

Usado en clases base para definir el flujo general:

```java
public abstract class Animal {
    public void diaDia() {
        despertarse();
        comer();
        hacerActividades();
        dormir();
    }
}
```

### Patrón Strategy (mediante Interfaces)

Diferentes formas de hacer lo mismo:

```java
// Diferentes tipos de Corredores con estrategias distintas
interface Competidor {
    void prepararse();
    void competir();
}
```

### Patrón Adapter

Compatibilidad entre interfaces:

```java
// Un animal volador que también puede ser acuático
class Pato implements Volador, Acuatico {
    // Implementa ambas interfaces
}
```

---

## 🚀 Cómo Ejecutar

### Compilar todos los proyectos

```bash
cd src/main/java
javac com/dam/programacion/proyectos/**/*.java
```

### Ejecutar un proyecto específico

```bash
# Superhéroes
java com.dam.programacion.proyectos.superheroes.aplicacion.Main

# Animales
java com.dam.programacion.proyectos.animales.Main

# Carreras
java com.dam.programacion.proyectos.carreras.aplicacion.Main

# Urgencias
java com.dam.programacion.proyectos.urgencias.EmergencyTriageExample
```

---

## 📈 Progresión de Aprendizaje

```
Fundamentos
    ↓
Estructuras de Control & Operadores
    ↓
Arrays & Colecciones
    ↓
POO: Clases & Objetos
    ↓
POO: Herencia & Polimorfismo
    ↓
Interfaces & Abstracciones
    ↓
PROYECTOS INTEGRALES ← Aquí estás
    ↓
Excepciones & Manejo de Errores
    ↓
I/O Avanzado
    ↓
Patrones de Diseño
```

---

## ✅ Checklist de Competencias

Después de completar todos los proyectos, deberías poder:

- [ ] Diseñar jerarquías de clases efectivas
- [ ] Decidir cuándo usar herencia vs composición
- [ ] Implementar múltiples interfaces correctamente
- [ ] Aplicar polimorfismo en situaciones reales
- [ ] Crear sistemas extensibles y mantenibles
- [ ] Usar pattern matching (Java 14+)
- [ ] Documentar código con JavaDoc
- [ ] Resolver problemas de diseño comunes
- [ ] Refactorizar código para mejorar claridad
- [ ] Demostrar tus habilidades en GitHub

---

## 🎁 Bonus: Mejoras Sugeridas

### Para Superhéroes:

- [ ] Sistema de energía/poder
- [ ] Combates entre héroes
- [ ] Almacenamiento de historial de acciones

### Para Animales:

- [ ] Sistema de hambre/energía
- [ ] Reproducción y ciclo de vida
- [ ] Ecosistema con cadena alimenticia

### Para Carreras:

- [ ] Sistema de clasificación
- [ ] Historial de participaciones
- [ ] Cálculo de records personales

### Para Urgencias:

- [ ] Base de datos de pacientes
- [ ] Historial médico
- [ ] Reportes de urgencias

---

## 📝 Notas Importantes

- Todos los proyectos usan **Java 21**
- Código completamente documentado con **JavaDoc**
- Ejemplos ejecutables listos para **GitHub**
- Diseñados para **entrevistas técnicas**
- Demuestran **buenas prácticas de programación**

---

**¡Felicidades!** Has completado todos los proyectos de educación en Java.

Ahora estás listo para:

- 📦 Contribuir a proyectos open-source
- 💼 Entrevistas técnicas
- 🚀 Desarrollo profesional
- 📚 Patrones de diseño avanzados

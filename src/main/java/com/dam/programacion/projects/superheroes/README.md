# Proyecto Superhéroes - POO Avanzada

## Descripción

Este proyecto demuestra conceptos avanzados de Programación Orientada a Objetos en Java, incluyendo:

- **Herencia**: Clases que heredan de `SuperHeroe`
- **Polimorfismo**: Diferentes superhéroes con comportamientos distintos
- **Interfaces**: Implementación de habilidades especiales (`Volar`, `ArtesMarciales`, `LanzarTelaraña`)
- **Clases Abstractas**: `SuperHeroe` como base para todos los héroes
- **Encapsulación**: Uso de atributos privados y métodos públicos

## Estructura del Proyecto

```
superheroes/
├── SuperHeroe.java          # Clase abstracta base
├── Volar.java               # Interfaz para habilidad de vuelo
├── ArtesMarciales.java      # Interfaz para combate cuerpo a cuerpo
├── LanzarTelaraña.java      # Interfaz específica de Spiderman
├── Superman.java            # Implementación de Superman
├── Batman.java              # Implementación de Batman
├── Spiderman.java           # Implementación de Spiderman
├── Hulk.java                # Implementación de Hulk
├── Main.java                # Demo alternativa con casting
└── aplicacion/
    └── Main.java            # Demo principal completa
```

## Superhéroes Implementados

### Superman

- **Identidad Secreta**: Clark Kent
- **Habilidades**: Vuelo, super fuerza
- **Interfaz**: `Volar`
- **Características**:
  - Nivel de fortaleza: 100
  - Vuela a 10,000 metros de altitud
  - Puede levantar toneladas sin esfuerzo

### Batman

- **Identidad Secreta**: Bruce Wayne
- **Habilidades**: Artes marciales, gadgets tecnológicos
- **Interfaz**: `ArtesMarciales`
- **Características**:
  - Posee el Batmóvil
  - Experto en combate cuerpo a cuerpo
  - Utiliza estrategia e inteligencia

### Spiderman

- **Identidad Secreta**: Peter Parker
- **Habilidades**: Telaraña, artes marciales, sentido arácnido
- **Interfaces**: `LanzarTelaraña`, `ArtesMarciales`
- **Características**:
  - 100 telarañas disponibles
  - Sentido arácnido activo
  - Puede volar entre edificios con telaraña

### Hulk

- **Identidad Secreta**: Bruce Banner
- **Habilidades**: Fuerza incrementable, resistencia
- **Interfaz**: `ArtesMarciales`
- **Características**:
  - Nivel de rabia: 0-100%
  - Fuerza base: 150
  - La fuerza aumenta con la rabia

## Conceptos Demostrados

### 1. Herencia

Todos los superhéroes heredan de la clase abstracta `SuperHeroe`:

```java
public abstract class SuperHeroe {
    protected String nombre;
    protected String identidadSecreta;
    public abstract void usarPoder();
}
```

### 2. Interfaces Múltiples

Spiderman implementa múltiples interfaces:

```java
public class Spiderman extends SuperHeroe implements LanzarTelaraña, ArtesMarciales
```

### 3. Polimorfismo

Array de `SuperHeroe` que almacena diferentes tipos:

```java
SuperHeroe[] heroes = {superman, batman, spiderman, hulk};
for (SuperHeroe heroe : heroes) {
    heroe.usarPoder(); // Llamada polimórfica
}
```

### 4. Casting y `instanceof`

Verificación de tipo y casting seguro:

```java
if (heroe instanceof Superman) {
    ((Superman) heroe).volar();
}
```

## Ejecución

### Main Principal (Demo Completa)

```bash
java com.dam.programacion.proyectos.superheroes.aplicacion.Main
```

### Main Alternativo (Casting Demo)

```bash
java com.dam.programacion.proyectos.superheroes.Main
```

## Salida Ejemplo

```
============================================
   DEMO DE SUPERHEROES - POLIMORFISMO EN JAVA
============================================

--- INFORMACION DE LOS SUPERHEROES ---

Superheroe: Superman | Identidad secreta: Clark Kent
[Superman] Tengo todos los superpoderes! Puedo volar, tengo super fuerza y soy invulnerable.

Superheroe: Batman | Identidad secreta: Bruce Wayne
[Batman] Soy millonario, traumatizado, inteligente y tengo gadgets increibles.

Superheroe: Spiderman | Identidad secreta: Peter Parker
[Spiderman] Lanzo telaraña con precision y atrapo a los criminales...

Superheroe: Hulk | Identidad secreta: Bruce Banner
[Hulk] ¡RRRAAAARGH! Cuanta mas rabia tengo, mas fuerte me vuelvo...
```

## Aprendizaje

Este proyecto es ideal para aprender:

- ✅ Diseño de clases con herencia
- ✅ Implementación de interfaces
- ✅ Uso efectivo del polimorfismo
- ✅ Encapsulación de datos
- ✅ Métodos abstractos
- ✅ Casting de tipos
- ✅ Uso de `instanceof`
- ✅ Documentación JavaDoc

## Extensiones Posibles

1. **Agregar más superhéroes**: Wonder Woman, Flash, Iron Man
2. **Sistema de combate**: Implementar batallas entre superhéroes
3. **Niveles de poder**: Sistema de experiencia y mejoras
4. **Enemigos**: Crear villanos con sus propias habilidades
5. **Equipos**: Liga de la Justicia vs Vengadores

---

**Autor**: Andrea Gicela Bravo Landeta (@roseprogramming)  
**Estudiante de DAM** - Desarrollo de Aplicaciones Multiplataforma en ThePower  
**Versión**: Java 21 | **Fecha**: Diciembre 2025

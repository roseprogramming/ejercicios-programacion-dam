# 📚 Fundamentos de Programación en Java

## 📋 Descripción

Conjunto completo de ejemplos educativos que cubren los conceptos fundamentales de la programación en Java. Diseñado para aprender y practicar los bloques básicos necesarios para cualquier programa.

## 🎯 Temas Cubiertos

### 1️⃣ **Entrada/Salida (I/O)**

📂 `entrada_salida/`

Manejo de entrada y salida de datos usando:

- **System.out.print()** y **System.out.println()**
- **Scanner** para lectura de datos desde consola
- **Concatenación de strings** con variables
- **Manejo de errores** con try-catch

#### Archivo: `Main.java`

Implementa una **calculadora simple** que:

- Solicita dos números al usuario
- Realiza operaciones básicas (suma, resta, multiplicación, división, módulo)
- Valida entrada de datos
- Maneja excepciones de entrada inválida

**Ejemplo de uso:**

```
Introduzca el primer valor (a): 20
Introduzca el segundo valor (b): 5

La suma de 20 y 5 es: 25
La resta de 20 y 5 es: 15
La multiplicación de 20 y 5 es: 100
La división de 20 entre 5 es: 4.0
El resto de 20 entre 5 es: 0
```

### 2️⃣ **Excepciones Avanzadas** ⭐ (Priority Medium)

📄 `AdvancedExceptionHandling.java`

Manejo avanzado y profesional de excepciones:

- **Multi-catch**: Capturar múltiples excepciones en un catch (Java 7+)
- **Exception chaining**: Encadenar excepciones (causa y efecto)
- **Re-lanzamiento**: Re-lanzar excepciones con contexto adicional
- **Finally block**: Ejecución garantizada de código de limpieza
- **Try-with-resources**: Cierre automático de recursos (Java 7+)
- **Stack trace**: Análisis de la pila de llamadas
- **Custom exceptions avanzadas**: Excepciones personalizadas con información adicional
- **Excepciones suprimidas**: Manejo de múltiples errores simultáneos

**Ejemplo: Multi-catch**

```java
try {
    // Código que puede fallar
} catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
    // Un único catch para múltiples tipos
    System.out.println("Error: " + e.getClass().getSimpleName());
}
```

**Ejemplo: Exception chaining**

```java
try {
    int valor = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    // Encadenar excepción de bajo nivel a de aplicación
    throw new RuntimeException("Error procesando entrada", e);
}
```

### 3️⃣ **Estructuras de Control**

📂 `estructuras_control/`

Control del flujo de ejecución de programas:

- **Condicionales**: if, else if, else
- **Switch statement** (con syntax moderno de Java 14+)
- **Bucles**: while, do-while, for, for-each
- **Control de bucles**: break, continue
- **Operador ternario**: ? :

#### Archivo: `EstructurasControl.java`

Demuestra cada estructura con ejemplos interactivos:

- Evaluación de números con if-else
- Días de la semana con switch
- Conteo con diferentes tipos de bucles
- Filtrado de números pares/impares
- Interacción con el usuario

**Conceptos clave:**

- Diferencia entre while y do-while
- Por qué se usa for y for-each
- Cuándo usar break y continue
- Ventajas del switch moderno con `->` (arrow syntax)

### 3️⃣ **Operadores**

📂 `operadores/`

Todos los tipos de operadores disponibles en Java:

#### Operadores Aritméticos: `+`, `-`, `*`, `/`, `%`

```java
int suma = 20 + 5;      // 25
int resta = 20 - 5;     // 15
int multi = 20 * 5;     // 100
int div = 20 / 5;       // 4
int resto = 20 % 5;     // 0
```

#### Operadores de Asignación: `=`, `+=`, `-=`, `*=`, `/=`, `%=`

```java
int valor = 10;
valor += 5;  // valor = valor + 5 (15)
valor *= 2;  // valor = valor * 2 (30)
```

#### Operadores Incremento/Decremento: `++`, `--`

```java
int x = 5;
x++;     // Post-incremento: usa el valor actual, luego incrementa
++x;     // Pre-incremento: incrementa primero, luego usa el valor
x--;     // Post-decremento
--x;     // Pre-decremento
```

#### Operadores Relacionales: `==`, `!=`, `<`, `>`, `<=`, `>=`

```java
5 == 5;   // true
5 != 3;   // true
5 > 3;    // true
5 < 3;    // false
```

#### Operadores Lógicos: `&&`, `||`, `!`

```java
true && false;  // false (AND lógico)
true || false;  // true (OR lógico)
!true;          // false (NOT lógico)
```

#### Operadores Bit a Bit: `&`, `|`, `^`, `~`, `<<`, `>>`

```java
5 & 3;   // 1 (AND bit a bit)
5 | 3;   // 7 (OR bit a bit)
5 ^ 3;   // 6 (XOR bit a bit)
5 << 1;  // 10 (desplazamiento izquierda)
5 >> 1;  // 2 (desplazamiento derecha)
```

#### Operador Ternario: `? :`

```java
String estado = edad >= 18 ? "Mayor de edad" : "Menor de edad";
```

#### Archivo: `Operadores.java`

Demostración completa de todos los operadores con:

- Ejemplos claros de cada tipo
- Explicación de precedencia
- Diferencia entre pre y post incremento
- Representación binaria en operadores bit a bit

## 🏗️ Estructura del Proyecto

```
fundamentos/
├── entrada_salida/
│   ├── Main.java              # Calculadora simple
│   └── README.md              # Este archivo
├── estructuras_control/
│   └── EstructurasControl.java # Demostraciones de control de flujo
└── operadores/
    └── Operadores.java        # Demostraciones de operadores
```

## 🚀 Ejecución

### Compilar un archivo

```bash
# Entrada/Salida
javac com/dam/programacion/fundamentos/entrada_salida/Main.java

# Estructuras de Control
javac com/dam/programacion/fundamentos/estructuras_control/EstructurasControl.java

# Operadores
javac com/dam/programacion/fundamentos/operadores/Operadores.java
```

### Ejecutar

```bash
# Entrada/Salida (interactivo)
java com.dam.programacion.fundamentos.entrada_salida.Main

# Estructuras de Control (interactivo)
java com.dam.programacion.fundamentos.estructuras_control.EstructurasControl

# Operadores (no requiere entrada)
java com.dam.programacion.fundamentos.operadores.Operadores
```

## 💡 Conceptos Importantes

### Precedencia de Operadores

En Java, los operadores tienen un orden de evaluación:

1. **Paréntesis** `()`
2. **Incremento/Decremento** `++`, `--`
3. **Multiplicación/División** `*`, `/`, `%`
4. **Suma/Resta** `+`, `-`
5. **Desplazamientos** `<<`, `>>`, `>>>`
6. **Relacionales** `<`, `>`, `<=`, `>=`
7. **Igualdad** `==`, `!=`
8. **AND bit a bit** `&`
9. **XOR bit a bit** `^`
10. **OR bit a bit** `|`
11. **AND lógico** `&&`
12. **OR lógico** `||`
13. **Ternario** `? :`
14. **Asignación** `=`, `+=`, `-=`, etc.

**Ejemplo:**

```java
2 + 3 * 4;      // = 14 (multiplicación primero)
(2 + 3) * 4;    // = 20 (paréntesis primero)
```

### Conversión de Tipos

```java
int a = 20;
int b = 5;
float resultado = (float) a / b;  // 4.0 (cast de a a float)
```

### Cortocircuito Lógico

```java
// AND (&&): si la primera es false, no evalúa la segunda
if (x > 0 && y > 0) { ... }

// OR (||): si la primera es true, no evalúa la segunda
if (x < 0 || y < 0) { ... }
```

## 📚 Ejercicios Propuestos

### Nivel Básico

1. Crea una calculadora que pida 2 números y muestre todas las operaciones
2. Escribe un programa que determine si un número es par o impar
3. Pide 3 números y muestra el mayor

### Nivel Intermedio

1. Crea un menú interactivo para elegir operación
2. Escribe un programa que cuente números pares e impares del 1 al 100
3. Determina si un año es bisiesto

### Nivel Avanzado

1. Crea una calculadora con histórico de operaciones
2. Implementa un juego de adivinación de números
3. Realiza operaciones con manipulación de bits

## 🔍 Cosas a Notar

- **Type Safety**: Java verifica tipos en tiempo de compilación
- **Integer Division**: `5 / 2` da `2`, no `2.5`
- **String Concatenation**: `"Resultado: " + 25` crea un String
- **Scanner Resources**: Siempre cierra Scanner con `.close()`
- **Switch Statement**: Desde Java 14 puedes usar arrow syntax `case x ->`

## 📖 Referencias

- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [Java Language Guide](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/)
- [Operators in Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

## ✅ Checklist de Aprendizaje

- [ ] Puedo usar System.out.println() correctamente
- [ ] Sé cómo crear y usar objetos Scanner
- [ ] Entiendo if-else y switch
- [ ] Sé diferenciar entre while, do-while y for
- [ ] Conozco el propósito de break y continue
- [ ] Entiendo todos los operadores aritméticos
- [ ] Sé cuándo usar == vs igualdad en strings
- [ ] Entiendo && y || (cortocircuito)
- [ ] Conozco la precedencia de operadores
- [ ] Sé hacer casting de tipos

---

**Siguiente paso:** Estudia **Programación Orientada a Objetos (POO)** en la carpeta `poo/`

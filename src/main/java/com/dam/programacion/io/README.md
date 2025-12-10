# 📥 Entrada/Salida (I/O) en Java

## 🎯 Descripción

Módulo que cubre todas las formas de entrada y salida de datos en Java, desde consola hasta archivos complejos.

## 📂 Estructura del módulo

```
io/
├── console/
│   └── Calculator.java         # I/O básico por consola con Scanner
├── files/
│   ├── text/                   # Lectura/escritura de texto
│   ├── binary/                 # Archivos binarios
│   ├── serializable/           # Serialización de objetos
│   ├── xml/                    # Procesamiento XML
│   ├── AdvancedFileOperations.java  # NIO.2 (Java 7+) - Paths, Files
│   └── ADVANCED_NIO2_README.md
└── README.md                   # Este archivo
```

## 🔍 Descripción de carpetas

### 1️⃣ **console/** - I/O por Consola

**Categoría:** Básico

Entrada/salida interactiva con el usuario a través de consola.

#### `Calculator.java`

- Scanner para lectura
- System.out para escritura
- Validación de entrada (InputMismatchException)
- Try-catch-finally para recursos

**Ejecutar:**

```bash
java com.dam.programacion.io.console.Calculator
```

---

### 2️⃣ **files/** - I/O de Archivos

Manejo de archivos en todas sus formas.

#### **text/** - Archivos de Texto

- `BasicFileReadWrite.java` - FileReader/FileWriter
- `BufferedFileReadWrite.java` - Con buffer para mejor rendimiento
- `FileCopyExample.java` - Copiar archivos línea por línea
- `FileContentReverser.java` - Invertir contenido

#### **binary/** - Archivos Binarios

- `BinaryFileExample.java` - Leer/escribir bytes
- `PersonBinaryWriter.java` - Serialización manual de estructuras

#### **serializable/** - Serialización de Objetos

- `PersonSerializer.java` - Guardar/cargar objetos .ser
- `PersonSerializerV2.java` - Con versionado

#### **xml/** - Procesamiento XML

- Lectura/escritura de XML con estructura anidada

#### **AdvancedFileOperations.java** ⭐ (Priority Medium)

API moderno NIO.2 (Java 7+):

- Paths y Files (java.nio.file)
- FileAttributes (metadatos)
- DirectoryStream (iteración eficiente)
- Files.walk() (búsqueda recursiva)
- Operaciones seguras (copiar, mover, eliminar)

---

## 🎓 Ruta de aprendizaje

### Nivel 1: Básico

1. `console/Calculator.java` - Entrada/salida interactiva
2. `files/text/BasicFileReadWrite.java` - Lectura/escritura simple

### Nivel 2: Intermedio

3. `files/text/BufferedFileReadWrite.java` - Uso de buffers
4. `files/binary/BinaryFileExample.java` - Archivos binarios
5. `files/serializable/PersonSerializer.java` - Serialización

### Nivel 3: Avanzado

6. `files/AdvancedFileOperations.java` - NIO.2 moderno (Java 7+)
7. `files/ADVANCED_NIO2_README.md` - Guía completa

---

## 💡 Conceptos Clave

### Scanner - Lectura de entrada

```java
Scanner scanner = new Scanner(System.in);
int numero = scanner.nextInt();        // Lectura de entero
String texto = scanner.nextLine();     // Lectura de línea
```

### FileWriter/FileReader - I/O básico

```java
try (FileWriter fw = new FileWriter("archivo.txt")) {
    fw.write("Contenido");              // Escritura
} catch (IOException e) { }

try (FileReader fr = new FileReader("archivo.txt")) {
    int c;
    while ((c = fr.read()) != -1) { }  // Lectura
}
```

### BufferedWriter/BufferedReader - I/O optimizado

```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))) {
    bw.write("Línea 1");
    bw.newLine();                      // Salto de línea seguro
} catch (IOException e) { }
```

### Serialización - Guardar objetos

```java
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.ser"))) {
    oos.writeObject(objeto);           // Guardar objeto
} catch (IOException e) { }
```

### NIO.2 Moderno (Java 7+) - API nueva

```java
Path archivo = Paths.get("datos.txt");
Files.write(archivo, contenido.getBytes());  // Escribir
List<String> lineas = Files.readAllLines(archivo);  // Leer
Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
```

---

## 📊 Comparación de APIs

| Característica       | java.io (antiguo)   | java.nio.file (moderno)     |
| -------------------- | ------------------- | --------------------------- |
| **Clase principal**  | File, FileReader    | Path, Files                 |
| **Rutas**            | String manipulation | Abstracto, independiente SO |
| **Atributos**        | Limitados           | Completos                   |
| **Excepciones**      | Boolean retorno     | IOException explícito       |
| **Performance**      | Normal              | Optimizado                  |
| **Disponible desde** | Java 1.0            | Java 7+                     |

**Recomendación:** Usar java.nio.file en código nuevo.

---

## 🚀 Casos de uso por tipo

### 📝 Leer/escribir texto simple

→ `files/text/BasicFileReadWrite.java`

### ⚡ Leer/escribir MUCHAS líneas (eficiente)

→ `files/text/BufferedFileReadWrite.java`

### 📦 Guardar objeto Java

→ `files/serializable/PersonSerializer.java`

### 🔢 Datos binarios puros

→ `files/binary/BinaryFileExample.java`

### 🏛️ Datos XML

→ `files/xml/` (ejemplo con etiquetas anidadas)

### 🚀 Operaciones modernas (copiar, buscar, atributos)

→ `files/AdvancedFileOperations.java` (NIO.2)

---

## ✅ Checklist de aprendizaje

- [ ] Entiendo Scanner para lectura de consola
- [ ] Sé escribir archivos con FileWriter
- [ ] Sé leer archivos con FileReader
- [ ] Entiendo el propósito de BufferedWriter/Reader
- [ ] Conozco la diferencia entre texto y binario
- [ ] Sé serializar/deserializar objetos
- [ ] Entiendo Paths y Files (NIO.2)
- [ ] Puedo usar DirectoryStream para iterar
- [ ] Sé obtener atributos de archivo
- [ ] Conozco Files.walk() para búsquedas

---

## 🔗 Conceptos relacionados

- **basics/exceptions/** - Manejo de IOException
- **basics/exceptions/AdvancedExceptionHandling.java** - Try-with-resources
- **collections/list/** - Almacenar datos leídos
- **projects/** - Aplicaciones reales usando I/O

---

## 📚 Recursos recomendados

- JavaDoc: `java.util.Scanner`
- JavaDoc: `java.io.FileReader/FileWriter`
- JavaDoc: `java.nio.file.Files`
- JavaDoc: `java.io.ObjectInputStream/ObjectOutputStream`

---

**Siguiente:** Explorar Collections o POO avanzado

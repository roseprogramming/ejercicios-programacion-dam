# 📂 I/O Files Avanzado - NIO.2

## 🎯 Descripción

Este módulo cubre el API moderno de I/O de Java (NIO.2), introducido en Java 7, que proporciona una interfaz mejorada y más poderosa para trabajar con archivos y directorios.

## ⭐ Priority Medium - Conceptos clave

### API java.nio.file vs java.io

| Característica | Antiguo (java.io) | Moderno (java.nio.file) |
|---|---|---|
| **Clase base** | File | Path (interfaz) / Files (utilidades) |
| **Rutas** | Manipulación de strings | Abstracción independiente del SO |
| **Atributos** | Limitados | Completos (BasicFileAttributes) |
| **Excepciones** | Retorno de boolean | IOException explícito |
| **Operaciones masivas** | Lento | Optimizado con Streams |
| **Recursos** | Manual .close() | Try-with-resources automático |

## 📚 Temas Cubiertos

### 1️⃣ **Paths y Files (NIO.2 moderna)**

Trabajar con rutas abstractas e independientes del sistema operativo:

```java
Path archivo = Paths.get("datos.txt");
System.out.println(archivo.getFileName());        // datos.txt
System.out.println(archivo.toAbsolutePath());     // Ruta completa
```

**Ventajas:**
- Independencia de separadores (/ vs \)
- Operaciones encadenables
- Mejor rendimiento

### 2️⃣ **File Attributes (Metadatos)**

Acceder a información del archivo sin necesidad de bibliotecas externas:

```java
BasicFileAttributes attrs = Files.readAttributes(archivo, BasicFileAttributes.class);
System.out.println(attrs.creationTime());      // Cuándo se creó
System.out.println(attrs.lastModifiedTime());  // Última modificación
System.out.println(attrs.size());              // Tamaño en bytes
```

**Información disponible:**
- Fechas de creación, modificación, acceso
- Tamaño del archivo
- Permisos (legible, escribible, ejecutable)
- Identificadores únicos

### 3️⃣ **DirectoryStream (Iteración eficiente)**

Iterar sobre archivos en un directorio sin cargar todo en memoria:

```java
try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorio)) {
    for (Path archivo : stream) {
        System.out.println(archivo.getFileName());
    }
}
```

**Beneficios:**
- Eficiente con directorios grandes
- Cierre automático (try-with-resources)
- Filtrado opcional

### 4️⃣ **Files.walk() (Búsqueda recursiva)**

Buscar archivos recursivamente con API funcional:

```java
try (Stream<Path> paths = Files.walk(directorio)) {
    paths.filter(p -> p.toString().endsWith(".java"))
         .forEach(System.out::println);
}
```

**Casos de uso:**
- Búsqueda de archivos por extensión
- Análisis recursivo de directorios
- Estadísticas de carpetas

### 5️⃣ **Operaciones de archivo**

Copiar, mover, eliminar archivos de forma segura:

```java
// Copiar
Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);

// Mover/Renombrar
Files.move(viejo, nuevo, StandardCopyOption.REPLACE_EXISTING);

// Eliminar
Files.delete(archivo); // Lanza IOException si no existe
Files.deleteIfExists(archivo); // No lanza excepción
```

### 6️⃣ **Crear directorios**

Crear estructuras de directorios complejas:

```java
Path ruta = Paths.get("carpeta/subcarpeta/profundo");
Files.createDirectories(ruta); // Crea padres si no existen
```

### 7️⃣ **Lectura de archivos modernos**

Tres enfoques para leer archivos según el tamaño:

```java
// Para archivos pequeños (< 100 MB)
List<String> lineas = Files.readAllLines(archivo);

// Acceso bajo nivel
byte[] bytes = Files.readAllBytes(archivo);

// Para archivos grandes (streaming)
try (Stream<String> stream = Files.lines(archivo)) {
    stream.forEach(System.out::println);
}
```

## 🔍 Ejemplo completo: Procesar archivos

```java
Path directorio = Paths.get("src");

// Encontrar todos los .java, contar líneas
try (Stream<Path> paths = Files.walk(directorio)) {
    paths.filter(p -> p.toString().endsWith(".java"))
         .forEach(p -> {
             try {
                 long lineas = Files.lines(p).count();
                 System.out.printf("%s: %d líneas%n", p.getFileName(), lineas);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         });
}
```

## ⚡ Comparación de rendimiento

| Operación | java.io | java.nio.file |
|-----------|---------|---------------|
| Listar directorio (1000 archivos) | 45ms | 12ms |
| Copiar archivo (100MB) | 250ms | 80ms |
| Acceso a atributos | limitado | completo |

**Conclusión:** Siempre usar java.nio.file en código nuevo.

## 🛠️ Try-with-resources con I/O

Cierre automático garantizado:

```java
try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
     BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
    // Los recursos se cierran automáticamente al salir
}
```

## 📊 Checklist de aprendizaje

- [ ] Entiendo la diferencia entre Path y File
- [ ] Sé cómo obtener atributos de archivo
- [ ] Puedo iterar directorios eficientemente
- [ ] Conozco Files.walk() para búsquedas recursivas
- [ ] Entiendo copiar/mover/eliminar archivos
- [ ] Sé crear directorios complejos
- [ ] Puedo leer archivos de diferentes tamaños
- [ ] Uso try-with-resources correctamente

## 🔗 Conceptos relacionados

- **basics/exceptions/AdvancedExceptionHandling** - Manejo robusto de IOException
- **io/Main.java** - I/O básico con Scanner
- **io/files/text/** - Lectura/escritura de texto básica
- **io/files/binary/** - Archivos binarios
- **io/files/serializable/** - Serialización de objetos

## 📝 Notas importantes

1. **Siempre usar java.nio.file** en código nuevo (Java 7+)
2. **Try-with-resources** garantiza cierre de recursos
3. **Streams** son ideales para archivos grandes
4. **BasicFileAttributes** proporciona información completa
5. **DirectoryStream** es más eficiente que listar arrays

---

**Siguiente:** Explorar POO avanzado o profundizar en Collections

package com.dam.programacion.io.files;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/**
 * I/O Files Avanzado - NIO.2 (New I/O 2, Java 7+)
 * 
 * Demuestra:
 * - API File de java.nio.file (Paths, Files)
 * - Atributos de archivo (FileAttributes)
 * - DirectoryStream para iterar directorios
 * - Operaciones de archivo modernos
 * - Comparación antiguo vs nuevo API
 * 
 * @author Andrea Gicela Bravo Landeta (Github: @roseprogramming) Estudiante de DAM en ThePower
 * @version 1.0
 */
public class AdvancedFileOperations {

    /**
     * Demuestra Paths y Files - API moderna de java.nio.file
     */
    public static void demoPathsAndFiles() {
        System.out.println("\n1️⃣  PATHS Y FILES (NIO.2 - API moderna)");
        System.out.println("======================================");
        
        // Crear un Path (ruta abstracta)
        Path archivo = Paths.get("datos.txt");
        System.out.println("  Ruta: " + archivo);
        System.out.println("  Nombre: " + archivo.getFileName());
        System.out.println("  Padre: " + archivo.getParent());
        System.out.println("  Absoluto: " + archivo.toAbsolutePath());
        
        // Crear un archivo y escribir
        try {
            Files.write(archivo, 
                "Contenido escrito con NIO.2\n".getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );
            System.out.println("  ✓ Archivo creado");
            
            // Leer archivo
            String contenido = new String(Files.readAllBytes(archivo));
            System.out.println("  ✓ Contenido: " + contenido.trim());
            
        } catch (IOException e) {
            System.out.println("  ✗ Error: " + e.getMessage());
        }
    }

    /**
     * Demuestra atributos de archivo (metadata).
     */
    public static void demoFileAttributes() {
        System.out.println("\n2️⃣  ATRIBUTOS DE ARCHIVO (FileAttributes)");
        System.out.println("=========================================");
        
        Path archivo = Paths.get("datos.txt");
        
        try {
            // Atributos básicos
            System.out.println("  Información del archivo: " + archivo.getFileName());
            System.out.println("    Existe: " + Files.exists(archivo));
            System.out.println("    Es archivo regular: " + Files.isRegularFile(archivo));
            System.out.println("    Es directorio: " + Files.isDirectory(archivo));
            System.out.println("    Es ejecutable: " + Files.isExecutable(archivo));
            System.out.println("    Tamaño: " + Files.size(archivo) + " bytes");
            
            // Atributos avanzados
            BasicFileAttributes attrs = Files.readAttributes(archivo, BasicFileAttributes.class);
            System.out.println("    Creación: " + attrs.creationTime());
            System.out.println("    Última modificación: " + attrs.lastModifiedTime());
            System.out.println("    Último acceso: " + attrs.lastAccessTime());
            
        } catch (IOException e) {
            System.out.println("  ✗ Error: " + e.getMessage());
        }
    }

    /**
     * Demuestra DirectoryStream para iterar sobre archivos en un directorio.
     */
    public static void demoDirectoryStream() {
        System.out.println("\n3️⃣  DIRECTORYSTREAM (Iteración moderna)");
        System.out.println("=======================================");
        
        Path directorio = Paths.get(".");
        
        try {
            System.out.println("  Archivos en directorio actual:");
            
            // DirectoryStream - forma moderna
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorio)) {
                int contador = 0;
                for (Path archivo : stream) {
                    if (contador < 5) { // Mostrar solo 5 archivos
                        String tipo = Files.isDirectory(archivo) ? "[DIR]" : "[FLE]";
                        System.out.printf("    %-30s %s%n", tipo, archivo.getFileName());
                        contador++;
                    }
                }
                if (contador == 5) {
                    System.out.println("    ... (más archivos)");
                }
            }
            
        } catch (IOException e) {
            System.out.println("  ✗ Error: " + e.getMessage());
        }
    }

    /**
     * Demuestra Files.walk() para buscar archivos recursivamente.
     */
    public static void demoFilesWalk() {
        System.out.println("\n4️⃣  FILES.WALK() (Búsqueda recursiva)");
        System.out.println("====================================");
        
        Path directorio = Paths.get("src");
        
        try {
            System.out.println("  Archivos .java encontrados:");
            
            // Files.walk() - búsqueda recursiva con Streams
            try (Stream<Path> paths = Files.walk(directorio)) {
                paths.filter(p -> p.toString().endsWith(".java"))
                     .limit(5)
                     .forEach(p -> System.out.println("    " + p));
            }
            
        } catch (IOException e) {
            System.out.println("  ✗ Error: " + e.getMessage());
        }
    }

    /**
     * Demuestra operaciones de archivo: copiar, mover, eliminar.
     */
    public static void demoFileOperations() {
        System.out.println("\n5️⃣  OPERACIONES DE ARCHIVO (Copiar, mover, eliminar)");
        System.out.println("===================================================");
        
        Path original = Paths.get("datos.txt");
        Path copia = Paths.get("datos_copia.txt");
        
        try {
            // Copiar
            if (Files.exists(original)) {
                Files.copy(original, copia, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("  ✓ Archivo copiado: " + copia.getFileName());
            }
            
            // Mover
            Path renombrado = Paths.get("datos_renombrado.txt");
            if (Files.exists(copia)) {
                Files.move(copia, renombrado, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("  ✓ Archivo movido: " + renombrado.getFileName());
            }
            
            // Eliminar
            if (Files.exists(renombrado)) {
                Files.delete(renombrado);
                System.out.println("  ✓ Archivo eliminado: " + renombrado.getFileName());
            }
            
        } catch (IOException e) {
            System.out.println("  ✗ Error: " + e.getMessage());
        }
    }

    /**
     * Demuestra creación de directorios.
     */
    public static void demoCreateDirectories() {
        System.out.println("\n6️⃣  CREAR DIRECTORIOS");
        System.out.println("====================");
        
        Path directorio = Paths.get("carpeta_nuevo/subcarpeta/profundo");
        
        try {
            // Crear directorios (incluyendo padres)
            Files.createDirectories(directorio);
            System.out.println("  ✓ Directorio creado: " + directorio);
            
            // Crear archivo dentro
            Path archivo = directorio.resolve("archivo.txt");
            Files.write(archivo, "Contenido en subcarpeta".getBytes());
            System.out.println("  ✓ Archivo creado dentro: " + archivo.getFileName());
            
            // Limpiar
            Files.delete(archivo);
            Files.deleteIfExists(directorio);
            System.out.println("  ✓ Limpieza realizada");
            
        } catch (IOException e) {
            System.out.println("  ✗ Error: " + e.getMessage());
        }
    }

    /**
     * Comparación: Antiguo API (java.io) vs Moderno (java.nio.file)
     */
    public static void demoComparison() {
        System.out.println("\n7️⃣  COMPARACIÓN: ANTIGUO vs MODERNO API");
        System.out.println("=======================================");
        
        System.out.println("  ANTIGUO (java.io.File):");
        System.out.println("    File f = new File(\"archivo.txt\");");
        System.out.println("    if (f.exists()) { }");
        System.out.println("    f.delete();");
        
        System.out.println("\n  MODERNO (java.nio.file.Paths/Files):");
        System.out.println("    Path p = Paths.get(\"archivo.txt\");");
        System.out.println("    if (Files.exists(p)) { }");
        System.out.println("    Files.delete(p);");
        
        System.out.println("\n  Ventajas del API moderno:");
        System.out.println("    ✓ Mejor manejo de excepciones (IOException)");
        System.out.println("    ✓ Operaciones con Streams integradas");
        System.out.println("    ✓ Mejor acceso a atributos de archivo");
        System.out.println("    ✓ Mejor rendimiento en operaciones masivas");
        System.out.println("    ✓ Soporte para watch service (monitoreo)");
    }

    /**
     * Demuestra lectura completa de archivo con try-with-resources.
     */
    public static void demoReadFileComplete() {
        System.out.println("\n8️⃣  LECTURA COMPLETA CON TRY-WITH-RESOURCES");
        System.out.println("==========================================");
        
        Path archivo = Paths.get("datos.txt");
        
        try {
            // Método 1: readAllLines (para archivos pequeños)
            System.out.println("  Método 1: readAllLines()");
            var lineas = Files.readAllLines(archivo);
            System.out.println("    Líneas: " + lineas.size());
            
            // Método 2: readAllBytes (acceso bajo nivel)
            System.out.println("  Método 2: readAllBytes()");
            byte[] bytes = Files.readAllBytes(archivo);
            System.out.println("    Bytes: " + bytes.length);
            
            // Método 3: Streaming (para archivos grandes)
            System.out.println("  Método 3: Stream de líneas");
            try (Stream<String> stream = Files.lines(archivo)) {
                long count = stream.count();
                System.out.println("    Líneas (con Stream): " + count);
            }
            
        } catch (IOException e) {
            System.out.println("  ✗ Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("🗂️  I/O FILES AVANZADO - NIO.2");
        System.out.println("═".repeat(50));

        demoPathsAndFiles();
        demoFileAttributes();
        demoDirectoryStream();
        demoFilesWalk();
        demoFileOperations();
        demoCreateDirectories();
        demoComparison();
        demoReadFileComplete();

        System.out.println("\n" + "═".repeat(50));
        System.out.println("✅ Demostración completada");
        System.out.println("═".repeat(50));
    }
}

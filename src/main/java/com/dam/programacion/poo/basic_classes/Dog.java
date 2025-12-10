package com.dam.programacion.poo.basic_classes;

/**
 * Clase que representa un perro con atributos y comportamientos específicos.
 * Demuestra los conceptos fundamentales de encapsulación en POO.
 * 
 * Atributos:
 * - nombre: Nombre del perro
 * - edad: Edad en años
 * - nivelEnergia: Energía del perro (0-100)
 * - nivelHambre: Nivel de hambre (0-100)
 * - estadoAnimo: Estado emocional actual
 * 
 * @author [Tu nombre]
 * @version 2.0
 */
public class Dog {
    
    // Atributos privados - Encapsulación
    private String nombre;
    private int edad;
    private int nivelEnergia;
    private int nivelHambre;
    private String estadoAnimo;
    
    // Constantes públicas
    public static final int ENERGIA_MAX = 100;
    public static final int ENERGIA_MIN = 0;
    public static final int HAMBRE_MAX = 100;
    public static final int HAMBRE_MIN = 0;
    public static final String FELIZ = "feliz";
    public static final String CANSADO = "cansado";
    public static final String HAMBRIENTO = "hambriento";
    
    // Variable de clase para contar perros
    public static int numPerros = 0;
    
    // ==================== CONSTRUCTORES ====================
    
    /**
     * Constructor por defecto que crea un perro con valores iniciales.
     */
    public Dog() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.estadoAnimo = FELIZ;
        this.nivelEnergia = ENERGIA_MAX;
        this.nivelHambre = HAMBRE_MIN;
        numPerros++;
    }
    
    /**
     * Constructor con nombre del perro.
     * @param nombre El nombre del perro
     */
    public Dog(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.estadoAnimo = FELIZ;
        this.nivelEnergia = ENERGIA_MAX;
        this.nivelHambre = HAMBRE_MIN;
        numPerros++;
    }
    
    /**
     * Constructor completo con todos los parámetros.
     * @param nombre El nombre del perro
     * @param edad La edad en años
     * @param nivelEnergia Energía inicial (0-100)
     * @param nivelHambre Hambre inicial (0-100)
     * @param estadoAnimo Estado emocional
     */
    public Dog(String nombre, int edad, int nivelEnergia, int nivelHambre, String estadoAnimo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoAnimo = estadoAnimo;
        this.nivelEnergia = Math.max(ENERGIA_MIN, Math.min(ENERGIA_MAX, nivelEnergia));
        this.nivelHambre = Math.max(HAMBRE_MIN, Math.min(HAMBRE_MAX, nivelHambre));
        numPerros++;
    }
    
    // ==================== GETTERS ====================
    
    /**
     * Obtiene el nombre del perro.
     * @return El nombre del perro
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene la edad del perro.
     * @return La edad en años
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Obtiene el nivel de energía actual.
     * @return El nivel de energía (0-100)
     */
    public int getNivelEnergia() {
        return nivelEnergia;
    }
    
    /**
     * Obtiene el nivel de hambre actual.
     * @return El nivel de hambre (0-100)
     */
    public int getNivelHambre() {
        return nivelHambre;
    }
    
    /**
     * Obtiene el estado de ánimo del perro.
     * @return El estado emocional actual
     */
    public String getEstadoAnimo() {
        return estadoAnimo;
    }
    
    /**
     * Obtiene el número total de perros creados.
     * @return Cantidad de perros
     */
    public static int getNumPerros() {
        return numPerros;
    }
    
    // ==================== SETTERS ====================
    
    /**
     * Establece el nombre del perro.
     * @param nombre El nuevo nombre
     */
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
    
    /**
     * Establece la edad del perro.
     * @param edad La nueva edad (debe ser positiva)
     */
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    /**
     * Establece el nivel de energía.
     * @param nivelEnergia Nuevo nivel (se ajusta entre 0-100)
     */
    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = Math.max(ENERGIA_MIN, Math.min(ENERGIA_MAX, nivelEnergia));
        actualizarEstadoAnimo();
    }
    
    /**
     * Establece el nivel de hambre.
     * @param nivelHambre Nuevo nivel (se ajusta entre 0-100)
     */
    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = Math.max(HAMBRE_MIN, Math.min(HAMBRE_MAX, nivelHambre));
        actualizarEstadoAnimo();
    }
    
    /**
     * Establece el estado de ánimo del perro.
     * @param estadoAnimo El nuevo estado emocional
     */
    public void setEstadoAnimo(String estadoAnimo) {
        if (estadoAnimo != null && !estadoAnimo.isEmpty()) {
            this.estadoAnimo = estadoAnimo;
        }
    }
    
    // ==================== MÉTODOS ====================
    
    /**
     * El perro come, reduciendo su hambre.
     */
    public void comer() {
        if (nivelHambre > 0) {
            nivelHambre--;
            System.out.println(nombre + " está comiendo... ñam ñam");
            actualizarEstadoAnimo();
        } else {
            System.out.println(nombre + " no tiene hambre");
        }
    }
    
    /**
     * El perro juega, gastando energía e incrementando hambre.
     */
    public void jugar() {
        if (nivelEnergia >= 10) {
            nivelEnergia -= 10;
            nivelHambre = Math.min(HAMBRE_MAX, nivelHambre + 5);
            System.out.println(nombre + " está jugando feliz: ¡Guau guau!");
            actualizarEstadoAnimo();
        } else {
            System.out.println(nombre + " está muy cansado para jugar");
        }
    }
    
    /**
     * El perro duerme, recuperando energía.
     */
    public void dormir() {
        nivelEnergia = Math.min(ENERGIA_MAX, nivelEnergia + 20);
        System.out.println(nombre + " está durmiendo: zzzZZZZzz");
        actualizarEstadoAnimo();
    }
    
    /**
     * Actualiza automáticamente el estado de ánimo basado en energía y hambre.
     */
    private void actualizarEstadoAnimo() {
        if (nivelEnergia < 20) {
            estadoAnimo = CANSADO;
        } else if (nivelHambre > 70) {
            estadoAnimo = HAMBRIENTO;
        } else {
            estadoAnimo = FELIZ;
        }
    }
    
    /**
     * Muestra el estado actual del perro.
     */
    public void mostrarEstado() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("  ESTADO DE " + nombre.toUpperCase());
        System.out.println("=".repeat(40));
        System.out.println("Nombre:        " + nombre);
        System.out.println("Edad:          " + edad + " años");
        System.out.println("Energía:       " + generarBarraProgreso(nivelEnergia) + " (" + nivelEnergia + "/100)");
        System.out.println("Hambre:        " + generarBarraProgreso(nivelHambre) + " (" + nivelHambre + "/100)");
        System.out.println("Estado Animo:  " + estadoAnimo);
        System.out.println("=".repeat(40) + "\n");
    }
    
    /**
     * Genera una barra de progreso visual.
     * @param valor El valor actual (0-100)
     * @return Una representación visual con barras
     */
    private String generarBarraProgreso(int valor) {
        int bloques = valor / 10;
        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            barra.append(i < bloques ? "█" : "░");
        }
        barra.append("]");
        return barra.toString();
    }
    
    /**
     * Representación en texto del perro.
     * @return Información del perro
     */
    @Override
    public String toString() {
        return String.format("Perro {nombre='%s', edad=%d, energia=%d, hambre=%d, animo='%s'}",
                nombre, edad, nivelEnergia, nivelHambre, estadoAnimo);
    }
}

package com.dam.programacion.projects.animals;

/**
 * Clase principal que demuestra el uso del sistema de animales.
 * Muestra polimorfismo, herencia e interfaces en acción.
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== SIMULADOR DE ANIMALES ===\n");

        // Crear array de animales demostrando polimorfismo
        Animal[] misMascotas = new Animal[5];

        misMascotas[0] = new Cat("Garfield", 3, "Gato naranja");
        misMascotas[1] = new Dog("Rex", 5, "Pastor Alemán");
        misMascotas[2] = new Fish("Nemo", 1, "Pez payaso");
        misMascotas[3] = new Mosquito("Zumbador", 1, "Mosquito común");
        misMascotas[4] = new Bird("Tweety", 2, "Canario");

        // Demostración 1: Métodos comunes de Animal (polimorfismo)
        System.out.println("--- TODOS LOS ANIMALES SE PRESENTAN ---\n");
        for (Animal animal : misMascotas) {
            animal.presentarse();
            animal.hacerSonido();
            System.out.println();
        }

        // Demostración 2: Capacidades específicas usando instanceof
        System.out.println("\n--- CAPACIDADES ESPECÍFICAS DE CADA ANIMAL ---\n");
        
        for (Animal animal : misMascotas) {
            System.out.println(">>> " + animal.getNombre() + " (" + animal.getClass().getSimpleName() + "):");
            
            // Habilidades específicas de cada tipo
            switch (animal) {
                case Cat gato -> {
                    gato.ronronear();
                    gato.aranyar();
                    gato.restarVidas();
                }
                case Dog perro -> {
                    perro.ladrar();
                    System.out.println("Raza: " + perro.getRaza());
                    System.out.println("Número de patas: " + perro.getNumeroPatas());
                }
                case Fish pez -> {
                    pez.nadar();
                    pez.reproducir();
                }
                case Mosquito mosquito -> {
                    mosquito.volar();
                    mosquito.picoteo();
                }
                case Bird pajaro -> {
                    pajaro.volar();
                    pajaro.picoteo();
                    pajaro.aterrizar();
                }
                default -> {}
            }
            
            System.out.println();
        }

        // Demostración 3: Animales voladores (uso de interfaces)
        System.out.println("\n--- ANIMALES QUE PUEDEN VOLAR ---\n");
        
        for (Animal animal : misMascotas) {
            if (animal instanceof Flyable flyable) {
                System.out.println(animal.getNombre() + " es un volador:");
                flyable.volar();
                flyable.aterrizar();
                System.out.println("Altura máxima de vuelo: " + Flyable.ALTURA_MAXIMA_VUELO + " metros\n");
            }
        }

        // Demostración 4: Animales que picotean
        System.out.println("\n--- ANIMALES QUE PUEDEN PICOTEAR ---\n");
        
        for (Animal animal : misMascotas) {
            if (animal instanceof Peck picoteador) {
                System.out.println(animal.getNombre() + " puede picotear:");
                picoteador.picoteo();
                System.out.println();
            }
        }

        // Demostración 5: Información detallada con toString
        System.out.println("\n--- INFORMACIÓN COMPLETA DE LOS ANIMALES ---\n");
        
        for (Animal animal : misMascotas) {
            System.out.println(animal.toString());
        }

        System.out.println("\n=== FIN DE LA SIMULACIÓN ===");
    }
}

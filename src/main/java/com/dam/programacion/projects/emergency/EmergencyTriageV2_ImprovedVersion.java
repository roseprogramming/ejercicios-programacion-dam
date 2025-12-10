package com.dam.programacion.projects.emergency;
import java.util.Scanner;

public class EmergencyTriageV2_ImprovedVersion {
    //DEFINICIÓN DE CONSTANTES
    public static final int NUSS_MIN=100000, NUSS_MAX=999999;
    public static final int SINTOMA_MIN=0, SINTOMA_MAX=3;
    public static final int DOLOR_MIN=0, DOLOR_MAX=3;
    public static final int TRAUMA_MIN=0, TRAUMA_MAX=3;
    public static final int FIEBRE_MIN=0, FIEBRE_MAX=3;
    public static final int CONFUSION_MIN=0, CONFUSION_MAX=3;
    public static final int PRIORIDAD_MIN=0,PRIORIDAD_MAX=5;
    public static final int TEMPERATURA_MIN=27,TEMPERATURA_MAX=45;

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
     //DEFINICIÓN DE VARIABLES:
        Scanner scn= new Scanner (System.in);   
        int nuss=0, sintoma=0, exploracion=0, nivelPrioridad=0, temperaturaActual=0;
        boolean correcto=false;

    // EL PROGRAMA DEBE REALIZAR LO SIGUIENTE:
        //1.-PEDIR DATOS DE UN PACIENTE Y CONTROL DE ERRORES. 
        do {
        //a)Número de la Seguridad Social. NUSS entre 100000 y 999999
        //solicita por pantalla el nuss
            System.out.println ("Introducuzca su Número de la Seguridad Social (NUSS)");
            System.out.println(" Valores válidos " +NUSS_MIN+"-"+NUSS_MAX);
         //el usuario introduce un valor y compruebo si el valor introducido es un entero
            if (scn.hasNextInt()){
            //si es un tipo entero, leemos la variable y comprobamos el rango
                nuss=scn.nextInt();
                correcto=((nuss>=NUSS_MIN)&&(nuss<=NUSS_MAX));
                //si el valor es válido continuamos -saca el valor del buffer y lo mete en la variable- 
                if(!correcto){//si no lo es damos mensaje de error de rango
                    System.out.println("Error en el rango."+" Valores válidos " +NUSS_MIN+"-"+NUSS_MAX);
                }
            }else{
            //si el valor introducido no es un numero entero doy mensaje de error
                System.out.println("Error de tipo"+" Introduzca un número entero entre " +NUSS_MIN+"y"+NUSS_MAX);
            //y limpio el escaner para que deje de comprobar.
                scn.next();
                correcto=false;
            }
        }while (!correcto);
        //el bucle se ejecuta mientras la variable correcto sea false, cuando sea true se rompe el bucle y continuamos la ejecución del resto de programa. Cada vez que le indico correcto=true permite continuar, cada vez que es false es un semaforo en rojo.
        //b)Pedimos el síntoma
        do{
            System.out.println("Introduzca el síntoma:");
        //mostramos el menú
            System.out.println("\n\t Dolor (0) \n\t Lesión traumática (1) \n\t Fiebre alta (2) \n\t Confusión o desorientación (3)");
            if (scn.hasNextInt()){
                sintoma=scn.nextInt();//recojo el síntoma
                correcto = (sintoma>=SINTOMA_MIN) && (sintoma<=SINTOMA_MAX); //control de errores sobre valor permitido
                if (!correcto){
                    System.out.println("Error en el rango."+" Valores válidos entre " +SINTOMA_MIN+" y "+SINTOMA_MAX);
                    }
                }else{
                //si el valor introducido no es un numero entero doy mensaje de error
                    System.out.println("Error de tipo"+" Valores válidos entre " +SINTOMA_MIN+" y "+SINTOMA_MAX);
                //y limpio el escaner para que deje de comprobar.
                    scn.next();
                    correcto=false;
                }
        } while (!correcto);
    //Según el síntoma se muestra otro menú
        switch (sintoma) {
            case 0:
                do { 
                    System.out.println("¿Exploración? \n\t Dolor torácico (0) \n\t Dolor abdominal (1) \n\t Dolor de cabeza (2) \n\t Migraña (3)");
                    if (scn.hasNextInt()) {
                        exploracion= scn.nextInt();
                        correcto = (exploracion>=DOLOR_MIN) && (exploracion<=DOLOR_MAX);
                        if (!correcto) {
                            System.out.println("Error en el rango."+" Valores válidos " +DOLOR_MIN+"-"+DOLOR_MAX);
                        }
                    }else{
                        System.out.println("Error de tipo."+" Valores válidos entre " +DOLOR_MIN+"-"+DOLOR_MAX);
                        scn.next();
                        correcto=false;
                    }
                }while (!correcto);
                break;

            case 1:
                do { 
                    System.out.println("¿Exploración? \n\t Fractura ósea (0) \n\t Herida de bala (1) \n\t Quemadura (2) \n\t Lesión Cerebral traumática (3)");
                    if (scn.hasNextInt()) {
                        exploracion= scn.nextInt();
                        correcto = (exploracion>=TRAUMA_MIN) && (exploracion<=TRAUMA_MAX);
                        if (!correcto) {
                            System.out.println("Error en el rango."+" Valores válidos " +TRAUMA_MIN+"-"+TRAUMA_MAX);
                        }
                    }else{
                        System.out.println("Error de tipo."+" Valores válidos entre " +TRAUMA_MIN+" y "+TRAUMA_MAX);
                        scn.next();
                        correcto=false;
                    }
                }while (!correcto);
                break;
            
            case 2:
                do { 
                    System.out.println("¿Exploración? \n\t Neumonía (0) \n\t Meningitis (1) \n\t Infección viral (2) \n\t Reacción alergica (3)");
                    if (scn.hasNextInt()) {
                        exploracion= scn.nextInt();
                        correcto = (exploracion>=FIEBRE_MIN) && (exploracion<=FIEBRE_MAX);
                        if (!correcto) {
                            System.out.println("Error en el rango."+" Valores válidos " +FIEBRE_MIN+"-"+FIEBRE_MAX);
                        }
                    }else{
                        System.out.println("Error de tipo."+" Valores válidos entre " +FIEBRE_MIN+"-"+FIEBRE_MAX);
                        scn.next();
                        correcto=false;
                    }
                } while (!correcto);
                break;

            case 3:
                do { 
                    System.out.println("¿Exploración? \n\t Intoxicación por drogas o alcohol (0) \n\t Desidratación severa (1) \n\t Accidente cerebrovascular (2) \n\t Hipoglucemia severa (3)");
                    if (scn.hasNextInt()) {
                        exploracion= scn.nextInt();
                        correcto = (exploracion>=CONFUSION_MIN) && (exploracion<=CONFUSION_MAX);
                        if (!correcto) {
                            System.out.println("Error en el rango."+" Valores válidos " +CONFUSION_MIN+"-"+CONFUSION_MAX);
                        }
                    }
                    else{
                        System.out.println("Error de tipo."+" Valores válidos " +CONFUSION_MIN+"-"+CONFUSION_MAX);
                        scn.next();
                        correcto=false;
                    }
                } while (!correcto);
                break;
            }
        // Pedir nivel de prioridad
        System.out.println("Indique el nivel de prioridad valorando con un número entre " + PRIORIDAD_MIN +" y " + PRIORIDAD_MAX +")" );
            do { 
                if (scn.hasNextInt()) {
                    nivelPrioridad= scn.nextInt();
                    correcto = (nivelPrioridad>=PRIORIDAD_MIN) && (nivelPrioridad<=PRIORIDAD_MAX);
                    if (!correcto) {
                        System.out.println("Error en el rango."+" Valores válidos " +PRIORIDAD_MIN+"-"+PRIORIDAD_MAX);
                    }
                }
                else{
                    System.out.println("Error de tipo."+" Valores válidos " +PRIORIDAD_MIN+"-"+PRIORIDAD_MAX);
                    scn.next();
                    correcto=false;
                }
            } while (!correcto);
        //e)Temperatura actual.
        System.out.println("Introduza su temperatura actual sin decimales. \n\t Valores válidos entre " +TEMPERATURA_MIN +" y " +TEMPERATURA_MAX);
        do { 
            if (scn.hasNextInt()) {
                temperaturaActual=scn.nextInt();
                correcto = (temperaturaActual>=TEMPERATURA_MIN) && (temperaturaActual<=TEMPERATURA_MAX);
                if (!correcto) {
                    System.out.println("Error en el rango."+" Valores válidos entre " +TEMPERATURA_MIN +" y " +TEMPERATURA_MAX);
                }
            }
            else{
                System.out.println("Error de tipo."+" Valores válidos entre " +TEMPERATURA_MIN +" y " +TEMPERATURA_MAX);
                scn.next();
                correcto=false;
            }
        } while (!correcto);
        //f)mostrar un resumen:
        System.out.println("NUSS \t SINTOMA \t EXPLORACIÓN \t NIVEL PRIORIDAD \t TEMPERARTURA");
        System.out.println("=================================================================================");
        System.out.print(nuss);
        switch (sintoma) {
            case 0: System.out.print("\tDolor");
                    switch (exploracion) {
                        case 0: System.out.print("\tDolor torácico");
                                break;
                        case 1: System.out.print("\tDolor abdominal");
                                break;
                        case 2: System.out.print("\tDolor de cabeza");
                                break;
                        case 3: System.out.print("\tMigraña");
                    }
                    break;
            case 1: System.out.print("\tLesión traumática");
                switch (exploracion) {
                        case 0: System.out.print("\tFractura osea");
                            break;
                        case 1: System.out.print("\tHerida de bala");
                            break;
                        case 2: System.out.print("\tQuemadura");
                            break;
                        case 3: System.out.print("\tLesión cerebral");
                }
                break;

            case 2: System.out.print("\tFiebre alta");
                switch (exploracion) {
                        case 0: System.out.print("\tneumonia");
                            break;
                        case 1: System.out.print("\tmeningitis");
                            break;
                        case 2: System.out.print("\tInfección viral");
                            break;
                        case 3: System.out.print("\treacción alérgica");
                }
                break;
            case 3: System.out.print("\tConfusión o desorientación");
                switch (exploracion) {
                        case 0: System.out.print("\tIntoxicación por drogas o alcohol");
                            break;
                        case 1: System.out.print("\tDeshidratación severa");
                            break;
                        case 2: System.out.print("\tAccidente cerebrovascular");
                            break;
                        case 3: System.out.print("\tHipoglucémia severa");
                }
        }
        System.out.print("\t"+nivelPrioridad+"\t"+temperaturaActual);
        scn.close();
    }
}



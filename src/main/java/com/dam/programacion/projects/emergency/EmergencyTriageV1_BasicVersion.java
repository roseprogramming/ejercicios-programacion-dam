package com.dam.programacion.projects.emergency;
import java.util.Scanner;
public class EmergencyTriageV1_BasicVersion {

     //DEFINIMOS CONSTANTES
     public static final int NUSS_MIN = 100000, NUSS_MAX = 999999;
     public static final int SINTOMA_MIN=0, SINTOMA_MAX=3;
     public static final int EXPLORACION_MIN=0, EXPLORACION_MAX=3;
     public static final int TRAUMATICA_MIN=0, TRAUMATICA_MAX=3;
     public static final int FIEBRE_MIN=0, FIEBRE_MAX=3;
     public static final int CONFUSION_MIN=0, CONFUSION_MAX=3;
     public static final int PRIORIDAD_MIN=0, PRIORIDAD_MAX=5;
     public static final int TEMPERATURA_MIN=27, TEMPERATURA_MAX=45;

     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String[] args) {
          //DEFINIMOS VARIBLES
          Scanner sc = new Scanner(System.in);
          boolean correcto = true;
          int nuss=0, sintoma=0, prioridad=0, temperatura=0, exploracion=0;

          //PEDIMOS EL NÚMERO DE LA SEGURIDAD SOCIAL
          System.out.println("Escribe el número de la seguridad social:");
          System.out.println("(Número entre " + NUSS_MIN +" y " + NUSS_MAX +")" );
          //control de errores
          // rango y control de datos
          do {
               //verificar el tipos de datos
               if (sc.hasNextInt()) {
                    nuss = sc.nextInt();
                    //verificamos el rango
                    if ( (nuss>=NUSS_MIN) && (nuss<=NUSS_MAX)){
                         //rango correcto
                         correcto = false;
                    } else {
                         //rango erroneo
                         correcto = true;
                         System.out.println("Error en el rango. Entre "+NUSS_MIN + " y " + NUSS_MAX +")" );
                    }
               } else {
                    System.out.println("Error de tipo de datos.  Entre "+NUSS_MIN + " y " + NUSS_MAX +")" );
                    correcto = true;
                    sc.next();
               }
          } while(correcto);


          //PEDIMOS EL SINTOMA
          do {
               //Mostramos menu
               System.out.println("¿Síntoma del paciente?");
               System.out.println("Dolor (0)");
               System.out.println("Lesión traumática (1)");
               System.out.println("Fiebre alta (2)");
               System.out.println("Confusión o desorientación (3)");
               //validamos datos tipo // 0..3
               if (sc.hasNextInt()) {
                    sintoma = sc.nextInt();
                    //validamos rango
                    if ((sintoma >= SINTOMA_MIN) && (sintoma <= SINTOMA_MAX)) {
                         correcto = false;
                    } else {
                         correcto = true;
                         System.out.println("Error fuera de rango.  Entre " + SINTOMA_MIN + " y " + SINTOMA_MAX  );
                    }
               } else {
                    System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + SINTOMA_MIN + " Y " + SINTOMA_MAX);
                    correcto = true;
                    sc.next();
               }
          } while (correcto);

          //SEGUN EL SINTOMA UNA EXPLORACIÓN INICAL
          switch (sintoma) {
               case 0:
                    do {
                         System.out.println("Sintoma del paciente = DOLOR");
                         System.out.println("¿Exploración?");
                         System.out.println("Dolor torácico (0)");
                         System.out.println("Dolor abdominal (1)");
                         System.out.println("Dolor de cabeza (2)");
                         System.out.println("Dolor Migraña (3)");
                         //Verificar si es entero // verificar rango
                         if (sc.hasNextInt()) {
                              exploracion = sc.nextInt();
                              //validamos rango
                              if ((sintoma >= EXPLORACION_MIN) && (sintoma <= EXPLORACION_MAX)) {
                                   correcto = false;
                              } else {
                                   correcto = true;
                                   System.out.println("Error fuera de rango.  Entre " + EXPLORACION_MIN + " y " + EXPLORACION_MAX);
                              }
                         } else {
                              System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + EXPLORACION_MIN + " Y " + EXPLORACION_MAX);
                              correcto = true;
                              sc.next();
                         }
                    } while (correcto);
                    break;
               case 1:
                    do {
                         System.out.println("Sintoma del paciente = LESIÓN TRAUMÁTICA");
                         System.out.println("¿Exploración?");
                         System.out.println("Fractura ósea (0)");
                         System.out.println("Herida de bala (1)");
                         System.out.println("Quemadura (2)");
                         System.out.println("Lesión cerebral traumática (3)");
                         //Verificar si es entero // verificar rango
                         if (sc.hasNextInt()) {
                              exploracion = sc.nextInt();
                              //validamos rango
                              if ((sintoma >= TRAUMATICA_MIN) && (sintoma <= TRAUMATICA_MAX)) {
                                   correcto = false;
                              } else {
                                   correcto = true;
                                   System.out.println("Error fuera de rango.  Entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                              }
                         } else {
                              System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + TRAUMATICA_MIN + " Y " + TRAUMATICA_MAX);
                              correcto = true;
                              sc.next();
                         }
                    } while (correcto);
                    break;
               case 2:
                    do {
                         System.out.println("Sintoma del paciente = FIEBRE ALTA");
                         System.out.println("¿Exploración?");
                         System.out.println("Neumonía (0)");
                         System.out.println("Meningitis (1)");
                         System.out.println("Infección viral (2)");
                         System.out.println("Reacción alérgica(3)");
                         //Verificar si es entero // verificar rango
                         if (sc.hasNextInt()) {
                              exploracion = sc.nextInt();
                              //validamos rango
                              if ((sintoma >= FIEBRE_MIN) && (sintoma <= FIEBRE_MAX)) {
                                   correcto = false;
                              } else {
                                   correcto = true;
                                   System.out.println("Error fuera de rango.  Entre " + FIEBRE_MIN + " y " + FIEBRE_MAX);
                              }
                         } else {
                              System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + FIEBRE_MIN + " Y " + FIEBRE_MAX);
                              correcto = true;
                              sc.next();
                         }
                    } while (correcto);
                    break;
               case 3:
                    do {
                         System.out.println("Sintoma del paciente = CONFUSIÓN O DESORIENTACIÓN");
                         System.out.println("¿Exploración?");
                         System.out.println("Intoxicación por drogas o alcohol (0)");
                         System.out.println("Deshidratación severa (1)");
                         System.out.println("Accidente cerebrovascular (2)");
                         System.out.println("Hiploglucemia severa (3)");
                         //Verificar si es entero // verificar rango
                         if (sc.hasNextInt()) {
                              exploracion = sc.nextInt();
                              //validamos rango
                              if ((sintoma >= CONFUSION_MIN) && (sintoma <= CONFUSION_MAX)) {
                                   correcto = false;
                              } else {
                                   correcto = true;
                                   System.out.println("Error fuera de rango.  Entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                              }
                         } else {
                              System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + TRAUMATICA_MIN + " Y " + TRAUMATICA_MAX);
                              correcto = true;
                              sc.next();
                         }
                    } while (correcto);
          }
          // Pedir nivel de prioridad
          System.out.println("Escribe el nivel de prioridad:");
          System.out.println("(Numero entre " + PRIORIDAD_MIN +" y " + PRIORIDAD_MAX +")" );
          //control de errores
          // rango y control de datos
          do {
               //verificar el tipos de datos
               if (sc.hasNextInt()) {
                    prioridad = sc.nextInt();
                    //verificamos el rango
                    if ( (prioridad>=PRIORIDAD_MIN) && (prioridad<=PRIORIDAD_MAX)){
                         //rango correcto
                         correcto = false;
                    } else {
                         //rango erroneo
                         correcto = true;
                         System.out.println("Error en el rango. Entre "+PRIORIDAD_MIN + " y " + PRIORIDAD_MAX+")" );
                    }
               } else {
                    System.out.println("Error de tipo de datos.  Entre "+PRIORIDAD_MIN + " y " + PRIORIDAD_MAX +")" );
                    correcto = true;
                    sc.next();
               }
          } while(correcto);

          //Temperatura actual
          System.out.println("Escribe el número de la seguridad social:");
          System.out.println("(Numero entre " + TEMPERATURA_MIN +" y " + TEMPERATURA_MAX +")" );
          //control de errores
          // rango y control de datos
          do {
               //verificar el tipos de datos
               if (sc.hasNextInt()) {
                    temperatura = sc.nextInt();
                    //verificamos el rango
                    if ( (temperatura>=TEMPERATURA_MIN) && (temperatura<=TEMPERATURA_MAX)){
                         //rango correcto
                         correcto = false;
                    } else {
                         //rango erroneo
                         correcto = true;
                         System.out.println("Error en el rango. Entre "+TEMPERATURA_MIN + " y " + TEMPERATURA_MAX +")" );
                    }
               } else {
                    System.out.println("Error de tipo de datos.  Entre "+TEMPERATURA_MIN + " y " + TEMPERATURA_MAX +")" );
                    correcto = true;
                    sc.next();
               }
          } while(correcto);
          //MOSTRAMOS DATOS
          System.out.println("NUSS \t SINTOMA \t EXPLORACIÓN \t NIVEL PRIORIDAD \t TEMPERARTURA");
          System.out.println("=================================================================================");
          System.out.print(nuss);
          switch (sintoma) {
               case 0: System.out.print("Dolor");
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
               case 1: System.out.print("Lesión traumática");
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

               case 2: System.out.print("Fiebre alta");
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
               case 3: System.out.print("Confusión o desorientación");
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
          System.out.print("\t"+prioridad+"\t"+temperatura);
          sc.close();
     }
}
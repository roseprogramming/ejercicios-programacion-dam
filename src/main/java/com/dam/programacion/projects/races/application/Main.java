package com.dam.programacion.projects.races.application;
import com.dam.programacion.projects.races.models.EliteRunner;
import com.dam.programacion.projects.races.models.FederatedRunner;
import com.dam.programacion.projects.races.models.JuniorRunner;
import com.dam.programacion.projects.races.models.PopularRunner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        PopularRunner corredor1 = new PopularRunner("Carlos Lopez", 57, "Madrid",45.2);
        FederatedRunner corredor2 = new FederatedRunner("Ana Perez", 38, "Barcelona", 20.0, "XXXXX1111");
        EliteRunner corredor3 = new EliteRunner("Juan Garcia", 20, "Valencia", 10.5, "Colacao");
        JuniorRunner corredor4 = new JuniorRunner("Lucas Martinez", 16, "Sevilla",30.5, "Banco Banesto", "SUB 17" );
        //Corredor corredo5 = new Corredor("Paco Gutierrez", 20, "Almeria",20);
        System.out.println("CORREDOR 1");
        corredor1.mostrarInformacion();
        System.out.println("CORREDOR 2");
        corredor2.mostrarInformacion();
        corredor2.entrenar();
        corredor2.estorbar();
        System.out.println("CORREDOR 3");
        corredor3.mostrarInformacion();
        corredor3.premidoGanado(4000);
        corredor3.doparse();
        corredor3.estorbar();
        System.out.println("CORREDOR 4");
        corredor4.mostrarInformacion();
        corredor4.entrenar();


    }
}
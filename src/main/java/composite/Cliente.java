package composite;

import adapter.ArtefactoElectronico;

public class Cliente {
    public static void main(String[] args) {
        Laboratorios laboratorios1 = new Laboratorios("Computadora");
        Laboratorios laboratorios2 = new Laboratorios("Computadora");
        Laboratorios laboratorios3 = new Laboratorios("Computadora");

        Laboratorios l1 = new Laboratorios("Laboratorio");
        l1.add(laboratorios1);
        l1.add(laboratorios2);
        l1.add(laboratorios3);

        Laboratorios l2 = new Laboratorios("Laboratorio");
        l2.add(laboratorios1);
        l2.add(laboratorios2);
        l2.add(laboratorios3);

        Laboratorios l3 = new Laboratorios("Laboratorio");
        l3.add(laboratorios1);
        l3.add(laboratorios2);
        l3.add(laboratorios3);

        Laboratorios con1 = new Laboratorios("Contenedor");
        con1.add(l1);
        con1.add(l2);
        con1.add(l3);

        con1.precio();

    }

}
package ejerciciosParcialFinal.visitor;

import java.util.Random;

public class Aplicacion implements IMantenimiento{
    @Override
    public void mantenimientoCelular(Celular celular) {
        celular.mostrarInfo();
        System.out.println("Se realizara un mantenimineto preventivo al celular");
    }

    @Override
    public void mantenimientoComputadora(Computadora computadora) {
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(100) + 1;
        if (numeroAleatorio % 2 == 0) {
            System.out.println("Se realizara un mantenimiento preventivo a la computadora");
        } else {
            System.out.println("Se realizara un mantenimiento correctivo a la computadora");
        }
    }

    @Override
    public void mantenimientoTelevisor(Televisor televisor) {
        System.out.println("Imprimiendo caracteristicas del televisor");
        televisor.mostrarInfo();
    }
}

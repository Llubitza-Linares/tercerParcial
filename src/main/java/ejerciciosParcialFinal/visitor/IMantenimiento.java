package ejerciciosParcialFinal.visitor;

public interface IMantenimiento {
    void mantenimientoCelular(Celular celular);
    void mantenimientoComputadora(Computadora computadora);
    void mantenimientoTelevisor(Televisor televisor);
}

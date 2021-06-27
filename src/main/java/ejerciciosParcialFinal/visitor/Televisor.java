package ejerciciosParcialFinal.visitor;

public class Televisor implements IArtefactoFisico{
    private String modelo;
    private String resolucion;
    private String garantia;

    public Televisor(String modelo, String resolucion, String garantia) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.garantia = garantia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Garantia: " + garantia);
    }

    @Override
    public void recibirMantenimiento(IMantenimiento mantenimiento) {
        mantenimiento.mantenimientoTelevisor(this);
    }
}

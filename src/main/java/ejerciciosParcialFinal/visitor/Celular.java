package ejerciciosParcialFinal.visitor;

public class Celular implements IArtefactoFisico {
    private String modelo;
    private String memoria;
    private String sistemaOperativo;

    public Celular(String modelo, String memoria, String sistemaOperativo) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria);
        System.out.println("Sistema operativo: " + sistemaOperativo);
    }

    @Override
    public void recibirMantenimiento(IMantenimiento mantenimiento) {
        mantenimiento.mantenimientoCelular(this);
    }
}

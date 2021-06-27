package ejerciciosParcialFinal.extra;

public class PC implements ITipoComputadora{
    private int tamano;
    private String modelo;

    public PC(int tamano, String modelo) {
        this.tamano = tamano;
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Caracteristicas de PC");
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño: " + tamano);
    }

    @Override
    public int tamano() {
        return tamano;
    }

    @Override
    public int recibirReparacion(IEmpresaReparacion iEmpresaReparacion) {
        return iEmpresaReparacion.repararPC(this);
    }
}

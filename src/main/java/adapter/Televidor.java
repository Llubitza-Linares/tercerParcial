package adapter;

public class Televidor implements IArtefactoElectronico2{
    private String modelo;
    private int costo;
    private String tiempoGarantia;

    public Televidor (String modelo, int costo, String tiempoGarantia){
        this.tiempoGarantia=tiempoGarantia;
        this.costo=costo;
        this.modelo=modelo;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(String tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo del televisor es de: "+costo);
    }

    @Override
    public void tiempoGarantia() {
        System.out.println("El tiempo de garantia es de: "+ tiempoGarantia);

    }
}

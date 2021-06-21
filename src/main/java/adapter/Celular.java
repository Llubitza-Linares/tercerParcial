package adapter;

public class Celular implements IArtefactoElectronico{
    private String modelo;
    private int precio;
    private String tiempoVida;

    public Celular (String modelo, int precio, String tiempoVida){
        this.modelo=modelo;
        this.precio=precio;
        this.tiempoVida=tiempoVida;
    }
    @Override
    public void precio() {
        System.out.println("El precio del celular es: "+ precio);
    }

    @Override
    public void tiempoVida() {
        System.out.println("El tiempo de vida del celular es de: "+tiempoVida);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(String tiempoVida) {
        this.tiempoVida = tiempoVida;
    }
}

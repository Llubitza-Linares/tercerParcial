package adapter;

public class Computadora implements IArtefactoElectronico{
    private String modelo;
    private int precio;
    private String tiempoVida;

    public Computadora (String modelo, int precio, String tiempoVida){
        this.modelo=modelo;
        this.precio=precio;
        this.tiempoVida=tiempoVida;
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

    @Override
    public void precio() {
        System.out.println("El precio de la computadora es: " + precio);
    }

    @Override
    public void tiempoVida() {

        System.out.println("El tiempo de vida de la computadora es: "+ tiempoVida);
    }
}

package visitor.ejercicio2;

public class Italia implements IPaises {

    private double valor;
    //Para saber si se quiere cambiar de la moneda local a dolares(true) o al reves (false)
    private Boolean monedaLocal;

    public Italia() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Boolean getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(Boolean monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    @Override
    public void accept(ILibrecamnbista visitante) {
        visitante.cambiar(this);
    }
}

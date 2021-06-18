package visitor.ejercicio2;

public class Brasil implements IPaises{

    private String cambio;
    private String moneda;

    @Override
    public void accept(ILibrecamnbista librecamnbista) {

        librecamnbista.cambio(this);
    }

    @Override
    public void cambio(ILibrecamnbista librecamnbista) {

    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}

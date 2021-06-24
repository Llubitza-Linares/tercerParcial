package proxy;

public interface ITarjetaDebito {
    void comprar(double monto, String moneda);

    void recibirMonto(double monto, String moneda);
}

package ejerciciosParcialFinal.bridge;

public class InstalacionAlcantarillado implements IEmpresa{
    String nombre;
    double precio;
    IPago pago;
    public InstalacionAlcantarillado(String nombre, double precio, IPago pago) {
        this.nombre = nombre;
        this.precio = precio;
        this.pago=pago;
    }
    @Override
    public void pagar() {
        pago.pagar(precio);
    }
}

package ejerciciosParcialFinal.bridge;

public class InstalacionAgua implements IEmpresa{
    String nombre;
    double precio;
    IPago pago;

    public InstalacionAgua(String nombre, double precio, IPago pago) {
        this.nombre = nombre;
        this.precio = precio;
        this.pago=pago;
    }

    @Override
    public void pagar() {
        pago.pagar(precio);
    }
}

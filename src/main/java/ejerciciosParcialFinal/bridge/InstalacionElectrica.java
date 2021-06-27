package ejerciciosParcialFinal.bridge;

public class InstalacionElectrica implements IEmpresa{
    String nombre;
    double precio;
    IPago pago;
    public InstalacionElectrica(String nombre, double precio, IPago pago) {
        this.nombre = nombre;
        this.precio = precio;
        this.pago=pago;
    }

    @Override
    public void pagar() {
        pago.pagar(precio);
    }
}

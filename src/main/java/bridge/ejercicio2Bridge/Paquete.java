package bridge.ejercicio2Bridge;

public class Paquete implements IMetodo {
    IAbstraction implementor;

    public Paquete(double precio, String nombrePaquete, IAbstraction implementor) {
        super();
        this.precio = precio;
        this.nombrePaquete = nombrePaquete;
        this.implementor = implementor;
    }

    double precio;
    String nombrePaquete;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombreDelPaquete) {
        this.nombrePaquete = nombreDelPaquete;
    }

    @Override
    public void tipoDeEnvio(IMetodo.envio envio) {

        implementor.tipoDeEnvio();
        if (envio == IMetodo.envio.Aire) {
            precio = precio + (precio * 0.1);
        } else if (envio == IMetodo.envio.Tierra) {
            precio = precio + (precio * 0.05);
        } else {
            precio = precio + (precio * 0.25);
        }
        System.out.println("Costo del envio: " + precio);
        System.out.println("Nombre del paquete: " + nombrePaquete);
    }
}

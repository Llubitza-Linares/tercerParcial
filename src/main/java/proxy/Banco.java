package proxy;

public class Banco implements ITarjetaDebito {
    TarjetaDebito tarjetaDebito;

    public Banco(double monto) {
        tarjetaDebito = new TarjetaDebito(monto);
    }

    @Override
    public void comprar(double monto, String moneda) {
        if (moneda.equals("Bolivianos")) {
            tarjetaDebito.comprar(monto, moneda);
        } else if (moneda.equals("Dolares")) {
            double nuevoMonto = monto * 7;
            tarjetaDebito.comprar(nuevoMonto, "Bolivianos");
        } else if (moneda.equals("Euros")) {
            double nuevoMonto = monto * 8;
            tarjetaDebito.comprar(nuevoMonto, "Bolivianos");
        } else {
            System.out.println("El pago no puede ser completado");
        }

    }

    @Override
    public void recibirMonto(double monto, String moneda) {
        if (moneda.equals("Bolivianos")) {
            tarjetaDebito.recibirMonto(monto, moneda);
        } else if (moneda.equals("Dolares")) {
            double nuevoMonto = monto * 7;
            tarjetaDebito.recibirMonto(nuevoMonto, "Bolivianos");
        } else if (moneda.equals("Euros")) {
            double nuevoMonto = monto * 8;
            tarjetaDebito.recibirMonto(nuevoMonto, "Bolivianos");
        } else {
            System.out.println("No se puede recibir el monto introducido");
        }
    }

}

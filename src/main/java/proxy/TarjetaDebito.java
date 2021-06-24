package proxy;

    public class TarjetaDebito implements ITarjetaDebito {
        double cuenta;

        public double getCuenta() {
            return cuenta;
        }

        public TarjetaDebito(double cuenta) {
            this.cuenta = cuenta;
        }

        @Override
        public void comprar(double monto, String moneda) {
            if (cuenta > monto) {
                cuenta -= monto;
                System.out.println("El monto despues de la compra es de: " );
                System.out.println(cuenta);
            } else {
                System.out.println("No se tiene el monto suficiente");
            }
        }

        @Override
        public void recibirMonto(double monto, String moneda) {
            cuenta += monto;
            System.out.println("Monto actualizado*************");
            System.out.println("El saldo actual es de: ");
            System.out.println(cuenta);
        }

    }


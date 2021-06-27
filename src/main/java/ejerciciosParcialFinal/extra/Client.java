package ejerciciosParcialFinal.extra;

public class Client {
    public static void main(String[] args) {
        Dueno presidente = new Presidente("Andres");
        Dueno vicepresidente = new Vicepresidente("Ariel");
        Dueno contador = new Contabilidad("Gabriela");

        CuentaBancaria cuenta = CuentaBancaria.getInstance();

        cuenta.addDueno(presidente);
        cuenta.addDueno(vicepresidente);
        cuenta.addDueno(contador);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new PC(50, "Asus 200")));
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Tablet(17, "Master G 2")));
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Laptop(30, "HP Pavilion")));
            }
        });

        thread1.run();
        thread2.run();
        thread3.run();
    }
}

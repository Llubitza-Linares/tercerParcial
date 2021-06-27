package ejerciciosParcialFinal.extra;

import java.util.LinkedList;
import java.util.List;

public class CuentaBancaria {
    int monto;
    static List<Dueno> dueno;

    public static CuentaBancaria instance = null;

    private CuentaBancaria() {
        dueno = new LinkedList<Dueno>();
        monto = 0;
    }

    public synchronized static void addDueno(Dueno nuevoDueno) {
        dueno.add(nuevoDueno);
    }

    private synchronized static void makeInstace() {
        if (instance == null)
            instance = new CuentaBancaria();
    }

    public static CuentaBancaria getInstance() {
        if (instance == null)
            makeInstace();
        return instance;
    }

    public synchronized int repararComputador(ITipoComputadora iTipoComputadora) {
        Empresa empresa = new Empresa();
        int precio = iTipoComputadora.recibirReparacion(empresa);
        System.out.println("Se cobrará " + precio );
        return precio;

    }

    public synchronized void pagar(int monto) {
        this.monto += monto;
        System.out.println("Se recibio el pago, el nuevo monto en cuenta es: " + monto );
        Transaccion nt = new Transaccion();
        for (Dueno d : dueno) {
            nt.addDueno(d);
        }
        nt.enviar("Se ha recibido el monto de " + monto );
    }
}

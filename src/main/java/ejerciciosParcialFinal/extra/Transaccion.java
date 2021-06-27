package ejerciciosParcialFinal.extra;

import java.util.LinkedList;
import java.util.List;

public class Transaccion implements INotificador {
    List<Dueno> dueno;

    public Transaccion() {
        dueno = new LinkedList<Dueno>();
    }

    public void addDueno(Dueno nuevoDueno) {
        dueno.add(nuevoDueno);
    }
    @Override
    public void enviar(String mensaje) {
        for (Dueno dueno : dueno) {
            dueno.messageReceived(mensaje);
        }
    }
}

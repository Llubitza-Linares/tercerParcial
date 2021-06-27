package ejerciciosParcialFinal.extra;

public class Vicepresidente extends Dueno{
    String nombre;

    public Vicepresidente(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("El vicepresidente "+nombre+" ha recibido el mensaje ");
        System.out.println(mensaje);
    }
}

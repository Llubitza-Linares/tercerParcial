package ejerciciosParcialFinal.extra;

public class Presidente extends Dueno {
    String nombre;

    public Presidente(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("El presidente "+nombre+" ha recibido el mensaje ");
        System.out.println(mensaje);
    }
}

package ejerciciosParcialFinal.extra;

public abstract class Dueno {
    protected INotificador iNotificador;
    public abstract void messageReceived(String mensaje);
}


package bridge.ejercicio2Bridge;

public interface IMetodo {
    enum envio {
        Aire, Tierra, Mar
    }
    void tipoDeEnvio(envio env);
}

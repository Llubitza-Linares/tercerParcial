package bridge.ejercicio2Bridge;

public class Cliente {
    public static void main(String[] args) {

        Paquete paquete = new Paquete(550, "Paquete", new EmpresaSA());
        paquete.tipoDeEnvio(IMetodo.envio.Aire);
        paquete.tipoDeEnvio(IMetodo.envio.Tierra);
        paquete.tipoDeEnvio(IMetodo.envio.Mar);

        Paquete paquete2 = new Paquete(300, "Paquete", new EmpresaSRL());
        paquete2.tipoDeEnvio(IMetodo.envio.Aire);
        paquete2.tipoDeEnvio(IMetodo.envio.Tierra);
        paquete2.tipoDeEnvio(IMetodo.envio.Mar);
    }
}

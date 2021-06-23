package bridge.ejercicio2Bridge;

public class EmpresaSRL implements IAbstraction{
    @Override
    public void tipoDeEnvio() {
        System.out.println("El paquete se envia desde la empresa SRL");
    }
}

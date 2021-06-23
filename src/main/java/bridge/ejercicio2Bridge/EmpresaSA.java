package bridge.ejercicio2Bridge;

public class EmpresaSA implements IAbstraction{
    @Override
    public void tipoDeEnvio() {
        System.out.println("El paquete se envia desde la empresa SA");
    }
}

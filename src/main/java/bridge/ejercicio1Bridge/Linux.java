package bridge.ejercicio1Bridge;

public class Linux implements IPlataforma{
    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura){
        this.arquitectura=arquitectura;
    }
    @Override
    public void ejecutar(){
        System.out.println("Linux");
        arquitectura.senalarVersionYCaracteristicas();
        System.out.println("Ejecutando");
    }
}

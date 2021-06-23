package bridge.ejercicio1Bridge;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura){
        this.arquitectura=arquitectura;
    }
    @Override
    public void ejecutar(){
        System.out.println("Windows");
        arquitectura.senalarVersionYCaracteristicas();
        System.out.println("Ejecutando");
    }
}

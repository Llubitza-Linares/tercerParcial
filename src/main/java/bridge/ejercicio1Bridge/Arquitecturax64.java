package bridge.ejercicio1Bridge;

public class Arquitecturax64 implements IArquitectura{
    @Override
    public void senalarVersionYCaracteristicas(){
        System.out.println("Version x64");
        System.out.println("WIFI");
        System.out.println("Ejecutando");
    }
}

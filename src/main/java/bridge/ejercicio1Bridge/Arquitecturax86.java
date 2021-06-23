package bridge.ejercicio1Bridge;

public class Arquitecturax86 implements IArquitectura{
    @Override
    public void senalarVersionYCaracteristicas(){
        System.out.println("Version x86");
        System.out.println("WIFI");
        System.out.println("Ejecutando");
    }
}

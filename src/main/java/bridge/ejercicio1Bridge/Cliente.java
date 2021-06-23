package bridge.ejercicio1Bridge;

public class Cliente {
    public static void main(String[] args) {
        Windows windows=new Windows(new Arquitecturax64());
        windows.ejecutar();
        Linux linux=new Linux(new Arquitecturax86());
        linux.ejecutar();
    }

}

package bridge.ejercicio1NoBridge;

public class Windowsx86 extends Windows{
    @Override
    public void arquitectura(){
        System.out.println("x86");
    }

    @Override
    public void paint(){
        System.out.println("Se ejecuta el programa de paint");
    }

    @Override
    public void nombre(){
        System.out.println("Windows");
    }

    @Override
    public void reproductor(){
        System.out.println("Reproducir");
    }
}

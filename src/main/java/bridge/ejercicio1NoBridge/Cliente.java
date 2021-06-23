package bridge.ejercicio1NoBridge;

public class Cliente {
    public static void main(String[] args) {
        Linuxx64 linuxx64=new Linuxx64();
        linuxx64.reproductor();

        System.out.println("************");
        Windowsx64 windowsx64=new Windowsx64();
        windowsx64.reproductor();
        windowsx64.paint();
        System.out.println("**************");

        Windowsx86 windowsx86=new Windowsx86();
        windowsx86.reproductor();
        windowsx86.paint();
        System.out.println("**************");
    }
}

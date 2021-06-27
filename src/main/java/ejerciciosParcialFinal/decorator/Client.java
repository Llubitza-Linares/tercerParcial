package ejerciciosParcialFinal.decorator;

public class Client {
    public static void main(String[] args) {
        IPersonaje iPersonaje = new Personaje("Jupiter");
        iPersonaje.info();

        iPersonaje = new ArmarPersonaje(iPersonaje, "Espada");
        iPersonaje.info();

        iPersonaje = new Escudo(iPersonaje);
        iPersonaje.info();

        iPersonaje = new Pociones(iPersonaje);
        iPersonaje.info();
    }
}

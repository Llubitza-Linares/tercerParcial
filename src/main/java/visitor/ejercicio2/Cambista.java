package visitor.ejercicio2;

public class Cambista implements ILibrecamnbista{
    @Override
    public void cambio(Argentina argentina) {
        System.out.println(" **** Algoritmo ****");
        System.out.println("  para el ElementConcrete1 ");
    }

    @Override
    public void cambio(Bolivia bolivia) {
        System.out.println(" **** Cambio de moneda ****");
        System.out.println("  de dolares a la moneda boliviana");
    }

    @Override
    public void cambio(Brasil brasil) {
        System.out.println(" **** Cambio de moneda ****");
        System.out.println("  de dolares a moneda brasilera");
    }

    @Override
    public void cambio(Italia italia) {
        System.out.println(" **** Cambio de moneda ****");
        System.out.println("  de moneda dolares a moneda italiana ");
    }
}

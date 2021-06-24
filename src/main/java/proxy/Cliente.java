package proxy;

public class Cliente {
    public static void main(String[] args) {
        Banco banco = new Banco(500);

        banco.comprar(201, "Bolivianos");
        banco.comprar(50, "Euros");

        banco.recibirMonto(5, "Dolares");
        banco.comprar(50, "Bolivianos");

    }

}

package ejerciciosParcialFinal.proxy;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new AplicacionWeb(), new AplicacionWeb());

        proxy.registrar("Carlos", "123456");
        proxy.registrar("Manuel", "456789");
        proxy.registrar("Adriana", "789123");
        proxy.registrar("Alejandra", "147258");
        proxy.registrar("Natalia", "258369");
        proxy.registrar("Naomi", "369147");

        proxy.login("Carlos", "123456");

        proxy.login("Carlos", "123456");
        proxy.login("Manuel", "456789");
        proxy.login("Adriana", "789123");
        proxy.login("Alejandra", "147258");
        proxy.login("Natalia", "258369");
        proxy.login("Naomi", "369147");

    }
}

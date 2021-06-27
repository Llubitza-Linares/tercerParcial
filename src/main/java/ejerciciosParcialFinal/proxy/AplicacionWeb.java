package ejerciciosParcialFinal.proxy;

public class AplicacionWeb implements IAplicacionWeb{
    @Override
    public void login(String usuario, String contrasena) {
        System.out.println("Nuestro servidor atiende al usuario " + usuario);
    }
}

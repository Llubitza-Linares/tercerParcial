package ejerciciosParcialFinal.adapter;

public class Android implements IEmpresa1 {
    @Override
    public void login() {
        System.out.println("Login en la aplicacion en Android");
    }

    @Override
    public void logout() {
        System.out.println("Logout de la aplicacion de Android");
    }

    @Override
    public void reportes() {
        System.out.println("Generando reportes de la aplicacion de Android");
    }
}

package ejerciciosParcialFinal.adapter;

public class IOS implements IEmpresa1{
    @Override
    public void login() {
        System.out.println("Login en la aplicacion de IOS");
    }

    @Override
    public void logout() {
        System.out.println("Logout en la aplicacion de IOS");
    }

    @Override
    public void reportes() {
        System.out.println("Reporte de la aplicacion de IOS");
    }
}

package ejerciciosParcialFinal.adapter;

public class WindowsPhone implements IEmpresa1{
    @Override
    public void login() {
        System.out.println("Login en la aplicacion de WindowsPhone");
    }

    @Override
    public void logout() {
        System.out.println("Logout en la aplicacion de WindowsPhone");
    }

    @Override
    public void reportes() {
        System.out.println("Generando reportes en la aplicacion de WindowsPhone");
    }
}

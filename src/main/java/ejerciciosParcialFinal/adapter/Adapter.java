package ejerciciosParcialFinal.adapter;

public class Adapter implements IEmpresa1{
    private IEmpresa2 iEmpresa2;

    public Adapter(IEmpresa2 iEmpresa2) {
        System.out.println("La aplicacion de computador se adapta a una de celular ********");
        this.iEmpresa2 = iEmpresa2;
    }

    @Override
    public void login() {
        iEmpresa2.iniciarSesion();
    }

    @Override
    public void logout() {
        iEmpresa2.cerrarSesion();
    }

    @Override
    public void reportes() {
        iEmpresa2.generarDatos();
    }
}

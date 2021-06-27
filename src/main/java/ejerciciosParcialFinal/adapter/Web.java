package ejerciciosParcialFinal.adapter;

public class Web  implements IEmpresa2 {

    @Override
    public void iniciarSesion() {
        System.out.println("Se inicio la sesion en la aplicacion web");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Se cerro la sesion en la aplicacion web");
    }

    @Override
    public void generarDatos() {
        System.out.println("Se generan los datos en la aplicacion web");
    }
}
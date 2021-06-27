package ejerciciosParcialFinal.adapter;

public class Client {
    public static void main(String[] args) {
        Android android = new Android();
        IOS ios = new IOS();
        WindowsPhone windowsPhone = new WindowsPhone();

        Adapter adapter = new Adapter(new Web());
        Adapter adapter1 = new Adapter(new Escritorio());

        android.login();
        android.logout();
        android.reportes();

        ios.login();
        ios.logout();
        ios.reportes();

        windowsPhone.login();
        windowsPhone.logout();
        windowsPhone.reportes();

        adapter.login();
        adapter.logout();
        adapter.reportes();

        adapter1.login();
        adapter1.logout();
        adapter1.reportes();
    }
}

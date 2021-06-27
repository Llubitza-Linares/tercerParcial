package ejerciciosParcialFinal.visitor;

public class Client {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung A51", "32Gb", "Android");
        Computadora computadora = new Computadora("Hp Pavilion", "512Gb", "10Gb");
        Televisor televisor = new Televisor("Sony 232", "High Quality", "2 años");

        Aplicacion app = new Aplicacion();

        celular.recibirMantenimiento(app);
        computadora.recibirMantenimiento(app);
        televisor.recibirMantenimiento(app);
    }
}

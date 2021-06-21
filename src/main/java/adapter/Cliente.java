package adapter;

public class Cliente {
    public static void main(String[] args) {
        IArtefactoElectronico celular = new Celular("Samsung A50", 650, "5 años");
        IArtefactoElectronico tableta = new Tablet("Samsung Tablet", 800, "4 años");
        IArtefactoElectronico computadora = new Computadora("Asus", 1250 , "5 años");
        IArtefactoElectronico televisor = new ArtefactoElectronico(new Televidor("Sony", 2500, "10 años"));
        IArtefactoElectronico refrigerador = new ArtefactoElectronico(new Refrigerador("Lexus", 5000, "7 años"));
        IArtefactoElectronico lavadora = new ArtefactoElectronico(new Lavadora("LG", 3500, "12 años"));

        celular.precio();
        tableta.precio();
        computadora.precio();
        televisor.precio();
        refrigerador.precio();
        lavadora.precio();

        celular.tiempoVida();
        tableta.tiempoVida();
        computadora.tiempoVida();
        televisor.tiempoVida();
        refrigerador.tiempoVida();
        lavadora.tiempoVida();
    }
}

package ejerciciosParcialFinal.bridge;

public class PagoEfectivo implements IPago{
    @Override
    public void pagar(double monto) {
        System.out.println("******** Se debe pagar el monto de: " + monto);

    }
}

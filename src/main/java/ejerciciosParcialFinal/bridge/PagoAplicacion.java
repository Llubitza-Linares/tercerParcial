package ejerciciosParcialFinal.bridge;

public class PagoAplicacion  implements IPago{
    @Override
    public void pagar(double monto) {
        System.out.println("******** Se debe pagar el monto de: " + (monto*0.9));

    }
}

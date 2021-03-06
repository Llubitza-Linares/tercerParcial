package ejerciciosParcialFinal.bridge;

public class Cliente {
    public static void main(String[] args) {
        IEmpresa iEmpresa1 = new InstalacionAgua("Aqua", 100, new PagoEfectivo());
        IEmpresa iEmpresa2 = new InstalacionAgua("Aqua", 100, new PagoTransferencia());
        IEmpresa iEmpresa3 = new InstalacionAgua("Aqua", 100, new PagoTigoMoney());
        IEmpresa iEmpresa4 = new InstalacionAgua("Aqua", 100, new PagoAplicacion());

        iEmpresa1.pagar();
        iEmpresa2.pagar();
        iEmpresa3.pagar();
        iEmpresa4.pagar();


        IEmpresa iEmpresa5 = new InstalacionAlcantarillado("Epsas", 150, new PagoEfectivo());
        IEmpresa iEmpresa6 = new InstalacionAlcantarillado("Epsas", 150, new PagoTransferencia());
        IEmpresa iEmpresa7 = new InstalacionAlcantarillado("Epsas", 150, new PagoTigoMoney());
        IEmpresa iEmpresa8 = new InstalacionAlcantarillado("Epsas", 150, new PagoAplicacion());

        iEmpresa5.pagar();
        iEmpresa6.pagar();
        iEmpresa7.pagar();
        iEmpresa8.pagar();

        IEmpresa iEmpresa9 = new InstalacionElectrica("Electropaz", 200, new PagoEfectivo());
        IEmpresa iEmpresa10 = new InstalacionElectrica("Electropaz", 200, new PagoEfectivo());
        IEmpresa iEmpresa11 = new InstalacionElectrica("Electropaz", 200, new PagoTigoMoney());
        IEmpresa iEmpresa12 = new InstalacionElectrica("Electropaz", 200, new PagoAplicacion());

        iEmpresa9.pagar();
        iEmpresa10.pagar();
        iEmpresa11.pagar();
        iEmpresa12.pagar();
    }
}

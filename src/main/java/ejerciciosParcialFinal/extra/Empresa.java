package ejerciciosParcialFinal.extra;

public class Empresa implements IEmpresaReparacion{
    @Override
    public int repararLaptop(Laptop laptop) {
        System.out.println("Se usa el kit para reparar laptops");
        return laptop.getTamano() * 5;
    }

    @Override
    public int repararPC(PC pc) {
        System.out.println("Se usa el kit para reparar pc");
        return pc.getTamano() * 10;
    }

    @Override
    public int repararTablet(Tablet tablet) {
        System.out.println("Se usa el kit para repara tablets");
        return tablet.getTamano() * 4;
    }
}

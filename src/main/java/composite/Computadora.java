package composite;

public class Computadora extends  ArtefactosElectronicos{

    public Computadora(String nombre) {
        super(nombre);
    }

    @Override
    public void precio() {
        this.getPrecio();
    }

    @Override
    public void add(ArtefactosElectronicos artefactosElectronicos) {
        System.out.println("No applicable");

    }

    @Override
    public void remove(ArtefactosElectronicos artefactosElectronicos) {
        System.out.println("No applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No applicable");
    }
}
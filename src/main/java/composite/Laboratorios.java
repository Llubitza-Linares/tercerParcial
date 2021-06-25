package composite;

import java.util.ArrayList;
import java.util.List;

public class Laboratorios extends ArtefactosElectronicos{
    private List<ArtefactosElectronicos> entidadList = new ArrayList<>();


    public Laboratorios(String nombre) {
        super(nombre);
    }

    @Override
    public void precio() {
        Global.totalPrecio=Global.totalPrecio+this.getPrecio();
        for (ArtefactosElectronicos entidad : entidadList) {
            entidad.precio();
        }
        System.out.println(Global.totalPrecio);
    }

    public void showTotalPrecio(){
        System.out.println("**********Precio Total: "+Global.totalPrecio+" |");
    }

    @Override
    public void add(ArtefactosElectronicos entidad) {
        entidadList.add(entidad);
    }

    @Override
    public void remove(ArtefactosElectronicos entidad) {
        entidadList.remove(entidad);
    }

    @Override
    public void getChild(int position) {
    }
}
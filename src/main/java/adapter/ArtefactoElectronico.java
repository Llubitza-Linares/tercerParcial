package adapter;

public class ArtefactoElectronico implements IArtefactoElectronico{

    IArtefactoElectronico2 artefactoElectronico2;

    public ArtefactoElectronico(IArtefactoElectronico2 artefactoElectronico2){
        this.artefactoElectronico2=artefactoElectronico2;
    }
    @Override
    public void precio() {
        artefactoElectronico2.costo();
    }

    @Override
    public void tiempoVida() {
        artefactoElectronico2.tiempoGarantia();
    }
}

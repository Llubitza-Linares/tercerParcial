package visitor.ejercicio1;

import visitor.ejercicio1.IEditores;
import visitor.ejercicio1.ISoftware;

public class Subline implements ISoftware {

    private String version;
    private boolean licencia;
    private String herramientas;
    private String texto;

    public Subline(){}

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void crear(String texto){
        this.texto=texto;
    }

    public void eliminar(){
        this.texto="";
    }

    public void editar(String texto){
        this.texto=texto+""+texto;
    }
    @Override
    public void accept(IEditores editores) {


    }
}

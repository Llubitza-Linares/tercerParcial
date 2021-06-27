package ejerciciosParcialFinal.composite;

public class Archivo extends Disco {
    public Archivo(String contenido) {
        this.contenido = contenido;
        this.palabras = contenido.split(" ").length;
    }

    @Override
    public void MostrarPalabras() {
        System.out.println("****** Numero de palabras: " + palabras);
    }

    @Override
    public void add(Disco component) {
        System.out.println("No aplicable");
    }

    @Override
    public void remove(Disco component) {
        System.out.println("No aplicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplicable");
    }
}

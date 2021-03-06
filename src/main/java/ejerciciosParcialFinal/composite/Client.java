package ejerciciosParcialFinal.composite;

public class Client {
    public static void main(String[] args) {
        Disco disco1 = new Archivo("Este es el contenido");
        Disco disco2 = new Archivo("Las palabras mostradas son");
        Disco disco3 = new Archivo("Se requieren las siguientes cosas");

        disco1.MostrarPalabras();

        Disco disco4 = new Archivo("por un lado");
        Disco disco5 = new Archivo("caso contrario");
        Disco disco6 = new Archivo("no obstante ");

        disco4.MostrarPalabras();

        Disco folder1 = new Folder();

        folder1.add(disco1);
        folder1.add(disco2);
        folder1.add(disco3);

        folder1.MostrarPalabras();

        Disco folder2 = new Folder();

        folder2.add(disco4);
        folder2.add(disco5);
        folder2.add(disco6);

        folder2.MostrarPalabras();

        Disco unidadDisco = new Folder();

        unidadDisco.add(folder1);
        unidadDisco.add(folder2);

        unidadDisco.MostrarPalabras();
    }
}

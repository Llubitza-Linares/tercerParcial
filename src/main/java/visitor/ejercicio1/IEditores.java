package visitor.ejercicio1;

public interface IEditores {
    void guardarArchivos(Word word);

    void guardarArchivos(Notepad notepad);

    void guardarArchivos(Subline subline);

}

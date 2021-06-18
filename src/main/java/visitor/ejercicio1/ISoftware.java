package visitor.ejercicio1;

public interface ISoftware {
    void crear();

    void editar();

    void eliminar();

    void accept(IEditores editores);

}

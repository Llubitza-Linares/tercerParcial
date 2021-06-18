package visitor.ejercicio1;
//Visitor : Se tiene una estructura de software editores de texto (word, notepad,
//sublime) estos editores tiene los métodos de crear, editar,eliminar. a estos editores se le
//desea agregar un nuevo método (visitante) que es un plugin con funcionalidad guardar el
//documento guardado en formato pdf, cuando se guarda el archivo también se guarda la
//cantidad de caracteres que tiene el documento.

public class Cliente {
    public static void main(String[] sss) {

        Notepad notepad = new Notepad();
        Word word = new Word();
        Subline subline = new Subline();
        Complemento complemento = new Complemento();

        notepad.setContenido("documento1");

        word.setContenido("documento2");

        notepad.accept(complemento);
        word.accept(complemento);
        subline.accept(complemento);

    }


}

package visitor.ejercicio1;
//Visitor : Se tiene una estructura de software editores de texto (word, notepad,
//sublime) estos editores tiene los métodos de crear, editar,eliminar. a estos editores se le
//desea agregar un nuevo método (visitante) que es un plugin con funcionalidad guardar el
//documento guardado en formato pdf, cuando se guarda el archivo también se guarda la
//cantidad de caracteres que tiene el documento.

public class Cliente {
    public static void main(String []sss){

        Word word= new Word();
        Notepad notepad= new Notepad();
        Subline subline= new Subline();

        Complemento editor1= new Complemento();
        // Crear
        word.crear("Este texto esta siendo creado");
        notepad.crear("Este texto esta siendo creado");
        subline.crear("Este texto esta siendo creado");

        Complemento editor2= new Complemento();
        // Editar
        word.editar("Este texto esta siendo editado");
        notepad.editar("Este texto esta siendo editado");
        subline.editar("Este texto esta siendo editado");

        Complemento editor3 = new Complemento();
        // Eliminar
        word.eliminar();
        notepad.eliminar();
        subline.eliminar();


    }

}

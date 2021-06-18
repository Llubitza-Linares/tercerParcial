package visitor.ejercicio1;

public class Complemento implements IEditores{
    @Override
    public void metodo(Word word) {
        System.out.println("Se esta creando un pdf para el texto del editor: WORD");
        System.out.println("El texto es:"+word.getTexto());
        char[] numCaracteres=word.getTexto().replace("","").toCharArray();
        System.out.println("El numero de caracteres es:"+numCaracteres.length);
    }

    @Override
    public void metodo(Notepad notepad) {

        System.out.println("Se esta creando un pdf para el texto del editor: WORD");
        System.out.println("El texto es:"+notepad.getTexto());
        char[] numCaracteres=notepad.getTexto().replace("","").toCharArray();
        System.out.println("El numero de caracteres es:"+numCaracteres.length);
    }

    @Override
    public void metodo(Subline subline) {

        System.out.println("Se esta creando un pdf para el texto del editor: WORD");
        System.out.println("El texto es:"+subline.getTexto());
        char[] numCaracteres=subline.getTexto().replace("","").toCharArray();
        System.out.println("El numero de caracteres es:"+numCaracteres.length);
    }
}

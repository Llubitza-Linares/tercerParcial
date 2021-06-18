package visitor.ejercicio2;

import java.text.DecimalFormat;

public class Cambista implements ILibrecamnbista{
    @Override
    public void cambiar(Bolivia bolivia) {
        System.out.println("*** BOLIVIA ***");
        if(bolivia.getMonedaLocal()){
            System.out.println("*** CAMBIANDO DE BOLIVIANOS A DOLARES ***");
            double valor=bolivia.getValor()/7;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+bolivia.getValor()+" bs son "+(df.format(valor))+" $");
            System.out.println(" ");
        }else {
            System.out.println("*** CAMBIANDO DE DOLARES A BOLIVIANOS ***");
            double valor=bolivia.getValor()*7;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+bolivia.getValor()+" $ son "+(df.format(valor))+" bs");
            System.out.println(" ");

        }
    }

    @Override
    public void cambiar(Argentina argentina) {
        System.out.println("*** ARGENTINA ***");
        if(argentina.getMonedaLocal()){
            System.out.println("*** CAMBIANDO DE PESO ARGENTINO A DOLARES ***");
            double valor=argentina.getValor()/100;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+argentina.getValor()+" pesos son "+(df.format(valor))+" $");
            System.out.println(" ");
        }else {
            System.out.println("*** CAMBIANDO DE DOLARES A PESO ARGENTINO ***");
            double valor=argentina.getValor()*100;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+argentina.getValor()+"$ son "+(df.format(valor))+" pesos");
            System.out.println(" ");

        }

    }

    @Override
    public void cambiar(Brasil brasil) {
        System.out.println("*** BRASIL ***");
        if(brasil.getMonedaLocal()){
            System.out.println("*** CAMBIANDO DE REAL BRASILEÑO A DOLARES ***");
            double valor=brasil.getValor()/5;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+brasil.getValor()+" R$ son "+(df.format(valor))+" $");
            System.out.println(" ");
        }else {
            System.out.println("*** CAMBIANDO DE DOLARES A REAL BRASILEÑO ***");
            double valor=brasil.getValor()*5;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+brasil.getValor()+" $ son "+(df.format(valor))+" R$");
            System.out.println(" ");

        }

    }

    @Override
    public void cambiar(Italia italia) {
        System.out.println("*** ITALIA ***");
        if(italia.getMonedaLocal()){
            System.out.println("*** CAMBIANDO DE EURO A DOLARES ***");
            double valor=italia.getValor()/0.84;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+italia.getValor()+" E son "+(df.format(valor))+" $");
            System.out.println(" ");
        }else {
            System.out.println("*** CAMBIANDO DE DOLARES A EURO ***");
            double valor=italia.getValor()*0.84;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(""+italia.getValor()+" $ son "+(df.format(valor))+" E");
            System.out.println(" ");

        }


    }
}

package visitor.ejercicio2;

public class Client {
    public static void main(String []sss){

        Argentina argentina= new Argentina();
        Bolivia bolivia= new Bolivia();
        Brasil brasil= new Brasil();
        Italia italia=new Italia();

        Cambista cambista1= new Cambista();
        argentina.accept(cambista1);
        bolivia.accept(cambista1);
        brasil.accept( cambista1);
        italia.accept(cambista1);

        Cambista cambista2= new Cambista();
        argentina.accept( cambista2);
        bolivia.accept(cambista2);
        brasil.accept(cambista2);
        italia.accept( cambista2);

        Cambista cambista3= new Cambista();
        argentina.accept( cambista3);
        bolivia.accept( cambista3);
        brasil.accept( cambista3);
        italia.accept( cambista3);


    }
}

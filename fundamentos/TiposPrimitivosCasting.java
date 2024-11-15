package fundamentos;
public class TiposPrimitivosCasting {
    public static void main(String[] args) {

        //Casting Inteiros

        long number = 10L;

        /*Forçando a conversão da variável long para uma variável do tipo int,
        mesmo que haja perda de dados no casting.*/
        //Casting

        int number2 = (int) number;

        System.out.println(number2);

        //Casting Flutuantes

        double x = 32.3;

        /*Forçando a conversão da variável do tipo double para uma variável do tipo float,
        mesmo que haja perda de dados no casting.*/
        //Casting

        float a = (float) x;

        System.out.println(a);

    }
}

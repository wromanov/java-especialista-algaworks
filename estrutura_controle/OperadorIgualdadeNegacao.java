package estrutura_controle;

public class OperadorIgualdadeNegacao {
    public static void main(String[] args) {

        //Operador 'igual' ==
        boolean numerosIguais = 10 == 10;
        boolean numerosIguais2 = (4 + 6) == (5 + 2);

        //Operador 'diferente' !=
        boolean isDifferent = numerosIguais != numerosIguais2;

        //Operador de negação '!', nega um valor booleano, se for verdadeiro passa a ser falso, vice e versa.
        boolean numerosDiferentes = !numerosIguais;

        System.out.printf("Números iguais: %b%n", numerosIguais);
        System.out.printf("Números iguais: %b%n", numerosIguais2);
        System.out.printf("Números Diferentes: %b%n", numerosDiferentes);
        System.out.printf("Números iguais: %b%n", isDifferent);

        //Para comparar duas strings devemos usar o 'iquals'.
        String nome = "Walace";
        String nome2 = "Leandro";

        boolean namesIsIquals = nome.equals(nome2);

        System.out.printf("Nomes são iguais? %b%n", namesIsIquals);


    }
}

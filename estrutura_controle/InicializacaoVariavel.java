package estrutura_controle;

import java.util.Scanner;

public class InicializacaoVariavel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço dos produtos: ");
        double precoProdutos = entrada.nextDouble();

        System.out.print("Cobrar frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        //Variáveis primitivas precisam ser inicializas.
        double valorFrete = 0;

        //Variáveis locais, são acessíveis apenas dentro do seu escopo local.
        if (cobrarFrete) {
            System.out.print("Valor do Frete");
            valorFrete = entrada.nextDouble();

            double valorTotal = precoProdutos + valorFrete;


        }
    }
}
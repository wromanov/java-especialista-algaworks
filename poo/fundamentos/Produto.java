package poo.fundamentos;

public class Produto {

    //Variaveis de Estancia
    double precoCusto;
    double precoVenda;

    //Construtor padrão
    Produto() {

    }

    //Construtor personalizado
    Produto(double precoCusto) {

    }


    //Variável (global) que pertence a classe
    static double custoEmbalagem;


    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    //Método (global) que pertence a classe
    static void imprimiCustoEmbalage() {
        System.out.printf("Custo com embalagem %.2f%n", custoEmbalagem);
    }

    //Método (global) que pertence a classe
    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

}

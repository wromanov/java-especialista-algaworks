package poo;

public class PrincipaProduto {
    public static void main(String[] args) {

        Produto novoProduto = new Produto(100);

        //Acessando atributo static da class e alterando seu valor
        //Produto.custoEmbalagem = 10;

        //Método Static para alterar custo da embalagem
        Produto.alterarCustoEmbalagem(20);

        //novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(80);


        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: R$ %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: R$ %.2f%n", novoProduto.precoVenda);

        Produto.imprimiCustoEmbalage();

    }
}

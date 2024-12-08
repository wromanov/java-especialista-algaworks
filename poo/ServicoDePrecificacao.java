package poo;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemDeLucro) {

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemDeLucro);
        precoVendaCalculado += Produto.custoEmbalagem;
        produto.precoVenda = precoVendaCalculado;

    }


}

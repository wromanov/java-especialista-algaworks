package fundamentos;

public class TiposPrimitivosBoolean {
    public static void main(String[] args) {

        /*
        Tipo Primitivo boolean

        Tamanho: O tamanho exato não é especificado; geralmente, ocupa 1 bit, mas depende da implementação da JVM.
        Valores possíveis: true ou false.

        Uso: Usado para valores de lógica binária, como condições em estruturas de controle (ex.: if, while).
        */

        //Declarando um tipo primitivo Boolean
        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

        System.out.println(compraAprovada);
        System.out.println(clienteBloqueado);

        int quantidadeEstoque = 10;
        int quantidadePedidoCompra = 15;

        //Cria uma condição para verificar se a quantidade em estoque é o suficiente para atender a quantidade do pedido.
        boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;

        System.out.println(estoqueSuficiente);


    }
}

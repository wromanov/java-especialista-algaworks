package fundamentos;

public class TiposPrimitivosInteiros {
    public static void main(String[] args) {

        /*
        Tipo primitivo byte
        Tamanho: 8 bits.
        Faixa: -128 a 127.
        Uso: Geralmente para economia de espaço em grandes arrays, onde o limite dos valores é conhecido.
        */

        byte velocidade = 127;
        System.out.println("Idade:" + velocidade + "KM/h");

        /*
        Tipo primitivo short
        Tamanho: 16 bits.
        Faixa: -32.768 a 32.767.
        Uso: Útil para economizar memória em grandes arrays, especialmente em sistemas de baixa potência.
         */

        short voltas = 32_767;
        System.out.println("Voltas executadas: " + voltas);

        /*
        Tipo primitivo int
        Tamanho: 32 bits.
        Faixa: -2^31 a 2^31 - 1 (-2.147.483.648 a 2.147.483.647).
        Uso: É o tipo mais comumente usado para valores inteiros.
        */
        int valor = 2_147_483_647;
        System.out.println("Valor em conta: R$ " + valor);

        /*
        Tipo primitivo long
        Tamanho: 64 bits.
        Faixa: -2^63 a 2^63 - 1 (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807).
        Uso: Para números inteiros muito grandes; requer o sufixo L ao final do valor literal (ex.: 100000L).
        Pois o interpretador entende tudo que for digitado literalmente como inteiro.
        */

        long distanciaMarte = 9_223_372_036_854_775_807L;
        System.out.println("Distancia em marte: " + distanciaMarte);

    }
}

package fundamentos;

public class TiposPrimitivosFlutuantes {
    public static void main(String[] args) {

        /*
        float:
        Tamanho: 32 bits (precisão simples).
        Faixa: Aproximadamente ±3.40282347E+38F (6-7 dígitos de precisão).
        Uso: Quando é necessária economia de memória em grandes arrays de números com casas decimais.
        Requer o sufixo F ou f ao final do valor literal (ex.: 3.14F), pois por padrão, o compilador interpreta números com
        ponto decimal como double, que é mais preciso e ocupa 64 bits
        */

        float kilos = 32.6655357F;
        System.out.println("Kilos: " + kilos);


        /*Tamanho: 64 bits (precisão dupla).
        Faixa: Aproximadamente ±1.79769313486231570E+308 (15 dígitos de precisão).
        Uso: É o tipo padrão para números decimais no Java, e é preferido sobre float para operações de ponto flutuante mais precisos.
        */

        double dinheiroConta = 100000.54638468742;
        System.out.println("Dinheiro: " + dinheiroConta);

    }
}
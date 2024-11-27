package poo;

public class Carro {

    //Atributos de uma classe
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;

    //Composição é construção de objetos que se relacionam com outros objetos.
    Pessoa proprietario = new Pessoa();

    //Criando um método
    void calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2024 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);
        double valorDepreciado = precoCompra - valorRevenda;

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);
        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);
        System.out.printf("Valor depreciado: %6.2f%n", valorDepreciado);


    }
}

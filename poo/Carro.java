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
    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);
        double valorDepreciado = precoCompra - valorRevenda;

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        //System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);
        //System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
        //System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);
        //System.out.printf("Valor depreciado: %6.2f%n", valorDepreciado);

        return valorRevenda;

    }

    double calcularIpva() {

        if (calcularTempoDeUsoEmAnos() >= 10) {
            return 0;
        }

        return calcularValorRevenda() * 0.04;
    }


    int calcularTempoDeUsoEmAnos() {
        return 2024 - anoFabricacao;
    }

    void imprimirDadosDoVeiculo() {

        if (precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. " +
                    "Não foi possível imprimir resumo de depreciação");
            return; //sai do método
        }

        System.out.printf("Fabricante do meu carro: %s%n", fabricante);
        System.out.printf("Modelo do meu carro: %s%n", modelo);
        System.out.printf("Ano de fabricação do meu carro: %d%n", anoFabricacao);
        System.out.printf("Cor do meu carro: %s%n", cor);
        System.out.printf("Proprietário do Carro: %s%n%n", proprietario.nome);
    }


}

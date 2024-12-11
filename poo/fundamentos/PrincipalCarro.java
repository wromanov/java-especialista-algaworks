package poo.fundamentos;

public class PrincipalCarro {
    public static void main(String[] args) {

//Criando uma variável do tipo Carro.
        Carro meuCarro;

        //Estanciando um objeto do tipo Carro e atribuindo a variável carro.
        meuCarro = new Carro();

        //Criando a variável e estanciando
        Carro seuCarro = new Carro();

        //Atribuindo valores aos atributos
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HRV";
        meuCarro.anoFabricacao = 2010;
        meuCarro.cor = "Preto";
        meuCarro.proprietario.nome = "Walace";
        meuCarro.precoCompra = 50000;

        //Atribuindo valores aos atributos
        seuCarro.fabricante = "Toyota";
        seuCarro.modelo = "Corola";
        seuCarro.anoFabricacao = 2021;
        seuCarro.cor = "Prata";
        seuCarro.proprietario.nome = "Eliane";
        seuCarro.proprietario.cpf = "010428889717";
        seuCarro.proprietario.anoNascimento = 1993;

        double valorDeRevenda = meuCarro.calcularValorRevenda();
        int tempoDeUsoEmAnos = meuCarro.calcularTempoDeUsoEmAnos();
        double valorDoIpva = meuCarro.calcularIpva();

        //Acessando atributos de uma classe
        meuCarro.imprimirDadosDoVeiculo();
        seuCarro.imprimirDadosDoVeiculo();


        //Invocando um método
        System.out.printf("Tempo de uso em (anos): %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorDeRevenda);
        System.out.printf("Valor do IPVA: %6.2f%n", valorDoIpva);


    }
}

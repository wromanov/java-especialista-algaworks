package poo.desafio;

public class Funcionario {
    String nome;
    int quantidadeFilhos;

    boolean temMaisDeUmFilho() {
        return quantidadeFilhos > 0;
    }
}
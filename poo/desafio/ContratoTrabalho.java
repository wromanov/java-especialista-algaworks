package poo.desafio;

public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean temMaisDeUmFilho() {
        return funcionario.quantidadeFilhos > 0;
    }
}



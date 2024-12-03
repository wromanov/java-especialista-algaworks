package poo.desafio;

public class FolhaPagamento {
    double quantidadeHorasNormaisTrabalhadas;
    double quantidadeHorasExtrasTrabalhadas;


    double calcularSalario(ContratoTrabalho contrato) {
        if (contrato.funcionario.temMaisDeUmFilho()) {
            double totalHoraNormal = quantidadeHorasNormaisTrabalhadas * contrato.valorHoraNormal;
            double totalHoraExtra = quantidadeHorasExtrasTrabalhadas * contrato.valorHoraExtra;
            double totalSalario = (totalHoraNormal + totalHoraExtra) * 1.10;
            return totalSalario;
        } else {
            double totalHoraNormal = quantidadeHorasNormaisTrabalhadas * contrato.valorHoraNormal;
            double totalHoraExtra = quantidadeHorasExtrasTrabalhadas * contrato.valorHoraExtra;
            double totalSalario = totalHoraNormal + totalHoraExtra;
            return totalSalario;
        }


    }


}

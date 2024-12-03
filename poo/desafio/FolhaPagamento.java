package poo.desafio;

public class FolhaPagamento {
    double quantidadeHorasNormaisTrabalhadas;
    double quantidadeHorasExtrasTrabalhadas;


    double calcularSalario(ContratoTrabalho contrato) {
        if (contrato.funcionario.temMaisDeUmFilho()) {
            double totalHoraNormal = quantidadeHorasNormaisTrabalhadas * contrato.valorHoraNormal;
            double totalHoraExtra = quantidadeHorasExtrasTrabalhadas * contrato.valorHoraExtra;
            double totalPagar = (totalHoraNormal + totalHoraExtra) * 1.10;
            return totalPagar;
        } else {
            double totalHoraNormal = quantidadeHorasNormaisTrabalhadas * contrato.valorHoraNormal;
            double totalHoraExtra = quantidadeHorasExtrasTrabalhadas * contrato.valorHoraExtra;
            double totalPagar = totalHoraNormal + totalHoraExtra;
            return totalPagar;
        }


    }


}

package poo.desafio;

public class FolhaPagamento {
    double quantidadeHorasNormaisTrabalhadas;
    double quantidadeHorasExtrasTrabalhadas;


    Holerite calcularSalario(ContratoTrabalho contrato) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasExtras = contrato.valorHoraExtra * quantidadeHorasExtrasTrabalhadas;
        holerite.valorTotalHorasNormais = contrato.valorHoraNormal * quantidadeHorasNormaisTrabalhadas;
        return holerite;




//        // Cálculo comum independente da condição
//        double totalHoraNormal = quantidadeHorasNormaisTrabalhadas * contrato.valorHoraNormal;
//        double totalHoraExtra = quantidadeHorasExtrasTrabalhadas * contrato.valorHoraExtra;
//        double totalSalario = totalHoraNormal + totalHoraExtra;
//
//        // Aplica o bônus para funcionários com mais de um filho
//        if (contrato.funcionario.temMaisDeUmFilho()) {
//            totalSalario *= 1.10; // Adiciona 10% de bônus
//        }
//
//        return totalSalario;
    }


}




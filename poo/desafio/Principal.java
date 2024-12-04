package poo.desafio;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Walace";
        funcionario.quantidadeFilhos = 4;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.valorHoraNormal = 25.0;
        contrato.valorHoraExtra = 35.0;

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.quantidadeHorasExtrasTrabalhadas = 22;
        folhaPagamento.quantidadeHorasNormaisTrabalhadas = 50;



        Holerite holerite = new Holerite();
        Holerite calculoSalario = folhaPagamento.calcularSalario(contrato);
        holerite.funcionario = funcionario;
        holerite.valorTotalHorasExtras = calculoSalario.valorTotalHorasExtras;
        holerite.valorTotalHorasNormais = calculoSalario.valorTotalHorasNormais;
        holerite.imprimirHolerite();

        //System.out.print(folhaPagamento.calcularSalario(contrato));



    }
}

package poo.desafio;

public class Holerite {
    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;

    double calcularValorTotal() {
        double salarioFinal = valorTotalHorasNormais + valorTotalHorasExtras;

        if (funcionario.temMaisDeUmFilho()) {
            return salarioFinal *= 1.10;
        }

        return salarioFinal;
    }

    void imprimirHolerite() {
        System.out.printf("Salario Final: R$ %.2f\n", calcularValorTotal());
    }
}


package poo;

public class PrincipalPaciente {
    public static void main(String[] args) {

        Paciente walace = new Paciente();
        walace.peso = 97;
        walace.altura = 1.74;

        CalculadoraImc calculadoraImc = new CalculadoraImc();

        IndiceMassaCorporal imc = calculadoraImc.calcular(walace);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está com obesidade.%n", imc.altura, imc.peso);

        } else if (imc.estaAbaixoDoPesoIdeal()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está abaixo do peso Ideal.%n", imc.altura, imc.peso);

        }

        System.out.printf("IMC: %.2f%n", imc.resultado);

    }
}

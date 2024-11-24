package estrutura_controle;

import java.util.Scanner;

public class EstruturaCondicionaIF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        //boolean abaixoPesoIdeal = imc < 18.5;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        }

        if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal.");
        }

        if (imc >= 25 && imc < 30) {
            System.out.println("Acima do Peso");
        }

        if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I");
        }


    }
}

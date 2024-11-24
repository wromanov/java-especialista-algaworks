package estrutura_controle;

import java.util.Scanner;

public class ClausulaBreakContinue {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Peso Máximo da Aeronave: ");
        int pesoMaximo = sc.nextInt();

        int pesoTotalPassageiros = 0;

        while (true) {

            System.out.print("Peso do passageiro: ");
            int pesoPassageiro = sc.nextInt();

            //Usando o continua para pular essa iteração, pois excedeu o peso máximo.
            if (pesoTotalPassageiros + pesoPassageiro > pesoMaximo) {
                System.out.println("Peso máximo excedido.");
                continue;
            }

            pesoTotalPassageiros += pesoPassageiro;

            //Usando break para parar o laço de repetição.
            System.out.print("Incluir novo passageiro? ");
            if (!sc.nextBoolean()) {
                break;
            }
        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);


    }


}


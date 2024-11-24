package estrutura_controle;

import java.util.Scanner;

public class OperadorLogico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * Operador And '&&' para que a resultado seja verdadeiro, todas as condições devem ser verdadeiras.
        * Operador Or '||' para que o resultado seja verdadeiro, uma das condições precisa ser verdadeira.
        */

        System.out.print("Cortisol: ");
        double cortisol = sc.nextDouble();

        // Cortisol idela é de 6 a 18.4
        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        boolean resultadoANormal = cortisol < 7.0 || cortisol > 18.4;

        System.out.printf("Nível do cortisol: %b%n", resultadoNormal);
        System.out.printf("Nível do Melatonina: %b%n", resultadoANormal);


    }
}

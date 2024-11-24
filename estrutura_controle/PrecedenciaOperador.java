package estrutura_controle;
import java.util.Scanner;

public class PrecedenciaOperador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = 10;
        int y = 20;

        // O operador && sempre terá precedencia sobre o operador || em uma expressão.

        boolean resultado = x == 13 && x == 15 || y == 20;

        //Seria o mesmo que:
        //boolean resultado = (x == 13 && x == 15) || y == 20;

        System.out.println("Resultado: " + resultado);

        System.out.print("Grupo de risco: ");
        boolean grupoDeRisco = entrada.nextBoolean();

        System.out.print("Vitamina D: ");
        double vitaminaD = entrada.nextDouble(); // nanograma por mililitro

        boolean vitaminaDNormal = (!grupoDeRisco && vitaminaD > 20) || (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);

        System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);


    }
}

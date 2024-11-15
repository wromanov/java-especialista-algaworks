import java.util.Scanner;
import java.util.Locale;

public class EntradaDadosScanner {
    public static void main(String[] args) {

        /*
        Por padrão o java pega o locate do seu sistema para exibições. Mas caso voce queira mudar,
        pode ser feito por parametro do comando javac no console/terminal, ou então via código.
        Exemplo, para fixar ao seu sistema que a linguagem dele é americano,
        coloca dentro do main (pode ser na primeira linha do main).
        */



        Locale.setDefault(new Locale("en", "US"));
        //Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);

        //Define o Locale para aceitar ponto decimal
        //sc.useLocale(Locale.US);


        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite o peso do aluno: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura do aluno: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Nome: %s | Peso: %.2f | Altura: %.2f | IMC: %.2f.", nome, peso, altura, imc);

    }
 }

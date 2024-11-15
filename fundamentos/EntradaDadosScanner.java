package fundamentos;
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


        //Importante os métodos nextDouble e nextInt, não leem uma quebra de linha.
        System.out.print("Digite o peso do aluno: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura do aluno: ");
        double altura = sc.nextDouble();

        //Consumir a quebra de linha que o nextDouble deixou.
        sc.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        double imc = peso / (altura * altura);

        System.out.printf("Nome: %s%nPeso: %.2f%nAltura: %.2f%nIMC: %.2f", nome, peso, altura, imc);

    }
 }


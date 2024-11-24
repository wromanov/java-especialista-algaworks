package estrutura_controle;

import java.util.Scanner;

public class EstruturaSwitchCase {
    public static void main(String[] args) {
        //Switch é utilizado quando a tomada de decisão é realizado com base em apensa uma variável

        Scanner sc = new Scanner(System.in);

        String descricaoNota;

        System.out.print("informe a nota de atendimento 1 a 5: ");
        int nota = sc.nextInt();

        switch (nota) {
            case 1:
                descricaoNota = "Muito Ruim";
                System.out.println(1);
                break; //Interrompe a execução dos demais cases, caso não seja usado, vai entrar em todos os cases.
            case 2:
                descricaoNota = "Ruim";
                System.out.println(2);
                break;
            case 3:
                descricaoNota = "Razoável";
                System.out.println(3);
                break;
            case 4:
                descricaoNota = "Muito bom";
                System.out.println(4);
                break;
            case 5:
                descricaoNota = "Excelente";
                System.out.println(5);
                break;
            default:
                descricaoNota = "Opção Invalida";
                break;
        }

        System.out.println(descricaoNota);


    }


}


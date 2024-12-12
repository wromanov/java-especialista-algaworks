package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        //Estanciando um Array de 5 posições
        int[] notas = new int[5];

        //Estanciando um Array com os valores
        int[] notas2 = new int[]{1, 2, 3, 4, 5};

        //Estanciando diretamente com os valores
        Integer[] notas3 = {3, 2, 1, 4, 5};

        //Acessando e atribuindo valores

        System.out.println(notas2[0]);
        System.out.println(notas2[1]);
        System.out.println(notas2[2]);

        //Alterando valor do elemento no array
        notas[0] = 10;

        System.out.println(notas[0]);

        //Iterando arrays através de um método estático
        System.out.println(Calculadora.calcularMedia(notas2));

        //Iterando arrays através de um for avançado
        for (int notasAlunos : notas2) {
            System.out.printf("%d%n", notasAlunos);
        }

        //Visualizando o Array completo
        String arraysNotas2 = Arrays.toString(notas2);
        System.out.println(arraysNotas2);

        //Ordenando Arrays
        System.out.println(Arrays.toString(notas3));
        Arrays.sort(notas3);

        System.out.println(Arrays.toString(notas3));

        //Ordenando de forma inversa
        Arrays.sort(notas3, Comparator.reverseOrder());
        System.out.println(Arrays.toString(notas3));

    }


}


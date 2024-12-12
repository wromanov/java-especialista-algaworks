package arrays;

public class Calculadora {
    static double calcularMedia(int[] array){
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return (double) total / 5;
    }
}

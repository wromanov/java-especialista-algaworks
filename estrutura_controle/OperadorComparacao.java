package estrutura_controle;

public class OperadorComparacao {
    public static void main(String[] args) {
        /*
        - Operadores de Comparação
        * Operador > 'Maior'
        * Operador < 'Menor'
        * Operador >= 'Maior ou Igual'
        * Operador <= 'Menor ou Igual'
        * */

        int pesoProdutos = 1000;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
        boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;

        System.out.printf("Carga excedida: %b%n", cargaExcedida);
        System.out.printf("Carga Liberada: %b%n", cargaLiberada);







    }
}

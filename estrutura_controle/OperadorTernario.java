package estrutura_controle;

public class OperadorTernario {
    public static void main(String[] args) {
        char tipoNotaFiscal = 'P';
        double totalFaturado = 1200.30;

        /*
        if (tipoNotaFiscal == 'S') {
            valorImpostos = totalFaturado * 0.16;
        } else {
            valorImpostos = totalFaturado * 0.35;
        }
        */

        //Operador Ternário
        // Se tipoNotaFiscal for igual 'S', a expressão será totalFaturado * 0,16, caso não totalFaturado será 0,36.
        double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;

        System.out.printf("Total faturado: R$ %.2f%n", totalFaturado);
        System.out.printf("Total total dos impostos: R$ %.2f%n", totalFaturado);

    }
}

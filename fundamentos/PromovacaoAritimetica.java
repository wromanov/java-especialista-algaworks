public class PromovacaoAritimetica {
    public static void main(String[] args) {

        //Promovação artimética de operações entre tipos primitivos com tipos diferentes.

        //Quando temos dois tipos diferentes, o resultado será o tipo que possui a maior capacidade.
        int a = 1;
        long b = 2;
        long c = a + b;

        System.out.println(c);


        //A mesma regra vale para os tipos de ponto flutuantes
        float d = 3.1f;
        double e = 2.5;
        double f = d + e;

        System.out.println(f);


        //A regra quando temos tipos inteiros e tipos decimais, prevacele o tipo decimal.
        int j = 4;
        double h = 3.5;
        double x = j + h;

        System.out.println(x);

        //Para fazer uma operação de divisão com variaveis inteiras, e obter o valor decimal, precisa força o casting das variáveis para double.
        int v = 3;
        int n = 2;
        double t = (double) v / n;

        System.out.println(t);


    }
}

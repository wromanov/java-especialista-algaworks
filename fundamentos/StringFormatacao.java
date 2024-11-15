public class StringFormatacao {
    public static void main(String[] args) {

        //Formatando Strings com "printf"
        //%s = substitui por uma string
        //%d = substitui por um numero inteiro
        //%n = quebra linha

        String nome1 = "Walace";
        int idade = 35;
        double peso = 95.587;

        System.out.printf("Olá, %s sua idade é %d e seu peso é %.2f.\n", nome1, idade, peso);

        //Incrementando 10 espaços no valor da variável
        System.out.printf("Olá, %s sua idade é %d e seu peso é %10.2f.", nome1, idade, peso);






    }
}

package fundamentos;
public class StringManipução {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //Necessário colocar a operação entre parêntes para ter precedência.
        System.out.println("Resultado:" + (x+y));

        String nome = "Maria";
        int idade = 35;

        System.out.println(nome + " tem " + idade + " Anos.");

        //Sequencia de escape - Usamos contra-barra antes do caracter que quer escapar.

        System.out.println("Olá \"Mária\".");

        //Quebra linha
        System.out.println("Seu nome é \n João");

        //Escapando contra-barra
        System.out.println("C:\\Windows\\");




    }
}

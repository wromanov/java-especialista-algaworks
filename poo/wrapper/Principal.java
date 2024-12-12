package poo.wrapper;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        //Como o atributo idade é um Wrapper Integer, o mesmo pode receber o valor null.
        cliente.idade = Integer.valueOf(25);

        System.out.printf("Cliente ID: %d\n", cliente.idade);


        //Executando casting da classe wrapper
        int idade = 29;
        short idadeShort = (short) idade;

        //Não é mais necessário fazer o box e unbox desde o java 5 - Java faz o autobox
        Integer diasEntrega = Integer.valueOf(30);
        Short diasEntregaShort = diasEntrega.shortValue();
        Long diasEntregaLong = diasEntrega.longValue();

        Double valorTotal = Double.valueOf(1500.2);
        double valorTotalDouble = valorTotal;

        System.out.println(valorTotalDouble);

        //Comparando Tipo Wrapper
        Integer number1 = 128;
        Integer number2 = 129;

        //Deve ser usado o método equals para comparação de objetos
        System.out.println(number1.equals(number2));

        //Resultado = 0 "Verdadeiro" e Resultado = -1 "Falso"
        System.out.println(number1.compareTo(number2));

    }
}

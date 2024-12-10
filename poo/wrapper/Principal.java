package poo.wrapper;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        //Como o atributo idade é um Wrapper Integer, o mesmo pode receber o valor null.
        cliente.idade = Integer.valueOf(25);

        System.out.printf("Cliente ID: %d\n", cliente.idade);


    }
}

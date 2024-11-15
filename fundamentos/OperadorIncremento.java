package fundamentos;

public class OperadorIncremento {
    public static void main(String[] args) {

        //Operadores de Incremento

        int totalDownloads = 1;

        int tentativasLogin = 5;

        //Incremento pós-fixado, primeiro incrementa depois atribui
        int novoTotalDownloads = totalDownloads++;

        System.out.println("Total Downloads " + novoTotalDownloads);
        System.out.println("Total Downloads " + totalDownloads);


        //Decrementando pré-fixado Tentativas de login
        --tentativasLogin;

        System.out.println("Total Tentativas Login " + tentativasLogin);

    }
}

package poo;

public class Principal {
    public static void main(String[] args) {

        //Criando uma variável do tipo Carro.
        Carro meuCarro;

        //Estanciando um objeto do tipo Carro e atribuindo a variável carro.
        meuCarro = new Carro();

        //Criando a variável e estanciando
        Carro seuCarro = new Carro();

        //Atribuindo valores aos atributos
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HRV";
        meuCarro.anoFabricacao = 2020;
        meuCarro.cor = "Preto";
        meuCarro.proprietario.nome = "Walace";

        //Atribuindo valores aos atributos
        seuCarro.fabricante = "Toyota";
        seuCarro.modelo = "Corola";
        seuCarro.anoFabricacao = 2021;
        seuCarro.cor = "Prata";
        seuCarro.proprietario.nome = "Eliane";
        seuCarro.proprietario.cpf = "010428889717";
        seuCarro.proprietario.anoNascimento = 1993;

        //Acessando atributos de uma classe
        System.out.printf("Fabricante do meu carro: %s%n", meuCarro.fabricante);
        System.out.printf("Modelo do meu carro: %s%n", meuCarro.modelo);
        System.out.printf("Ano de fabricação do meu carro: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Cor do meu carro: %s%n", meuCarro.cor);
        System.out.printf("Proprietário do Carro: %s%n", meuCarro.proprietario.nome);

    }
}

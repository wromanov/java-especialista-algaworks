package poo;

public class Pessoa {

    //Variável de Estância
    String nome;
    String cpf;
    int anoNascimento;

    //Variável da Classe
    static String estadoNascimento = "Rio de Janeiro";

    //Método Estatic = Método da Classe
    static void setEstadoNascimento(String estadoNascimento) {
        Pessoa.estadoNascimento = estadoNascimento;
    }





}

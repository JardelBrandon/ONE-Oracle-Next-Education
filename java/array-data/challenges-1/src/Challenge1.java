/* 1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos. */

class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade + "\n";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class Challenge1 {
    public static void main(String[] args) {

    }
}

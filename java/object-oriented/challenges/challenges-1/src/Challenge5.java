class Aluno {
    String nome;
    int idade;

    void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Challenge5 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Jardel";
        aluno.idade = 29;

        aluno.exibirInformacoes();
    }
}

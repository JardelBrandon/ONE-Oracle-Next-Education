/* Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina. A regra da escola é:

O estudante é aprovado se média final é maior ou igual a 7.0.

Se a média for entre 5.0 e 6.9, está de recuperação.

Se for abaixo de 5.0, está reprovado.

Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola. */

class Avaliador {
    public void avaliacao(double media) {
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Avaliador avaliador = new Avaliador();
        avaliador.avaliacao(8.2);
        avaliador.avaliacao(5.8);
        avaliador.avaliacao(4.3);
    }
}

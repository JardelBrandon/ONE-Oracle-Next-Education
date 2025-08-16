/* Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo. Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.

Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba o resultado corretamente? */

class Paridade {
    public void parOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é impar");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Paridade paridade = new Paridade();

        paridade.parOuImpar(8);
        paridade.parOuImpar(7);
    }
}

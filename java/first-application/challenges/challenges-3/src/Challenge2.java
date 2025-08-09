/* 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior. */

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("Primeiro número: " + numero1 + " maior que o segundo número: " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("Segundo número: " + numero1 + " menor que o primeiro número: " + numero2);
        } else {
            System.out.println("Números iguais: " + numero1);
        }
    }
}

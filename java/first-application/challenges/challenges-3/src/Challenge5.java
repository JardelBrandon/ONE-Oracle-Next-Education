/* 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente. */

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        System.out.println(numero + " -> " + (numero % 2 == 0 ? "Par" : "Ímpar"));

    }
}

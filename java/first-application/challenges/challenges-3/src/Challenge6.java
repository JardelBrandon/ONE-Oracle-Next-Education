/* 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. */

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        int fatorial = 1;

        for(int i = numero; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println(numero + " -> " + fatorial + " Fatorial");
    }
}

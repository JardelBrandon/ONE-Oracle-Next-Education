/* 4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("""
                    %d * %d = %d
                    %n""", i, numero, i * numero);
        }
    }
}

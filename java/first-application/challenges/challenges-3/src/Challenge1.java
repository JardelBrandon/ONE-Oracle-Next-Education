/* 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo". */

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo: " + numero);
        } else {
            System.out.println("Número negativo: " + numero);
        }

        System.out.println(numero + " -> " + (numero >= 0 ? "postivo": "negativo"));
    }
}

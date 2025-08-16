/* Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais. Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.

Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros, compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais. */

import java.util.Scanner;

class Comparador {
    void comparaInteiros(int primeiro, int segundo) {
        if (primeiro > segundo) {
            System.out.println("Primero número maior que segundo");
        } else if (primeiro < segundo) {
            System.out.println("Segundo número maior que primeiro");
        } else {
            System.out.println("Números iguais");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundo = entrada.nextInt();

        Comparador comparador = new Comparador();
        comparador.comparaInteiros(primeiro, segundo);
    }
}

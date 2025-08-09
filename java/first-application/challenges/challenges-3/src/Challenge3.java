/* 3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Selecione o número correspondente:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do primeiro lado do quadrado: ");
                double valor1 = sc.nextDouble();
                System.out.println("Digite o valor do segundo lado do quadrado: ");
                double valor2 = sc.nextDouble();

                System.out.println("Área do quadrado: " + valor1 * valor2);
                break;
            case 2:
                System.out.println("Digite o valor do raio da circunferencia: ");
                double raio = sc.nextDouble();

                System.out.println("Área do círculo: " + (Math.PI * Math.pow(raio, 2)));
                break;
        }
    }
}

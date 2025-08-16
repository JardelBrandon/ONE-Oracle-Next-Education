/* Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:

Ter entre 18 e 65 anos.

Pesar mais de 50 kg.

Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue. Se não for, o programa deve indicar qual critério não foi atendido.

Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é compatível ou não, além de informar o critério não atendido, se for o caso? */

import java.util.Scanner;

class Doador {
    void verificarDisponibilidade(int idade, double peso) {
        if (idade >= 18 && idade <= 65) {
            if (peso >= 50) {
                System.out.println("O doador é ocmpatível!");
                System.out.println("Apto a realizar doação.");
            } else {
                System.out.println("O doador não é compatível.");
                System.out.println("Motivo: Deve ter o peso maior que 50Kg");
            }
        } else {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();
        Doador doador = new Doador();
        doador.verificarDisponibilidade(idade, peso);
    }
}

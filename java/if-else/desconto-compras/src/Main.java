/* Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra. O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00. Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não, juntamente com o novo valor após o desconto, caso aplicável.

Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem informando se o desconto foi aplicado ou não. */

import java.util.Scanner;

class Desconto {
    void verificaDesconto(double valor) {
        if (valor >= 100) {
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: R$ " + (valor - (valor * 0.1)));
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valor);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Desconto desconto = new Desconto();
        desconto.verificaDesconto(120);
        desconto.verificaDesconto(80);
    }
}

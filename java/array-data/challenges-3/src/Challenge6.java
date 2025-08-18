/* 6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo. */

import java.util.Random;

class ContaBancaria {
    String numero;
    double saldo;
}

public class Challenge6 {
    public static void main(String[] args) {
        String maiorConta = "";
        double maiorSaldo = 0;
        for (int i = 0; i < 100; i++) {
            ContaBancaria conta = new ContaBancaria();
            conta.numero = String.valueOf(i);
            conta.saldo = Math.random() * 1000;
            if (conta.saldo > maiorSaldo) {
                maiorConta = conta.numero;
                maiorSaldo = conta.saldo;
            }
        }
        System.out.println("Conta: " + maiorConta);
        System.out.printf("R$: %.2f", maiorSaldo);
    }
}

/* 3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente. */

class ContaBancaria {
    private double saldo;

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public double consultaSaldo() {
        return this.saldo;
    }
}

class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal() {
        this.sacar(10.10);
    }
}

public class Challenge3 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.deposito(100);
        System.out.println(conta.consultaSaldo());
        conta.sacar(50);
        System.out.println(conta.consultaSaldo());
        conta.cobrarTarifaMensal();
        System.out.println(conta.consultaSaldo());
    }
}

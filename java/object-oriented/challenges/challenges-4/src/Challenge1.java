/* 1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro. */

interface ConversaoFinanceira {
    double converterDolarParaReal(double valor);
}

class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valor) {
        return valor * 5.40;
    }
}

public class Challenge1 {
    public static void main(String[] args) {
        double valorEmDolar = 100;

        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println(conversor.converterDolarParaReal(valorEmDolar));
    }
}

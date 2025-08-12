class Calculadora {
    double dobro(double numero) {
        return numero * 2;
    }
}

public class Challenge2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobro(10));
    }
}

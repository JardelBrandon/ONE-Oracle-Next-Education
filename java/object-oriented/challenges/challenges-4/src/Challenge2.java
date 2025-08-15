/* 2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros. */

interface CalculoGeometrico {
    double calcularArea(double altura, double largura);
    double calcularPerimetro(double altura, double largura);
}

class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double altura, double largura) {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return largura * 2 + altura * 2;
    }
}

public class Challenge2 {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calc = new CalculadoraSalaRetangular();
        System.out.println(calc.calcularArea(150, 200));
        System.out.println(calc.calcularPerimetro(150, 200));

    }
}

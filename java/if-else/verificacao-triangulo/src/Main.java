/* Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo. Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado. Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não. */

class Triangulo {
    void verificaTriangulo(double a, double b, double c) {
        if (a + b > c && a + c > b && a + c > b) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triãngulo.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.verificaTriangulo(2.0, 3.0, 4.0);
        t.verificaTriangulo(3,4,5);
        t.verificaTriangulo(2.0, 3.0, 400.0);
    }
}

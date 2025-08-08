/* 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado. */

public class Challenge1 {
    double nota1 = 7.3;
    double nota2 = 5.4;

    double media = (nota1 + nota2) / 2;

    public static void main(String[] args) {
        Challenge1 obj = new Challenge1();
        System.out.println("Media: " + obj.media);
    }
}

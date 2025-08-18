/* 5 Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma. */

interface Forma {
    double calcularArea(double medida);
}

class Circulo implements Forma {
    public double calcularArea(double medida) {
        return Math.PI * Math.pow(medida, 2);
    }
}

class Quadrado implements Forma {
    public double calcularArea(double medida) {
        return medida * 2;
    }
}

public class Challenge5 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Forma quadrado = new Quadrado();
            System.out.println(quadrado.calcularArea(i));
            Forma circulo = new Circulo();
            System.out.println(circulo.calcularArea(i));
        }
    }
}

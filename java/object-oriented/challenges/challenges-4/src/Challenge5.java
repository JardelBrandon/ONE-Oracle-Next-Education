/* 5. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais. */

interface Calculavel {
    double calcularPrecoFinal(double valor);
}

class Livro implements Calculavel {

    @Override
    public double calcularPrecoFinal(double valor) {
        return valor+10;
    }
}

class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal(double valor) {
        return valor-valor*.25;
    }
}

public class Challenge5 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        double precoFinal = livro.calcularPrecoFinal(100);
        System.out.println(precoFinal);

        ProdutoFisico produtoFisico = new ProdutoFisico();
        double produto = produtoFisico.calcularPrecoFinal(100);
        System.out.println(produto);
    }
}

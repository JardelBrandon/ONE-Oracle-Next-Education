/* 4. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos. */

import java.util.ArrayList;

class Produto {
    String nome;
    double preco;
}

public class Challenge4 {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        int quantidadeProdutos = 10;
        double mediaPreco = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto p = new Produto();
            p.nome = "Produto " + i;
            p.preco = Math.random() * 100;
            mediaPreco += p.preco;
        }
        mediaPreco /= quantidadeProdutos;
        System.out.println("Méida de preços: " + mediaPreco);
    }
}

/* 1. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice. */

import java.util.ArrayList;

class Produto {
    String nome;
    double preco;
    int quantidade;
}

public class Challenge1 {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());
        produtos.add(new Produto());

        System.out.println(produtos.get(4));
    }
}

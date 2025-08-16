/* 2. Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println(). */

import java.util.ArrayList;

class _Produto extends Produto {
    @Override
    public String toString() {
        return "nome: " + nome + " (R$: " + preco + ")\n";
    }
}

public class Challenge2 {
    public static void main(String[] args) {
        ArrayList<_Produto> produtos = new ArrayList<_Produto>();
        _Produto p1 = new _Produto();
        p1.nome = "Martelo";
        p1.preco = 13.50;
        p1.quantidade = 10;
        produtos.add(p1);
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());
        produtos.add(new _Produto());

        for (_Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

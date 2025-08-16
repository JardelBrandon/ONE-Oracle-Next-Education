/* 4. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores. */

import java.util.Date;

class Produtoperecivel extends __Produto {
    Date dataValidade;


    public Produtoperecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public Produtoperecivel(String nome, double preco, int quantidade, Date dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produtoperecivel{" +
                "dataValidade=" + dataValidade +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

public class Challenge4 {
    public static void main(String[] args) {
        Produtoperecivel produtoperecivel = new Produtoperecivel("queijo", 10, 100, new Date(2027,10,10));
        Produtoperecivel produtoperecivel2 = new Produtoperecivel("Salame", 5, 20, new Date(2030,1,1));
        Produtoperecivel produtoperecivel3 = new Produtoperecivel("leite", 20, 67, new Date(2026,06,31));

        System.out.println(produtoperecivel);
        System.out.println(produtoperecivel2);
        System.out.println(produtoperecivel3);
    }
}

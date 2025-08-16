/* 3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor. */

class __Produto extends _Produto {
    public __Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class Challenge3 {
    public static void main(String[] args) {
        __Produto produto = new __Produto("Alicate", 7.5, 20);
        __Produto produto2 = new __Produto("Estanho", 17.5, 220);
        __Produto produto3 = new __Produto("Sugador", 17.5, 5);

        System.out.println(produto);
        System.out.println(produto2);
        System.out.println(produto3);
    }
}

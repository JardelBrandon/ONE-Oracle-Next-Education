class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(int descontoPercentual) {
        System.out.println("Preço: " + preco);
        System.out.println("Desconto: " + descontoPercentual + "%");
        System.out.println("Preço com desconto: " + (preco - preco * descontoPercentual / 100));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class Challenge3 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Kit Muay Thai");
        produto.setPreco(200);
        produto.aplicarDesconto(25);
    }
}

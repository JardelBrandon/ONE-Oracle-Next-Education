/* 2. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo. */

class Titulo implements Comparable<Titulo> {
    public String nome;

    @Override
    public int compareTo(Titulo o) {
        return nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}

public class Challenge2 {
    public static void main(String[] args) {

    }
}

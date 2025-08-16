/* 4. Imprima o tamanho da lista utilizando o método size. */

import java.util.ArrayList;

public class Challenge4 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.nome = "Joao";
        p2.nome = "Maria";
        p3.nome = "Jardel";
        p1.idade = 20;
        p2.idade = 18;
        p3.idade = 29;
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println(pessoas.size());
    }
}

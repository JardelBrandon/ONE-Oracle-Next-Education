/* 6. Imprima a lista completa */

import java.util.ArrayList;

public class Challenge6 {
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

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}

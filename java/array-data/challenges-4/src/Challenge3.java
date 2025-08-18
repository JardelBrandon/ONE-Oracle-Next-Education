/* 3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        Titulo t = new Titulo();
        t.nome = "Mulher Gato";

        Titulo t2 = new Titulo();
        t2.nome = "Homem de Ferro";

        Titulo t3 = new Titulo();
        t3.nome = "Capitão América";

        ArrayList<Titulo> ordenarTitulos = new ArrayList<>(List.of(t, t2, t3));

        System.out.println("Desordenados: " + ordenarTitulos);
        Collections.sort(ordenarTitulos);
        System.out.println("Ordenados: " + ordenarTitulos);

    }
}

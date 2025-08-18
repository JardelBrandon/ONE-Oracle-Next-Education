/* 1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(5, 6, 1, 3, 42, 0, -10, 5, -20, 70, -50, 25, 10, 55));

        Collections.sort(numeros);

        System.out.println(numeros);

    }
}

/* 4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação. */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Challenge4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(-5, 4, 5, 10, 3, 8, 85, -52));
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(-5, 4, 5, 10, 3, 8, 85, -52));

        List list = linkedList;
        System.out.println(list);

        list = arrayList;
        System.out.println(list);
    }
}

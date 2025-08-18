/* 1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista. */

import java.lang.ref.Reference;
import java.util.ArrayList;

public class Challente1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add("a" + i );
        }

        for (String item: list) {
            System.out.println(item);
        }
    }
}

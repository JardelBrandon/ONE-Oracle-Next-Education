/* 5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo. */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Challenge5 {
    public static void main(String[] args) {
        List<Integer> listaPolimorfismo;

        listaPolimorfismo = new ArrayList<Integer>();
        listaPolimorfismo.add(1);
        listaPolimorfismo.add(2);
        listaPolimorfismo.add(3);
        System.out.println("Array List: " + listaPolimorfismo);

        listaPolimorfismo = new Vector<Integer>();
        listaPolimorfismo.add(4);
        listaPolimorfismo.add(5);
        listaPolimorfismo.add(6);
        System.out.println("Vector: " + listaPolimorfismo);
    }
}

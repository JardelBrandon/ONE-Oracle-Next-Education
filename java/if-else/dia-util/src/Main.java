/* Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.

Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não. */

import java.lang.classfile.instruction.SwitchCase;

class DiaDaSemana {
    void verificador(String dia) {
        switch (dia) {
            case "segunda":
                System.out.println("Segunda é um dia útil");
                break;
            case "terca":
                System.out.println("Terça é um dia útil");
                break;
            case "quarta":
                System.out.println("Quarta é um dia útil");
                break;
            case "quinta":
                System.out.println("Quinta é um dia útil");
                break;
            case "sexta":
                System.out.println("Sexta é um dia útil");
                break;
            case "sabado":
                System.out.println("Sábado não é um dia útil");
                break;
            case "domingo":
                System.out.println("Domingo não é um dia útil");
                break;
            default:
                System.out.println("Inválido!");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DiaDaSemana diaDaSemana = new DiaDaSemana();
        diaDaSemana.verificador("segunda");
        diaDaSemana.verificador("terca");
        diaDaSemana.verificador("quarta");
        diaDaSemana.verificador("quinta");
        diaDaSemana.verificador("sexta");
        diaDaSemana.verificador("sabado");
        diaDaSemana.verificador("domingo");
        diaDaSemana.verificador("asdf");
    }
}

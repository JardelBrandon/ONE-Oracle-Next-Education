/* João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:

Um código de acesso numérico (o código correto é 2023).

Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).

O sistema só permitirá o acesso se:

O código de acesso estiver correto.

O nível de permissão for válido (1, 2 ou 3).

Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).

Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o acesso foi permitido ou negado, além do motivo, se for o caso. */

import java.util.Scanner;

class CodigoSeguranca {
    void verificar(String codigo, String nivel) {
        boolean codificado = codigo.equals("2023");
        boolean nivelado = nivel.equals("1") || nivel.equals("2") || nivel.equals("3");

        if (codificado && nivelado) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else if (!codificado && nivelado) {
            System.out.println("Acesso negado. Código inválido!");
        } else if (codificado && !nivelado) {
            System.out.println("Acesso negado. Nível inválido!");
        } else {
            System.out.println("Acesso negado. Código e nível inválidos!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código");
        String codigo = sc.nextLine();
        System.out.println("Digite o nivel");
        String nivel = sc.nextLine();

        CodigoSeguranca seguranca = new CodigoSeguranca();
        seguranca.verificar(codigo, nivel);
    }
}

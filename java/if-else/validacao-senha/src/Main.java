/* Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao sistema interno. Os funcionários utilizam uma senha fixa para acessar suas contas, e o sistema deve verificar se a senha inserida está correta.

Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456, verifique se o que o usuário digitou está correto ou não. O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado. */

class Senha {
    void verificaSenha(String senha) {
        if (senha.equals("123456")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Senha senha = new Senha();
        senha.verificaSenha("123456");
        senha.verificaSenha("123");
    }
}

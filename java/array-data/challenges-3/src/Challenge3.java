/* 2. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal. */

class _Animal {
    String nome;
    int idade;

    void falar(){};
}

class _Cachorro extends _Animal {
    String raca;

    void roerOsso(){};

    void falar() {
        System.out.println("au au au");
    }
}

public class Challenge3 {
    public static void main(String[] args) {
        _Cachorro _cachorro = new _Cachorro();

        if (_cachorro instanceof _Animal) {
            System.out.println((_Animal) _cachorro);
        }
    }
}

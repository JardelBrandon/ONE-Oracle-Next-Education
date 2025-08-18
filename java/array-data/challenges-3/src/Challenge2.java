/* 2. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal. */

class Animal {
    String nome;
    int idade;

    void falar(){};
}

class Cachorro extends Animal {
    String raca;

    void roerOsso(){};

    void falar() {
        System.out.println("au au au");
    }
}

public class Challenge2 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        System.out.println((Animal) cachorro);
    }
}

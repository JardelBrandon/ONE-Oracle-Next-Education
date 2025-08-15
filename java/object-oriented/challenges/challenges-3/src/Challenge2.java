/* 2. Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato. */

class Animal {
    public void emitirSom() {
        System.out.println("I'm an animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo!");
    }
}

class gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando moveis!");
    }
}

public class Challenge2 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.abanarRabo();
        cachorro.emitirSom();

        gato gato = new gato();
        gato.arranharMoveis();
        gato.emitirSom();
    }
}

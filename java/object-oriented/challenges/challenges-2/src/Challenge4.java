import java.util.Arrays;

class Aluno {
    private String nome;
    private double[] notas;

    public void calcularMedia() {
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Quantidade de notas: " + this.getNotas().length);
        System.out.println("Média das notas: " + Arrays.stream(notas).average().getAsDouble());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}

public class Challenge4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Flaviane");
        aluno.setNotas(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        aluno.calcularMedia();
    }
}

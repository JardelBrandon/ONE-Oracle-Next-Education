import java.time.LocalDate;

class Carro {
    String modelo;
    int anoFabricacao;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Cor: " + cor);
    }

    void calcularIdadeDoCarro() {
        int anoAtual = LocalDate.now().getYear();
        int idadeDoCarro = anoAtual - anoFabricacao;
        System.out.println("Idade do carro: " + idadeDoCarro);
    }
}

public class Challenge4 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Mitsubishi | L200";
        carro.anoFabricacao = 2011;
        carro.cor = "Amarelo";

        carro.exibirFichaTecnica();
        carro.calcularIdadeDoCarro();
    }
}

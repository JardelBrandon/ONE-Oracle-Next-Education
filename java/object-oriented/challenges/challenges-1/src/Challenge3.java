class Musica {
    String titulo;
    String artista;
    int anoLancamento = 0;
    double avaliacao = 0;
    double numAvaliacoes = 0;

    void exibirFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliacao: " + avaliacao);
        System.out.println("Numéro de Avaliações: " + numAvaliacoes);
    }

    void avaliarMusica(int avaliacao) {
        this.avaliacao += avaliacao;
        numAvaliacoes++;
    }

    void calcularMediaAvaliacoes() {
        System.out.println("Média das avaliações: " + avaliacao / numAvaliacoes);
    }
}

public class Challenge3 {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "Vida longa mundo pequeno";
        musica.artista = "Oriente";
        musica.anoLancamento = 2011;

        musica.avaliarMusica(5);
        musica.avaliarMusica(10);
        musica.exibirFichaTecnica();
        musica.calcularMediaAvaliacoes();
    }
}

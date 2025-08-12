class Livro {
    private String titulo;
    private String autor;

    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

public class Challenge5 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro2 = new Livro();

        livro.setAutor("Jardel e Flaviane");
        livro.setTitulo("Maktub - Estava escrito | Tinha de acontecer");
        livro2.setAutor("Jesus");
        livro2.setTitulo("Bíblia");

        livro.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}

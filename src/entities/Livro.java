package entities;

public class Livro {

    private final String titulo;
    private final String autor;
    private final int anoPublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void emprestarLivro(){

    }

    public void devolverLivro(){

    }

    public String toString() {
    return "Livro{" +
            "Titulo='" + titulo + '\'' +
            ", Autor='" + autor + '\'' +
            ", Ano de Publicacao=" + anoPublicacao +
            ", Status=" + disponibilidade +
            '}';
}
}
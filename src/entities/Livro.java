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

    public void emprestarLivro() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.printf("Livro %s emprestado! %n", titulo);
        } else{
            System.out.println("Livro já se encontra emprestado");
        }
    }

    public void devolverLivro() {
        if(!disponibilidade){
            disponibilidade = true;
            System.out.printf("Livro %s devolvido!%n", titulo);
        } else {
            System.out.println("Livro já se encontra disponível para empréstimo!");
        }
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
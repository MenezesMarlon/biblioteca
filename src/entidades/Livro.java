package entidades;

public class Livro {
    
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponibilidade){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        disponibilidade = true;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public boolean isDisponivel(){
        return disponibilidade;
    }

    




}

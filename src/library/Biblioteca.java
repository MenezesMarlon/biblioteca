package library;

import java.util.ArrayList;
import java.util.List;

import entities.Livro;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livros.add(livro);
    }

    public void consultarLivros(String titulo) {
        livros.stream();
    }

    public void listarLivros() {
        livros.forEach(System.out::println);
    }

}

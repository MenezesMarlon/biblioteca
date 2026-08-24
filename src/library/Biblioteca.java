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
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
                System.out.println(livro);
                break;
            }

        }
        if (!encontrado) {
            System.out.println("Livro não Encontrado");
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.emprestarLivro();
                break;
            }
        }
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolverLivro();
                break;
            }
        }

    }

}

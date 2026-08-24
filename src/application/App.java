package application;

import java.util.Scanner;

import library.Biblioteca;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String titulo, autor;
        int anoPublicacao;

        int opcao;
        do {
            System.out.println("===== BIBLIOTECA =====");
            System.out.println("");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Consultar Livros");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    titulo = scanner.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    anoPublicacao = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.cadastrarLivro(titulo, autor, anoPublicacao);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    System.out.println();
                    System.out.print("Digite o nome do livro: ");
                    titulo = scanner.nextLine();
                    biblioteca.consultarLivros(titulo);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
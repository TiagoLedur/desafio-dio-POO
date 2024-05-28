package br.com.dio.desafio.dominio;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    public Set<Livro> biblioteca;

    public Biblioteca() {
        this.biblioteca = new HashSet<>();
    }

    public void adicionarLivro(String nome, String autor, LocalDate dataLancamento) {
        biblioteca.add(new Livro(nome, autor, dataLancamento));
    }

    public void removerLivro(String nome) {
        Set<Livro> livrosParaRemover = new HashSet<>();
        for (Livro l : biblioteca) {
            if (l.getNome().equalsIgnoreCase(nome)) {
                livrosParaRemover.add(l);
            }
        }
        biblioteca.removeAll(livrosParaRemover);
    }

    public Livro buscarLivroPorTitulo(String nome) {
        for (Livro livro : biblioteca) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(String nome) {
        Livro livro = buscarLivroPorTitulo(nome);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
        } else if (!livro.isDisponivel()) {
            System.out.println("Livro não está disponível para empréstimo.");
        } else {
            livro.setDisponivel(false);
            System.out.println("Livro '" + nome + "' emprestado com sucesso.");
        }
    }

    public void devolverLivro(String nome) {
        Livro livro = buscarLivroPorTitulo(nome);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
        }else if (livro.isDisponivel()) {
            System.out.println("Livro já está disponível na biblioteca.");
        }else {
            livro.setDisponivel(true);
            System.out.println("Livro '" + nome + "' devolvido com sucesso.");
        }
    }

    public void listarLivros() {
        for (Livro livro : biblioteca) {
            System.out.println(livro);
        }
    }
}


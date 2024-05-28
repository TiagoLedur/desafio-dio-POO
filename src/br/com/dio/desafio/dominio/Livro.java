package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Livro {

private String nome;
private String autor;
private LocalDate dataLancamento;
private boolean disponivel;

    public Livro(String nome, String autor, LocalDate dataLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }

}

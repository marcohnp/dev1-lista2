package com.marcohnp.dev1lista2.model;

import java.util.Objects;

public class LivroModel {

    private Integer id;
    private String titulo;
    private String autorPrimeiroNome;
    private String autorSegundoNome;
    private String anoPublicacao;
    private String editora;
    private Boolean doacao;

    public LivroModel() {
    }

    public LivroModel(Integer id, String titulo, String autorPrimeiroNome, String autorSegundoNome,
                      String anoPublicacao, String editora, Boolean doacao) {
        this.id = id;
        this.titulo = titulo;
        this.autorPrimeiroNome = autorPrimeiroNome;
        this.autorSegundoNome = autorSegundoNome;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.doacao = doacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorPrimeiroNome() {
        return autorPrimeiroNome;
    }

    public void setAutorPrimeiroNome(String autorPrimeiroNome) {
        this.autorPrimeiroNome = autorPrimeiroNome;
    }

    public String getAutorSegundoNome() {
        return autorSegundoNome;
    }

    public void setAutorSegundoNome(String autorSegundoNome) {
        this.autorSegundoNome = autorSegundoNome;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Boolean getDoacao() {
        return doacao;
    }

    public void setDoacao(Boolean doacao) {
        this.doacao = doacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LivroModel)) return false;
        LivroModel livro = (LivroModel) o;
        return Objects.equals(id, livro.id) && Objects.equals(titulo, livro.titulo) &&
                Objects.equals(autorPrimeiroNome, livro.autorPrimeiroNome) &&
                Objects.equals(autorSegundoNome, livro.autorSegundoNome) &&
                Objects.equals(anoPublicacao, livro.anoPublicacao) &&
                Objects.equals(editora, livro.editora) && Objects.equals(doacao, livro.doacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autorPrimeiroNome, autorSegundoNome, anoPublicacao, editora, doacao);
    }
}

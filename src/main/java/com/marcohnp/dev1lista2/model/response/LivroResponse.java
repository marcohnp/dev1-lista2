package com.marcohnp.dev1lista2.model.response;

import java.util.Objects;

public class LivroResponse {

    private Integer id;
    private String titulo;
    private String autorPrimeiroNome;
    private String autorSegundoNome;
    private String anoPublicacao;
    private String editora;
    private Boolean doacao;

    public LivroResponse() {
    }

    public LivroResponse(Integer id, String titulo, String autorPrimeiroNome, String autorSegundoNome,
                         String anoPublicacao, String editor, Boolean doacao) {
        this.id = id;
        this.titulo = titulo;
        this.autorPrimeiroNome = autorPrimeiroNome;
        this.autorSegundoNome = autorSegundoNome;
        this.anoPublicacao = anoPublicacao;
        this.editora = editor;
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

    public String getEditor() {
        return editora;
    }

    public void setEditor(String editor) {
        this.editora = editor;
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
        if (!(o instanceof LivroResponse)) return false;
        LivroResponse that = (LivroResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(titulo, that.titulo) &&
                Objects.equals(autorPrimeiroNome, that.autorPrimeiroNome) &&
                Objects.equals(autorSegundoNome, that.autorSegundoNome) &&
                Objects.equals(anoPublicacao, that.anoPublicacao) &&
                Objects.equals(editora, that.editora) && Objects.equals(doacao, that.doacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autorPrimeiroNome, autorSegundoNome, anoPublicacao, editora, doacao);
    }
}

package com.marcohnp.dev1lista2.model.request;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class LivroRequest {

    private Integer id;
    @NotEmpty(message = "Título não pode ser nulo ou vazio.")
    private String titulo;
    @NotEmpty(message = "Primeiro nome do autor deve ser preenchido.")
    private String autorPrimeiroNome;
    private String autorSegundoNome;
    private String anoPublicacao;
    @NotEmpty(message = "Editora deve ser preenchida.")
    private String editora;
    private Boolean doacao;

    public LivroRequest() {
    }

    public LivroRequest(Integer id, String titulo, String autorPrimeiroNome, String autorSegundoNome,
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
        if (!(o instanceof LivroRequest)) return false;
        LivroRequest that = (LivroRequest) o;
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

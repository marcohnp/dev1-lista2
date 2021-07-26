package com.marcohnp.dev1lista2.exception.exceptions;

import java.util.Objects;

public class LivroAnoPublicacaoInvalidoException extends RuntimeException {

    private String message;

    public LivroAnoPublicacaoInvalidoException() {
        super();
    }

    public LivroAnoPublicacaoInvalidoException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivroAnoPublicacaoInvalidoException that = (LivroAnoPublicacaoInvalidoException) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}

package com.marcohnp.dev1lista2.exception.exceptions;

import java.util.Objects;

public class LivroNotFoundException extends RuntimeException {

    private String message;

    public LivroNotFoundException() {
        super();
    }

    public LivroNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivroNotFoundException that = (LivroNotFoundException) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}

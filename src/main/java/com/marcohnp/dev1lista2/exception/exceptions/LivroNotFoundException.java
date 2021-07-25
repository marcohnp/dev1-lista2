package com.marcohnp.dev1lista2.exception.exceptions;

public class LivroNotFoundException extends RuntimeException {

    public LivroNotFoundException() {
        super("Livro não encontrado.");
    }
}

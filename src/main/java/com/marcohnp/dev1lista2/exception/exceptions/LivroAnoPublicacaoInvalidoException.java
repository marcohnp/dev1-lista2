package com.marcohnp.dev1lista2.exception.exceptions;

public class LivroAnoPublicacaoInvalidoException extends RuntimeException{

    public LivroAnoPublicacaoInvalidoException() {
        super("Ano inválido. Ano de publicação tem que ser entre 1800 e 2021.");
    }
}

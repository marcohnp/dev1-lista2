package com.marcohnp.dev1lista2.exception.exceptions;

public class RequestInvalidaException extends RuntimeException {

    public RequestInvalidaException() {
        super("Request inválida. Título do livro, primeiro nome do autor e editora não podem serem nulos ou vazios");
    }
}

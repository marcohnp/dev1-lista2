package com.marcohnp.dev1lista2.exception.handler;

import com.marcohnp.dev1lista2.exception.error.StandardError;
import com.marcohnp.dev1lista2.exception.exceptions.LivroAnoPublicacaoInvalidoException;
import com.marcohnp.dev1lista2.exception.exceptions.LivroNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class Handler {

    @ExceptionHandler(LivroNotFoundException.class)
    public ResponseEntity<StandardError> livroNotFound(LivroNotFoundException e, HttpServletRequest request) {
        return new ResponseEntity<>(new StandardError(Instant.now(), HttpStatus.NOT_FOUND.value(),
                "Request não completada.", e.getMessage(), request.getRequestURI()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(LivroAnoPublicacaoInvalidoException.class)
    public ResponseEntity<StandardError> livroAnoPublicacaoInvalido(LivroAnoPublicacaoInvalidoException e, HttpServletRequest request) {
        return new ResponseEntity<>(new StandardError(Instant.now(), HttpStatus.NOT_FOUND.value(),
                "Request não completada.", e.getMessage(), request.getRequestURI()), HttpStatus.NOT_FOUND);
    }
}

package com.marcohnp.dev1lista2.controller;

import com.marcohnp.dev1lista2.exception.exceptions.RequestInvalidaException;
import com.marcohnp.dev1lista2.facade.LivroFacade;
import com.marcohnp.dev1lista2.model.request.LivroRequest;
import com.marcohnp.dev1lista2.model.response.LivroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

    @Autowired
    private LivroFacade facade;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LivroResponse> listar() {
        return facade.listar();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LivroResponse recuperar(@PathVariable Integer id) {
        return facade.recuperar(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LivroResponse inserir(@Valid @RequestBody LivroRequest request, BindingResult errors) {
        if (errors.hasErrors()) {
            throw new RequestInvalidaException();
        }
        return facade.inserir(request);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LivroResponse atualizar(@PathVariable Integer id, @Valid @RequestBody LivroRequest request, BindingResult errors) {
        if (errors.hasErrors()) {
            throw new RequestInvalidaException();
        }
        return facade.atualizar(id, request);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagar(@PathVariable Integer id) {
        facade.apagar(id);
    }
}

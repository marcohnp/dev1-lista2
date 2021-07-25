package com.marcohnp.dev1lista2.facade;

import com.marcohnp.dev1lista2.mapper.LivroMapper;
import com.marcohnp.dev1lista2.model.request.LivroRequest;
import com.marcohnp.dev1lista2.model.response.LivroResponse;
import com.marcohnp.dev1lista2.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LivroFacade {

    @Autowired
    private LivroService service;

    public List<LivroResponse> listar() {
        return service.listar().stream().map(LivroMapper::mapToResponse).collect(Collectors.toList());
    }

    public LivroResponse recuperar(Integer id) {
        return LivroMapper.mapToResponse(service.recuperar(id));
    }

    public LivroResponse inserir(LivroRequest request) {
        return LivroMapper.mapToResponse(service.inserir(LivroMapper.mapToModel(request)));
    }

    public LivroResponse atualizar(Integer id, LivroRequest request) {
        return LivroMapper.mapToResponse(service.atualizar(id, LivroMapper.mapToModel(request)));
    }

    public void apagar(Integer id) {
        service.apagar(id);
    }
}

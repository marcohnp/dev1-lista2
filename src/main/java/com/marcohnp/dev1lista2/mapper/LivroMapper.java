package com.marcohnp.dev1lista2.mapper;

import com.marcohnp.dev1lista2.entity.LivroEntity;
import com.marcohnp.dev1lista2.model.LivroModel;
import com.marcohnp.dev1lista2.model.request.LivroRequest;
import com.marcohnp.dev1lista2.model.response.LivroResponse;
import org.springframework.util.ObjectUtils;

public class LivroMapper {

    public static LivroResponse mapToResponse(LivroModel model) {
        if (ObjectUtils.isEmpty(model)) return null;
        return new LivroResponse(model.getId(), model.getTitulo(), model.getAutorPrimeiroNome(),
                model.getAutorSegundoNome(), model.getAnoPublicacao(), model.getEditora(), model.getDoacao());
    }

    public static LivroModel mapToModel(LivroRequest request) {
        if (ObjectUtils.isEmpty(request)) return null;
        return new LivroModel(request.getId(), request.getTitulo(), request.getAutorPrimeiroNome(),
                request.getAutorSegundoNome(), request.getAnoPublicacao(), request.getEditora(), request.getDoacao());
    }

    public static LivroModel mapToModel(LivroEntity entity) {
        if (ObjectUtils.isEmpty(entity)) return null;
        return new LivroModel(entity.getId(), entity.getTitulo(), entity.getAutorPrimeiroNome(),
                entity.getAutorSegundoNome(), entity.getAnoPublicacao(), entity.getEditora(), entity.getDoacao());
    }

    public static LivroEntity mapToEntity(LivroModel model) {
        if (ObjectUtils.isEmpty(model)) return null;
        return new LivroEntity(model.getId(), model.getTitulo(), model.getAutorPrimeiroNome(),
                model.getAutorSegundoNome(), model.getAnoPublicacao(), model.getEditora(), model.getDoacao());
    }
}

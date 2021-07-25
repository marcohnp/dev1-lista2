package com.marcohnp.dev1lista2.service;

import com.marcohnp.dev1lista2.entity.LivroEntity;
import com.marcohnp.dev1lista2.exception.exceptions.LivroAnoPublicacaoInvalidoException;
import com.marcohnp.dev1lista2.exception.exceptions.LivroNotFoundException;
import com.marcohnp.dev1lista2.mapper.LivroMapper;
import com.marcohnp.dev1lista2.model.LivroModel;
import com.marcohnp.dev1lista2.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public List<LivroModel> listar() {
        return repository.findAll().stream().map(LivroMapper::mapToModel).collect(Collectors.toList());
    }

    public LivroModel recuperar(Integer id) {
        return LivroMapper.mapToModel(repository.findById(id).orElseThrow(
                LivroNotFoundException::new));
    }

    public LivroModel inserir(LivroModel model) {
        if (!anoPublicacaoValido(model.getAnoPublicacao()))
            throw new LivroAnoPublicacaoInvalidoException();
        return LivroMapper.mapToModel(repository.save(LivroMapper.mapToEntity(model)));
    }

    private boolean anoPublicacaoValido(String ano) {
        try {
            var sdf = new SimpleDateFormat("yyyy");
            Date anoPublicacao = sdf.parse(ano);
            Date anoMinimo = sdf.parse("1800");
            Date anoMaximo = sdf.parse("2021");
            return anoPublicacao.before(anoMaximo) && anoPublicacao.after(anoMinimo);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    public LivroModel atualizar(Integer id, LivroModel model) {
        var entity = (repository.findById(id).orElseThrow(
                LivroNotFoundException::new));
        atualizaLivro(model, entity);
        return LivroMapper.mapToModel(repository.save(entity));
    }

    private void atualizaLivro(LivroModel model, LivroEntity entity) {
        entity.setTitulo(model.getTitulo());
        entity.setAutorPrimeiroNome(model.getAutorPrimeiroNome());
        entity.setAutorSegundoNome(model.getAutorSegundoNome());
        entity.setAnoPublicacao(model.getAnoPublicacao());
        entity.setEditora(model.getEditora());
        entity.setDoacao(model.getDoacao());
    }

    public void apagar(Integer id) {
        repository.findById(id).orElseThrow(
                LivroNotFoundException::new);
        repository.deleteById(id);
    }
}

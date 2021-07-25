package com.marcohnp.dev1lista2.service;

import com.marcohnp.dev1lista2.exception.exceptions.LivroAnoPublicacaoInvalidoException;
import com.marcohnp.dev1lista2.exception.exceptions.LivroNotFoundException;
import com.marcohnp.dev1lista2.repository.LivroRepository;
import com.marcohnp.dev1lista2.stub.LivroEntityStub;
import com.marcohnp.dev1lista2.stub.LivroModelStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LivroServiceTest {

    @Mock
    private LivroRepository repository;

    @InjectMocks
    private LivroService service;


    @Test
    void listar_deveRetornarUmaListaDeLivroModel() {
        when(repository.findAll()).thenReturn(LivroEntityStub.createListLivroEntity());
        assertEquals(LivroModelStub.createListLivroModel(), service.listar());
        verify(repository, times(1)).findAll();
    }

    @Test
    void recuperar_deveRetornarLivroModel_quandoUmaRequestForValida() {
        when(repository.findById(any())).thenReturn(Optional.of(LivroEntityStub.createLivroEntityStub1()));
        assertEquals(LivroModelStub.createLivroModelStub1(), service.recuperar(1));
        verify(repository, times(1)).findById(1);
    }

    @Test
    void recuperar_deveLancarException_quandoUmaRequestForInvalida() {
        when(repository.findById(any())).thenThrow(LivroNotFoundException.class);
        assertThrows(LivroNotFoundException.class, () -> service.recuperar(2));
    }

    @Test
    void inserir_deveInserirLivroModel_quandoUmaRequestForValida() {
        var model = LivroModelStub.createLivroModelStub1();
        var entity = LivroEntityStub.createLivroEntityStub1();
        when(repository.save(any())).thenReturn(entity);
        assertEquals(model, service.inserir(model));
        verify(repository, times(1)).save(entity);
    }

    @Test
    void inserir_deveLancarException_quandoAnoForMenorQue1800() {
        var model = LivroModelStub.createLivroModelStub1();
        model.setAnoPublicacao("1799");
        assertThrows(LivroAnoPublicacaoInvalidoException.class, () -> service.inserir(model));
    }

    @Test
    void inserir_deveLancarException_quandoAnoForMaiorQue2021() {
        var model = LivroModelStub.createLivroModelStub1();
        model.setAnoPublicacao("2022");
        assertThrows(LivroAnoPublicacaoInvalidoException.class, () -> service.inserir(model));
    }

    @Test
    void atualizar_deveAtualizarLivroModel_quandoRequestForValida() {
        var modelAtualizado = LivroModelStub.createLivroModelStubAtualiza();
        when(repository.save(any())).thenReturn(LivroEntityStub.createLivroEntityStubAtualiza());
        when(repository.findById(2)).thenReturn(Optional.of(LivroEntityStub.createLivroEntityStub2()));
        assertEquals(modelAtualizado, service.atualizar(2, modelAtualizado));
        verify(repository, times(1)).findById(2);
    }

    @Test
    void atualizar_deveLancarException_quandoResquestForInvalida() {
        when(repository.findById(any())).thenThrow(LivroNotFoundException.class);
        assertThrows(LivroNotFoundException.class,
                () -> service.atualizar(2, LivroModelStub.createLivroModelStub2()));
        verify(repository, never()).save(LivroEntityStub.createLivroEntityStub2());
    }

    @Test
    void deletar_deveChamarRepository_quandoRequestForValida() {
        when(repository.findById(1)).thenReturn(Optional.of(LivroEntityStub.createLivroEntityStub1()));
        service.apagar(1);
        verify(repository, times(1)).deleteById(1);
    }

    @Test
    void deletar_deveChamarRepository_quandoRequestForInvalida() {
        when(repository.findById(any())).thenThrow(LivroNotFoundException.class);
        assertThrows(LivroNotFoundException.class, () -> service.apagar(1));
        verify(repository, never()).deleteById(1);

    }
}
package com.marcohnp.dev1lista2.facade;

import com.marcohnp.dev1lista2.service.LivroService;
import com.marcohnp.dev1lista2.stub.LivroModelStub;
import com.marcohnp.dev1lista2.stub.LivroResponseStub;
import com.marcohnp.dev1lista2.stub.LivroResquestStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LivroFacadeTest {

    @Mock
    private LivroService service;

    @InjectMocks
    private LivroFacade facade;

    @Test
    void listar_deveRetonarUmaListaDeLivroResponse() {
        when(service.listar()).thenReturn(LivroModelStub.createListLivroModel());
        assertEquals(LivroResponseStub.createListLivroResponseStub(), facade.listar());
        verify(service, times(1)).listar();
    }

    @Test
    void recuperar_deveRetornarUmLivroResponse_quandoUmaRequestForValida() {
        when(service.recuperar(1)).thenReturn(LivroModelStub.createLivroModelStub1());
        assertEquals(LivroResponseStub.createLivroResponseStub1(), facade.recuperar(1));
        verify(service, times(1)).recuperar(1);
    }

    @Test
    void inserir_deveInserirUmLivroModel_quandoUmaRequestForValida() {
        var model = LivroModelStub.createLivroModelStub1();
        when(service.inserir(any())).thenReturn(model);
        assertEquals(LivroResponseStub.createLivroResponseStub1(),
                facade.inserir(LivroResquestStub.createLivroRequestStub()));
        verify(service, times(1)).inserir(model);
    }

    @Test
    void atualizar_deveAtualizarUmLivroModel_quandoUmaRequestForValida() {
        var model = LivroModelStub.createLivroModelStub1();
        when(service.atualizar(any(), any())).thenReturn(model);
        assertEquals(LivroResponseStub.createLivroResponseStub1(),
                facade.atualizar(1, LivroResquestStub.createLivroRequestStub()));
        verify(service, times(1)).atualizar(1, model);
    }

    @Test
    void apagar_deveChamarService_quandoUmIdForValido() {
        facade.apagar(1);
        verify(service, times(1)).apagar(1);
    }
}
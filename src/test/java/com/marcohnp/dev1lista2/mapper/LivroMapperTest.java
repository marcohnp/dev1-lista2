package com.marcohnp.dev1lista2.mapper;

import com.marcohnp.dev1lista2.stub.LivroEntityStub;
import com.marcohnp.dev1lista2.stub.LivroModelStub;
import com.marcohnp.dev1lista2.stub.LivroResponseStub;
import com.marcohnp.dev1lista2.stub.LivroResquestStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LivroMapperTest {

    @Test
    void mapModelToEntity() {
        assertEquals(LivroEntityStub.createLivroEntityStub1(),
                LivroMapper.mapToEntity(LivroModelStub.createLivroModelStub1()));
    }

    @Test
    void mapEntityToModel() {
        assertEquals(LivroModelStub.createLivroModelStub1(),
                LivroMapper.mapToModel(LivroEntityStub.createLivroEntityStub1()));
    }

    @Test
    void mapModelToResponse() {
        assertEquals(LivroResponseStub.createLivroResponseStub1(),
                LivroMapper.mapToResponse(LivroModelStub.createLivroModelStub1()));
    }

    @Test
    void mapRequestToModel() {
        assertEquals(LivroModelStub.createLivroModelStub1(),
                LivroMapper.mapToModel(LivroResquestStub.createLivroRequestStub()));
    }

}
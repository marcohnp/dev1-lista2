package com.marcohnp.dev1lista2.stub;

import com.marcohnp.dev1lista2.entity.LivroEntity;

import java.util.ArrayList;
import java.util.List;

public class LivroEntityStub {

    public static LivroEntity createLivroEntityStub1() {
        return new LivroEntity(1, "A Batalha do Apocalipse", "Eduardo", "Spohr",
                "2001", "Verus", false);
    }

    public static LivroEntity createLivroEntityStub2() {
        return new LivroEntity(2, "Filhos do Éden", "Eduardo", "Spohr",
                "2010", "Verus", true);
    }

    public static LivroEntity createLivroEntityStubAtualiza() {
        return new LivroEntity(2, "Código Limpo", "Robert", "Martin",
                "2001", "Alta", false);
    }

    public static List<LivroEntity> createListLivroEntity() {
        var list = new ArrayList<LivroEntity>();
        list.add(createLivroEntityStub1());
        list.add(createLivroEntityStub2());
        return list;
    }


}

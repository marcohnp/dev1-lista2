package com.marcohnp.dev1lista2.stub;

import com.marcohnp.dev1lista2.model.response.LivroResponse;

import java.util.ArrayList;
import java.util.List;

public class LivroResponseStub {

    public static LivroResponse createLivroResponseStub1() {
        return new LivroResponse(1, "A Batalha do Apocalipse", "Eduardo", "Spohr",
                "2001", "Verus", false);
    }

    public static LivroResponse createLivroResponseStub2() {
        return new LivroResponse(2, "Filhos do Éden", "Eduardo", "Spohr",
                "2010", "Verus", true);
    }

    public static List<LivroResponse> createListLivroResponseStub() {
        var list = new ArrayList<LivroResponse>();
        list.add(createLivroResponseStub1());
        list.add(createLivroResponseStub2());
        return list;
    }
}

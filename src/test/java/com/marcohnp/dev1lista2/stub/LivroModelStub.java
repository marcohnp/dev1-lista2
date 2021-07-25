package com.marcohnp.dev1lista2.stub;

import com.marcohnp.dev1lista2.model.LivroModel;

import java.util.ArrayList;
import java.util.List;

public class LivroModelStub {

    public static LivroModel createLivroModelStub1() {
        return new LivroModel(1, "A Batalha do Apocalipse", "Eduardo", "Spohr",
                "2001", "Verus", false);
    }

    public static LivroModel createLivroModelStub2() {
        return new LivroModel(2, "Filhos do Éden", "Eduardo", "Spohr",
                "2010", "Verus", true);
    }

    public static LivroModel createLivroModelStubAtualiza() {
        return new LivroModel(2, "Código Limpo", "Robert", "Martin",
                "2001", "Alta", false);
    }

    public static List<LivroModel> createListLivroModel() {
        var list = new ArrayList<LivroModel>();
        list.add(createLivroModelStub1());
        list.add(createLivroModelStub2());
        return list;
    }
}

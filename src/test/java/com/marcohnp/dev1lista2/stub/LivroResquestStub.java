package com.marcohnp.dev1lista2.stub;

import com.marcohnp.dev1lista2.model.request.LivroRequest;

public class LivroResquestStub {

    public static LivroRequest createLivroRequestStub() {
        return new LivroRequest(1, "A Batalha do Apocalipse", "Eduardo", "Spohr",
                "2001", "Verus", false);
    }
}

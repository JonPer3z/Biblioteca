package com.Atvd.Biblioteca.Banco;

import com.Atvd.Biblioteca.Model.Livro;

import java.util.ArrayList;
import java.util.List;

public class BancoDeLivros {
    private List<Livro> livros;

    public BancoDeLivros() {
        this.livros = new ArrayList<>();
    }

    public void insert(Livro l) {
        livros.add(l);
    }
}


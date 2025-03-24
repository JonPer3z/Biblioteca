package com.Atvd.Biblioteca.Controller;

import com.Atvd.Biblioteca.Banco.BancoDeLivros;
import com.Atvd.Biblioteca.Model.Livro;

import java.util.List;

public class LivroController {

    BancoDeLivros bl = new BancoDeLivros();
        public void inserirNoBanco(Livro l){
            bl.insert(l);
        }
    public List<Livro> pegarTodosOsLivros(){
            return bl.findAll();
    }
}


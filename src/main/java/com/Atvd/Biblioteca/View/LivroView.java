package com.Atvd.Biblioteca.View;

import com.Atvd.Biblioteca.Controller.LivroController;
import com.Atvd.Biblioteca.Model.Livro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroView {

    LivroController lc = new LivroController();

    @PostMapping("/Livro")
    public String postNovoLivro(@RequestBody Livro l){
        lc.inserirNoBanco(l);
        return "Livro inserido com sucesso";
    }
}

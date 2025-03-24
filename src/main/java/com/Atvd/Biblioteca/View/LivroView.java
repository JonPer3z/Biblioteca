package com.Atvd.Biblioteca.View;

import com.Atvd.Biblioteca.Controller.LivroController;
import com.Atvd.Biblioteca.Model.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroView {

    LivroController lc = new LivroController();

    @PostMapping("/Livro")
    public String postNovoLivro(@RequestBody Livro l){
        lc.inserirNoBanco(l);
        return "Livro inserido com sucesso";
    }

    @GetMapping("/Livro")
    public List<Livro> getAllProdutos(){
        return lc.pegarTodosOsLivros();
    }
}

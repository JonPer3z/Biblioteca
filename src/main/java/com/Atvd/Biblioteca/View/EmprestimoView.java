package com.Atvd.Biblioteca.View;

import com.Atvd.Biblioteca.Controller.EmprestimoController;
import com.Atvd.Biblioteca.Model.Emprestimo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoView {

    EmprestimoController emp = new EmprestimoController();
    @PostMapping
    public String postNovoProduto(@RequestBody Emprestimo emp) {
        emp.inserirNoBanco(emp);
        return "Sucesso";
    }
}

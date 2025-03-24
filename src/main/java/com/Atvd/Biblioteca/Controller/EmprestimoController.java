package com.Atvd.Biblioteca.Controller;

import com.Atvd.Biblioteca.Banco.BancoDeEmprestimo;
import com.Atvd.Biblioteca.Model.Emprestimo;

public class EmprestimoController {

    BancoDeEmprestimo be = new BancoDeEmprestimo();

    public void inserirNoBanco(Emprestimo emp){
        be.insert(emp);
    }
}

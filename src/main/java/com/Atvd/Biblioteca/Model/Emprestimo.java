package com.Atvd.Biblioteca.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Emprestimo {
    private Long IdEmprestimo;
    private Date dataInicio;
    private Date dataFim;
    private String Livros;
}

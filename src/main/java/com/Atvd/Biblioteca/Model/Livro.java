package com.Atvd.Biblioteca.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Livro {
    private Long IdLivro;
    private String nome;
    private String autor;
    private String genero;
}

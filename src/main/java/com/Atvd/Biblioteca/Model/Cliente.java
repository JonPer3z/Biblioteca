package com.Atvd.Biblioteca.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {
    private Long IdCliente;
    private String nome;
    private String CPF;
    private Number telefone;
    private String Email;
}

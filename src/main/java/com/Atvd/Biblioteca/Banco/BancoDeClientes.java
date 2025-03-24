package com.Atvd.Biblioteca.Banco;

import com.Atvd.Biblioteca.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoDeClientes {
    private List<Cliente> clientes;

    public BancoDeClientes(){
        this.clientes = new ArrayList<>();
    }

    public void insert(Cliente c){
        clientes.add(c);
    }
}

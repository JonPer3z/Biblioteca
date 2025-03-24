package com.Atvd.Biblioteca.Controller;

import com.Atvd.Biblioteca.Banco.BancoDeClientes;
import com.Atvd.Biblioteca.Model.Cliente;

import java.util.List;

public class ClienteController {
    BancoDeClientes bc = new BancoDeClientes();

    public void inserirNoBanco(Cliente c){
        bc.insert(c);
    }

    public List<Cliente> pegarTodosOsClientes(){
        return bc.findAll();
    }
}

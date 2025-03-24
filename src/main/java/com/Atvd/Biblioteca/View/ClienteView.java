package com.Atvd.Biblioteca.View;

import com.Atvd.Biblioteca.Controller.ClienteController;
import com.Atvd.Biblioteca.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteView {

    ClienteController cc = new ClienteController();
    @PostMapping("/cliente")
    public String postNovoProduto(@RequestBody Cliente c){
        cc.inserirNoBanco(c);
        return "Cliente Inserido com sucesso";
    }

    @GetMapping("/Cliente")
    public List<Cliente> getAllCliente(){
        return cc.pegarTodosOsClientes();
    }

}

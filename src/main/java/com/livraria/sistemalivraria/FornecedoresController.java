package com.livraria.sistemalivraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class FornecedoresController {

    @Autowired
    private FornecedoresService fornecedoresService;

    @GetMapping("/listar/fornecedores")
    public ResponseEntity<List<Fornecedores>> listarFornecedores() {
        return ResponseEntity.status(HttpStatus.OK).body(fornecedoresService.listaFornecedores());
    }

    @PostMapping("/cadastrar/fornecedores")
    public ResponseEntity<Fornecedores> cadastrarFornecedores(@RequestBody Fornecedores fornecedores) {
        return ResponseEntity.status(HttpStatus.OK).body(fornecedoresService.cadastraFornecedores(fornecedores));
    }
    
    

}

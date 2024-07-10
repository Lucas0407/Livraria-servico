package com.livraria.sistemalivraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AutoresController {

    @Autowired
    private AutoresService autoresService;

    @PostMapping("/cadastrar/autores")
    public ResponseEntity<Autores> cadastrarAutores(@RequestBody Autores autores) {
        return ResponseEntity.status(HttpStatus.CREATED).body(autoresService.cadastraAutores(autores));
    }
    

}

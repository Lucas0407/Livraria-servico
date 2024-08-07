package com.livraria.sistemalivraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AutoresController {

    @Autowired
    private AutoresService autoresService;

    @PostMapping("/cadastrar/autores")
    public ResponseEntity<Autores> cadastrarAutores(@RequestBody Autores autores) {
        return ResponseEntity.status(HttpStatus.CREATED).body(autoresService.cadastraAutores(autores));
    }

    @GetMapping("/listar/autores")
    public ResponseEntity<List<Autores>> listarAutores() {
        return ResponseEntity.status(HttpStatus.OK).body(autoresService.listarAutores());
    }
    
    
}

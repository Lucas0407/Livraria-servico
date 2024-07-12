package com.livraria.sistemalivraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PecasController {

    @Autowired
    private PecasService pecasService;

    @GetMapping("/listar/pecas")
    public ResponseEntity<List<Pecas>> listarPecas() {
        return ResponseEntity.status(HttpStatus.OK).body(pecasService.listarPecas());
    }
    

}

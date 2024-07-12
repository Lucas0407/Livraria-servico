package com.livraria.sistemalivraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PecasService {

    @Autowired
    private PecasRepository pecasRepository;

    List<Pecas> listarPecas(){
        return pecasRepository.findAll();
    }

}

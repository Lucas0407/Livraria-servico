package com.livraria.sistemalivraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoresService {

    @Autowired
    private AutoresRepository autoresRepository;

    Autores cadastraAutores(Autores autores){
        return autoresRepository.save(autores);
    } 

}

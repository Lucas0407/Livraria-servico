package com.livraria.sistemalivraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoresService {

    @Autowired
    private AutoresRepository autoresRepository;

    Autores cadastraAutores(Autores autores){
        return autoresRepository.save(autores);
    }
    
    Autores cadastrarLivros(Autores autores){
        return autoresRepository.save(autores);
    }

    List<Autores> listarAutores(){
        return autoresRepository.findAll();
    }

}

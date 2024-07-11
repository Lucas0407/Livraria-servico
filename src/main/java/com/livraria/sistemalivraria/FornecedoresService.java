package com.livraria.sistemalivraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedoresService {

    @Autowired
    private FornecedoresRepository fornecedoresRepository;

    Fornecedores cadastraFornecedores(Fornecedores fornecedores){
        return fornecedoresRepository.save(fornecedores);
    }

    List<Fornecedores> listaFornecedores(){
        return fornecedoresRepository.findAll();
    }

}

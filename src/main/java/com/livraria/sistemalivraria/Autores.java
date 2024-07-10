package com.livraria.sistemalivraria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Autores {

    @Id
    @Column(name = "id", nullable = false)
    Integer codAutor;

    @Column(name = "nome", nullable = false)
    String nome;

}

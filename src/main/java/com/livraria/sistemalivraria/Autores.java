package com.livraria.sistemalivraria;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "autores")
@Data
public class Autores {

    @Id
    @Column(name = "autor_id", nullable = false)
    Integer codAutor;

    @Column(name = "nome", nullable = false)
    String nome;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    List<Livros> livros;

}

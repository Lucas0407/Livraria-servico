package com.livraria.sistemalivraria;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "livros")
@Data
public class Livros {

    @Id
    @Column(name = "livro_id", nullable = false)
    Integer codLivro;
    
    @Column(name = "data_de_publicacao", nullable = false)
    LocalDate dataDePublicacao;

    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "autor_id")
    @JsonBackReference
    Autores autor;

}

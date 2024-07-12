package com.livraria.sistemalivraria;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Fornecedores {

    @Id
    @Column(name = "fornecedor_id", nullable = false)
    Integer codFornecedor;

    @Column(name = "nome", nullable = false)
    String nome;

    @OneToOne(mappedBy = "fornecedores", cascade = CascadeType.ALL)
    @JsonManagedReference
    Contas contas;

    @ManyToMany(mappedBy = "fornecedores")
    @JsonBackReference
    List<Pecas> pecas;

}

package com.livraria.sistemalivraria;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Pecas {

    @Id
    @Column(name = "peca_id", nullable = false)
    Integer codPeca;

    @Column(name = "peca_descricao", nullable = false)
    String descricao;

    @ManyToMany
    @JoinTable(
        name = "pecas_fornecedores",
        schema = "public",
        joinColumns = @JoinColumn(name = "peca_id"),
        inverseJoinColumns = @JoinColumn(name = "fornecedor_id")
    )
    @JsonManagedReference
    List<Fornecedores> fornecedores;

}

package com.livraria.sistemalivraria;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Contas {

    @Id
    @Column(name = "conta_id", nullable = false)
    Integer codConta;

    @OneToOne
    @JoinColumn(name = "fornecedor_id", referencedColumnName = "fornecedor_id")
    @JsonBackReference
    Fornecedores fornecedores;

    @Column(name = "numero_conta", nullable = false)
    String numeroConta;

}

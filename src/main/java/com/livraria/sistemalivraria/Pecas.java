package com.livraria.sistemalivraria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pecas {

    @Id
    @Column(name = "peca_id", nullable = false)
    Integer codPeca;

    @Column(name = "peca_descricao", nullable = false)
    String descricao;

}

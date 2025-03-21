package com.evotech.odontoprev.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_plano")
public class Plano {

    @Id
    @Column(name = "id_plano")
    private String id;

    @Column(name = "nm_plano", nullable = false)
    private String nome;

    @Column(name = "tp_plano", nullable = false)
    private String tipo;

    @Column(name = "valor_plano", nullable = false)
    private Double valor;

    public Plano(String id) {
        this.id = id;
    }
}
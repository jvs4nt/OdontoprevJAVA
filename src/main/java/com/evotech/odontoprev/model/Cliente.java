package com.evotech.odontoprev.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @Column(name = "id_clie")
    private String id;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    @Column(name = "dt_cadastro", nullable = false)
    @Temporal(TemporalType.DATE)
    @CreationTimestamp // Preenche automaticamente com a data atual na inserção
    private Date dtCadastro;

    @Column(name = "nm_clie", nullable = false)
    private String nome;

    @Column(name = "dt_nasc", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtNascimento;

    @Column(name = "genero", nullable = false)
    private Character genero;

    @Column(name = "telefone", unique = true, nullable = false)
    private String telefone;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tb_endereco_id_end", nullable = false, unique = true)
    private Endereco endereco;

    @ManyToOne()
    @JoinColumn(name = "tb_plano_id_plano", nullable = false)
    private Plano plano;

    @PrePersist
    protected void onCreate() {
        this.dtCadastro = new Date();
        if (this.plano == null) {
            this.plano = new Plano("1");
        }
    }
}
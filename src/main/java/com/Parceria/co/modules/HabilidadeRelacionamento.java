package com.example.model;

import com.example.enumeration.TipoEntidade;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "habilidades_relacionamentos")
public class HabilidadeRelacionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "habilidade_id", nullable = false)
    private Habilidade habilidade;

    @Column(name = "entidade_id", nullable = false)
    private Long entidadeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entidade", nullable = false)
    private TipoEntidade tipoEntidade;
}


package com.Parceria.co.modules;

import com.Parceria.co.enums.TipoEntidade;
import com.Parceria.co.modules.skills.entities.Skill;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "habilidades_relacionamentos")
public class HabilidadeRelacionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "habilidade_id", nullable = false)
    private Skill skill;

    @Column(name = "entidade_id", nullable = false)
    private Long entidadeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entidade", nullable = false)
    private TipoEntidade tipoEntidade;
}


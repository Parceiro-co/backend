package com.Parceria.co.modules.assessments.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

import com.Parceria.co.modules.Empresa;
import com.Parceria.co.modules.Trabalho;
import com.Parceria.co.modules.parceiros.entities.Parceiro;

@Data
@Builder
@Entity
@Table(name = "avaliacoes")
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trabalho_id", nullable = false)
    private Trabalho trabalho;

    @ManyToOne
    @JoinColumn(name = "parceiro_id", nullable = false)
    private Parceiro parceiro;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    @Column(nullable = false)
    private Integer nota;

    private String comentario;

    @Column(name = "data_avaliacao", nullable = false, updatable = false)
    private LocalDateTime dataAvaliacao = LocalDateTime.now();

}

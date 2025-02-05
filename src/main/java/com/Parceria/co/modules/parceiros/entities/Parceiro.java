package com.Parceria.co.modules.parceiros.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "parceiros")
public class Parceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "disponibilidade", nullable = false)
    private Boolean disponibility;

    @Column(name = "sobre")
    private String about;

    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime creationDate;
    // Não sei se está certo isso

    // Getters and Setters
}


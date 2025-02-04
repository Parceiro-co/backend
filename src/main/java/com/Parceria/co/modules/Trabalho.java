package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "trabalhos")
public class Trabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    private String titulo;
    private String descricao;

    @Column(name = "qtd_min_parceiros", nullable = false)
    private Integer quantidadeMinimaParceiros;

    private String pagamento;
    private String periodo;
    private String beneficios;
    private String perfilHabilidades;
    private String endereco;
    private String contato;

    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();

    // Getters e setters
}

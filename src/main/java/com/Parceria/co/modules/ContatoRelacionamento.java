package com.Parceria.co.modules;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

import com.Parceria.co.enums.TipoEntidade;
import com.Parceria.co.modules.contacts.entities.Contact;

@Data
@Entity
@Table(name = "contatos_relacionamentos")
public class ContatoRelacionamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "contato_id", nullable = false)
    private Contact contato;

    @Column(name = "entidade_id", nullable = false)
    private Long entidadeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entidade", nullable = false)
    private TipoEntidade tipoEntidade;

    private String descricao;

    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();
}

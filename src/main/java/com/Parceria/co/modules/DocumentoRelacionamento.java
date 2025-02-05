package com.Parceria.co.modules;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

import com.Parceria.co.enums.TipoEntidade;
import com.Parceria.co.modules.documents.entities.Document;


@Data
@Entity
@Table(name = "documentos_relacionamentos")
public class DocumentoRelacionamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "documento_id", nullable = false)
    private Document document;

    @Column(name = "entidade_id", nullable = false)
    private Long entidadeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entidade", nullable = false)
    private TipoEntidade tipoEntidade;

    @Column(name = "data_envio", nullable = false, updatable = false)
    private LocalDateTime dataEnvio = LocalDateTime.now();

}

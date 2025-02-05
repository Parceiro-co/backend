package com.Parceria.co.modules;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

import com.Parceria.co.enums.TipoEntidade;

@Data
@Builder
@Entity
@Table(name = "enderecos_relacionamentos")
public class EnderecoRelacionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    // private Endereco endereco;
    private String endereco;

    @Column(name = "entidade_id", nullable = false)
    private Long entidadeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entidade", nullable = false)
    private TipoEntidade tipoEntidade;

    @Column(name = "data_envio", nullable = false, updatable = false)
    private LocalDateTime dataEnvio = LocalDateTime.now();

}

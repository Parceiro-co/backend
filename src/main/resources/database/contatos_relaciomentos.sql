CREATE TABLE contatos_relacionamentos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único do relacionamento
    contato_id INT NOT NULL, -- Referência para a tabela contatos
    entidade_id INT NOT NULL, -- ID da entidade associada (trabalho, empresa ou parceiro)
    tipo_entidade ENUM('EMPRESA', 'TRABALHO', 'PARCEIRO') NOT NULL, -- Define o tipo da entidade
    descricao TEXT, -- Observação ou descrição adicional sobre o relacionamento
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP, -- Data de criação do registro
    FOREIGN KEY (contato_id) REFERENCES contatos(id) ON DELETE CASCADE -- Relacionamento com contatos
);

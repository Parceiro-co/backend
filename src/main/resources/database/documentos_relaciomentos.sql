CREATE TABLE documentos_relacionamentos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único do documento
    documento_id INT NOT NULL, -- Referência para a tabela empresas
    entidade_id INT NOT NULL, -- ID da entidade associada (trabalho, empresa ou parceiro)
    tipo_entidade ENUM('EMPRESA', 'PARCEIRO') NOT NULL, -- Define o tipo da entidade
    data_envio DATETIME DEFAULT CURRENT_TIMESTAMP, -- Data de envio do documento
    FOREIGN KEY (documento_id) REFERENCES documentos(id) ON DELETE CASCADE 
);

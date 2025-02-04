CREATE TABLE enderecos_relacionamentos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único do documento
    endereco_id INT NOT NULL, -- Referência para a tabela empresas
    entidade_id INT NOT NULL, -- ID da entidade associada (trabalho, empresa ou parceiro)
    tipo_entidade ENUM('EMPRESA', 'PARCEIRO', 'TRABALHO') NOT NULL, -- Define o tipo da entidade
    data_envio DATETIME DEFAULT CURRENT_TIMESTAMP, -- Data de envio do documento
    FOREIGN KEY (endereco_id) REFERENCES enderecos(id) ON DELETE CASCADE 
);

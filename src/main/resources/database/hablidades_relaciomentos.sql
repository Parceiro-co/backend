CREATE TABLE habilidades_relaciomentos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único
    habilidade_id INT NOT NULL, -- Habilidade necessária
    entidade_id INT NOT NULL, -- ID da entidade associada (trabalho, empresa ou parceiro)
    tipo_entidade ENUM('EMPRESA', 'PARCEIRO', 'TRABALHO') NOT NULL, -- Define o tipo da entidade
    FOREIGN KEY (habilidade_id) REFERENCES habilidades(id) ON DELETE CASCADE
);
CREATE TABLE avaliacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    trabalho_id INT NOT NULL, -- Chave estrangeira para o trabalho relacionado
    parceiro_id INT NOT NULL, -- Chave estrangeira para o parceiro avaliado
    empresa_id INT NOT NULL, -- Chave estrangeira para a empresa que avaliou
    nota INT CHECK (nota BETWEEN 1 AND 5), -- Nota de 1 a 5
    comentario TEXT, -- Comentário sobre o parceiro
    data_avaliacao DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (trabalho_id) REFERENCES trabalhos(id) ON DELETE CASCADE,
    FOREIGN KEY (parceiro_id) REFERENCES parceiros(id) ON DELETE CASCADE,
    FOREIGN KEY (empresa_id) REFERENCES empresas(id) ON DELETE CASCADE
);

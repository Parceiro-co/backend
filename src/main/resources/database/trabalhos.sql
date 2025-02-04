CREATE TABLE trabalhos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    empresa_id INT NOT NULL, -- Chave estrangeira para empresas
    titulo VARCHAR(255) NOT NULL, -- Nome do trabalho
    descricao TEXT NOT NULL, -- Descrição detalhada do trabalho
    qtd_min_parceiros INT NOT NULL, -- Quantidade mínima de parceiros
    pagamento VARCHAR(255) NOT NULL, -- Informações sobre pagamento
    periodo VARCHAR(255) NOT NULL, -- Período do trampo
    beneficios TEXT, -- Benefícios, se houver
    perfil_habilidades TEXT NOT NULL, -- Perfil e habilidades desejadas
    endereco VARCHAR(255) NOT NULL, -- Endereço do trabalho
    contato VARCHAR(255) NOT NULL, -- Informações de contato
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (empresa_id) REFERENCES empresas(id) ON DELETE CASCADE
);

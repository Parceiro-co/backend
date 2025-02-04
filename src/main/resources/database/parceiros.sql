CREATE TABLE parceiros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL, 
    disponibilidade TINYINT(1) DEFAULT 0, -- Disponibilidade de horário ou dias
    sobre TEXT,
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP
);

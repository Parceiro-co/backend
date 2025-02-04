CREATE TABLE enderecos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único do endereço
    logradouro VARCHAR(255) NOT NULL, -- Rua, avenida, etc.
    numero VARCHAR(10) NOT NULL, -- Número do endereço
    complemento VARCHAR(255), -- Complemento (ex.: apto, bloco)
    bairro VARCHAR(255) NOT NULL, -- Bairro
    cidade VARCHAR(255) NOT NULL, -- Cidade
    estado VARCHAR(2) NOT NULL, -- Estado (ex.: SP, RJ)
    cep VARCHAR(15) NOT NULL, -- Código postal (CEP)
    pais VARCHAR(255) DEFAULT 'Brasil' -- País (padrão: Brasil)
);

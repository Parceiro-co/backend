CREATE TABLE empresas (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único para cada empresa
    nome VARCHAR(255) NOT NULL, -- Nome da empresa ou contratante
    endereco VARCHAR(255), -- Endereço completo da empresa
    cidade VARCHAR(100), -- Cidade da empresa
    estado VARCHAR(50), -- Estado (UF) ou região da empresa
    cep VARCHAR(10), -- CEP (código postal)
    telefone VARCHAR(20), -- Telefone para contato
    email VARCHAR(150), -- Email para contato
    website VARCHAR(255), -- Website da empresa (opcional)
    setor VARCHAR(100), -- Setor ou indústria (ex.: Tecnologia, Saúde, Construção)
    descricao TEXT, -- Descrição ou informações adicionais sobre a empresa
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP -- Data em que foi cadastrada no sistema
);

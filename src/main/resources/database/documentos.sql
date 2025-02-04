CREATE TABLE documentos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único do documento
    nome VARCHAR(255) NOT NULL, -- Nome ou tipo do documento
    valor VARCHAR(255) NOT NULL, -- Valor do documento
    caminho VARCHAR(255) NOT NULL, -- Caminho ou URL do arquivo armazenado
    descricao TEXT, -- Descrição ou informações adicionais sobre o documento
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- Data de envio do documento
);

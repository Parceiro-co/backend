CREATE TABLE contatos (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único do contato
    tipo_contato VARCHAR(50) NOT NULL, -- Tipo de contato (ex.: telefone, e-mail, WhatsApp)
    valor_contato VARCHAR(255) NOT NULL, -- Valor do contato (ex.: número, e-mail, link)
    descricao TEXT, -- Descrição ou observação adicional sobre o contato
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP -- Data de criação do registro
);

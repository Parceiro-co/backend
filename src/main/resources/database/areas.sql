CREATE TABLE areas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,  -- Nome da área (ex: "Tecnologia da Informação")
    categoria VARCHAR(100) NOT NULL,  -- Categoria da área (ex: "Técnica", "Gestão", etc.)
    nivel ENUM('BASIC', 'INTERMEDIARY', 'ADVANCED') DEFAULT 'INTERMEDIARY',  -- Nível da área
    descricao TEXT  -- Descrição detalhada da área
);

-- Inserir Áreas
INSERT INTO areas (nome, categoria, tipo, nivel, descricao, status) VALUES
('Tecnologia da Informação', 'Tecnológica', 'Técnica', 'ADVANCED', 'Área dedicada ao desenvolvimento de software, redes, cibersegurança e gerenciamento de dados. Fundamental para a inovação em muitas indústrias, com foco em habilidades de programação, infraestrutura e suporte técnico.', 'Ativo'),
('Gestão', 'Administrativa', 'Gestão', 'INTERMEDIARY', 'Envolve a coordenação de equipes, planejamento estratégico e a tomada de decisões empresariais. Implica em habilidades de liderança, organização, finanças e execução de projetos.', 'Ativo'),
('Saúde e Cuidados', 'Saúde', 'Técnica', 'BASIC', 'Área dedicada ao atendimento e cuidados com a saúde, como medicina, enfermagem e terapias. Focada em habilidades práticas para o cuidado de pacientes e gestão de saúde pública.', 'Ativo'),
('Artísticas e Criativas', 'Criativa', 'Criativa', 'INTERMEDIARY', 'Áreas voltadas para expressão artística, design e outras formas criativas, como fotografia, pintura, e mídias digitais.', 'Ativo'),
('Comercial', 'Comercial', 'Comercial', 'INTERMEDIARY', 'Área responsável pelas atividades de vendas, marketing, estratégias de fidelização e manutenção de relacionamento com clientes. Importante para o crescimento das empresas.', 'Ativo'),
('Social', 'Social', 'Gestão', 'BASIC', 'Focada em iniciativas que envolvem a sociedade, como ONGs, movimentos sociais e projetos comunitários. Lida com questões de bem-estar social e sustentabilidade.', 'Ativo'),
('Educação', 'Acadêmica', 'Técnica', 'BASIC', 'Área dedicada ao ensino e ao desenvolvimento educacional, com foco em métodos pedagógicos e práticas de ensino em diversas áreas do conhecimento.', 'Ativo');

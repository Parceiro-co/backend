CREATE TABLE habilidades (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    fk_area INT NOT NULL,
        CONSTRAINT habilidades_fk_area FOREIGN KEY (fk_area) REFERENCES areas(id),
    descricao TEXT
);

-- Inserir Habilidades
INSERT INTO habilidades (fk_area, nome, tipo, nivel, descricao, relevancia) VALUES
-- Habilidades de Tecnologia da Informação
(1, 'Programação em Python', 'Técnica', 'AVANÇADO', 'Habilidade de escrever código em Python para desenvolvimento de sistemas, automações e análise de dados.', 'Alta'),
(1, 'Desenvolvimento Web (HTML, CSS, JavaScript)', 'Técnica', 'INTERMEDIÁRIO', 'Desenvolvimento de sites e aplicações web utilizando HTML, CSS e JavaScript. Envolve tanto front-end quanto back-end.', 'Alta'),
(1, 'Segurança Cibernética', 'Técnica', 'AVANÇADO', 'Conhecimento de práticas para proteger sistemas, redes e dados contra ameaças cibernéticas.', 'Alta'),
(1, 'Análise de Dados (SQL, Power BI)', 'Técnica', 'INTERMEDIÁRIO', 'Habilidade de interpretar e manipular grandes volumes de dados, utilizando ferramentas como SQL e Power BI.', 'Alta'),

-- Habilidades de Gestão
(2, 'Gestão de Projetos', 'Gestão', 'INTERMEDIÁRIO', 'Capacidade de gerenciar projetos desde a concepção até a execução, utilizando ferramentas como Trello, Asana e Jira.', 'Alta'),
(2, 'Gestão Financeira', 'Gestão', 'INTERMEDIÁRIO', 'Gerenciar as finanças de uma empresa, incluindo orçamento, fluxo de caixa, investimentos e relatórios financeiros.', 'Alta'),
(2, 'Liderança de Equipes', 'Interpessoal', 'AVANÇADO', 'Habilidade de liderar, motivar e coordenar equipes para alcançar os objetivos da empresa.', 'Alta'),
(2, 'Tomada de Decisão Estratégica', 'Gestão', 'AVANÇADO', 'Capacidade de tomar decisões informadas que afetam a direção de uma empresa ou projeto.', 'Alta'),

-- Habilidades de Saúde e Cuidados
(3, 'Primeiros Socorros', 'Técnica', 'BÁSICO', 'Conhecimentos essenciais para lidar com emergências médicas e salvar vidas até a chegada de profissionais de saúde.', 'Alta'),
(3, 'Enfermagem Básica', 'Técnica', 'INTERMEDIÁRIO', 'Cuidados gerais com pacientes, como administração de medicamentos, monitoramento de sinais vitais e curativos.', 'Alta'),
(3, 'Cuidados com Idosos', 'Técnica', 'INTERMEDIÁRIO', 'Atenção e suporte a idosos com necessidades físicas, emocionais e sociais.', 'Alta'),
(3, 'Cuidados Pós-operatórios', 'Técnica', 'INTERMEDIÁRIO', 'Habilidade em monitorar e auxiliar na recuperação de pacientes após procedimentos cirúrgicos.', 'Média'),

-- Habilidades Artísticas e Criativas
(4, 'Fotografia Digital', 'Criativa', 'INTERMEDIÁRIO', 'Técnicas de captura e edição de imagens digitais, com foco em composição, iluminação e tratamento de fotos.', 'Alta'),
(4, 'Design Gráfico (Photoshop, Illustrator)', 'Criativa', 'INTERMEDIÁRIO', 'Criação de designs gráficos para materiais promocionais, marcas e publicações digitais utilizando softwares de design.', 'Alta'),
(4, 'Pintura e Ilustração', 'Criativa', 'AVANÇADO', 'Habilidade em técnicas artísticas tradicionais, como pintura em óleo, aquarela, ou ilustração digital.', 'Alta'),
(4, 'Edição de Vídeo (Premiere, Final Cut)', 'Criativa', 'AVANÇADO', 'Habilidade em edição de vídeos profissionais para produções cinematográficas, comerciais ou conteúdo para redes sociais.', 'Alta'),

-- Habilidades Comerciais
(5, 'Vendas e Negociação', 'Comercial', 'INTERMEDIÁRIO', 'Capacidade de vender produtos ou serviços e negociar acordos vantajosos para a empresa.', 'Alta'),
(5, 'Gestão de Relacionamento com Clientes (CRM)', 'Comercial', 'INTERMEDIÁRIO', 'Habilidade em utilizar ferramentas de CRM para gerenciar o relacionamento com clientes e fidelizar o público-alvo.', 'Alta'),
(5, 'Marketing Digital (SEO, Ads, Analytics)', 'Comercial', 'INTERMEDIÁRIO', 'Estratégias de marketing digital para aumentar a visibilidade online, utilizando SEO, Google Ads e outras ferramentas analíticas.', 'Alta'),
(5, 'Gestão de Redes Sociais', 'Comercial', 'INTERMEDIÁRIO', 'Habilidade em administrar contas de redes sociais de empresas, criando conteúdo, interagindo com o público e promovendo campanhas.', 'Alta');


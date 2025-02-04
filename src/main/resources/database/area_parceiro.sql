CREATE TABLE area_parceiro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_area INT NOT NULL,
        CONSTRAINT area_parceiro_fk_area FOREIGN KEY (fk_area) REFERENCES areas(id),
    fk_parceiro INT NOT NULL,
        CONSTRAINT area_parceiro_fk_parceiro FOREIGN KEY (fk_parceiro) REFERENCES parceiros(id),
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
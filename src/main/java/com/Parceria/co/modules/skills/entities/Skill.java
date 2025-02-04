package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "habilidades")
public class Skill {
    
    public Skill() {

    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = 'nome')
    private String name;

    @Column(name = "categoria")
    private String category;

    // Getters e Setters
}

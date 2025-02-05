package com.Parceria.co.modules.parceiros.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToCreate;
import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToUpdate;
import com.Parceria.co.modules.parceiros.entities.Parceiro;
import com.Parceria.co.modules.parceiros.exceptions.ParceiroNotFoundException;
import com.Parceria.co.modules.parceiros.mappers.DtoToParceiroMapper;
import com.Parceria.co.modules.parceiros.repositories.ParceiroRepository;

import jakarta.validation.Valid;

public class ParceiroService {

    @Autowired
    private ParceiroRepository repository;

    @Autowired
    private DtoToParceiroMapper updater;
    
    @Autowired
    // private final ContactService contactService;

    public ResponseEntity<Parceiro> createParceiro(
        ParceiroDTORequestToCreate dto
    ) {

        // Na verdade todos esse objetos devem ser dtos
        // Address address = addressService.createAddress(
        //     dto.Address()
        // );

        // Na verdade todos esse objetos devem ser dtos
        // Contact contact = contactService.createContact(
        //     dto.Contact()
        // );

        // Na verdade todos esse objetos devem ser dtos
        // Document document = documentService.createDocument(
        //     "CPF",
        //     dto.Document()
        // );

        Parceiro saved = repository.save(
            Parceiro.builder()
            .name(dto.name())
            .disponibility(false)
            .about("")
            .creationDate(LocalDateTime.now())
            .build()
        );
        
        return ResponseEntity.status(201).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<Parceiro>> readAllParceiro() {
        List<Parceiro> parceiros = repository.findAll( );
        
        if (parceiros.isEmpty()) throw new ParceiroNotFoundException("Parceiros not found");

        return ResponseEntity.status(200).body(parceiros);
    }

    @PostMapping
    public ResponseEntity<Parceiro> updateParceiro(
        @PathVariable Long id, 
        @Valid @RequestBody ParceiroDTORequestToUpdate dto
    ) {
        Parceiro parceiro = repository.findById(id)
            .orElseThrow(() -> new ParceiroNotFoundException("Parceiro not found with id: "+ id));

        Parceiro updated = repository.save(
            updater.map(parceiro, dto)
        );

        return ResponseEntity.status(201).body(updated);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteParceiro(
        @PathVariable Long id 
    ) {
        Parceiro parceiro = repository.findById(id)
            .orElseThrow(() -> new ParceiroNotFoundException("Parceiro not found with id: "+ id));

        repository.delete(parceiro);
        return ResponseEntity.status(204).build();
    }

}
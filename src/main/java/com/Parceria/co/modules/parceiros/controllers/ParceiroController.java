package com.Parceria.co.modules.parceiros.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToCreate;
import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToUpdate;
import com.Parceria.co.modules.parceiros.dtos.ParceiroDTOResponse;
import com.Parceria.co.modules.parceiros.exceptions.ParceiroNotFoundException;
import com.Parceria.co.modules.parceiros.mappers.ParceiroToDtoMapper;
import com.Parceria.co.modules.parceiros.services.ParceiroService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/parceiros")
public class ParceiroController {

    private final ParceiroService service;
    private final ParceiroToDtoMapper mapper;

    @PostMapping
    public ResponseEntity<ParceiroDTOResponse> createParceiro(
        @Valid @RequestBody ParceiroDTORequestToCreate parceiroRequest
    ) {
        return ResponseEntity.status(201).body(
            mapper.map(service.createParceiro(parceiroRequest))
        );
    }

    @GetMapping
    public ResponseEntity<List<ParceiroDTOResponse>> readAllParceiro() {
        try {
            return ResponseEntity.status(200).body(
                service.readAllParceiro().stream()
                    .map(it -> mapper.map(it))
                    .toList()
            );
        } catch (ParceiroNotFoundException e) {
            System.out.println("Error: "+ e.getMessage() + e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping
    public ResponseEntity<ParceiroDTOResponse> updateParceiro(
        @PathVariable Long id, 
        @Valid @RequestBody ParceiroDTORequestToUpdate parceiroRequest
    ) {
        try {
            return ResponseEntity.status(201).body(
                mapper.map(service.updateParceiro(id, parceiroRequest))
            );
        } catch (ParceiroNotFoundException e) {
            System.out.println("Erro: "+ e.getMessage() + e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteParceiro(
        @PathVariable Long id 
    ) {
        try {
            service.deleteParceiro(id);
            return ResponseEntity.status(204).build();
        } catch (ParceiroNotFoundException e) {
            System.out.println("Erro: "+ e.getMessage() + e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Outros
}
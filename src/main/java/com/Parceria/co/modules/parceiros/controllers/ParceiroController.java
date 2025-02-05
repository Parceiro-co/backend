package com.Parceria.co.modules.parceiros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToCreate;
import com.Parceria.co.modules.parceiros.dtos.ParceiroDTOResponse;
import com.Parceria.co.modules.parceiros.mappers.ParceiroToDtoMapper;
import com.Parceria.co.modules.parceiros.services.ParceiroService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/parceiros")
public class ParceiroController {

    @Autowired
    private ParceiroService service;

    @Autowired
    private ParceiroToDtoMapper mapper;


    /*
        - createParceiro - Create
        - endpoint para criar parceiro
        - endpoint "/parceiros" (POST)
    */
    @PostMapping
    public ResponseEntity<ParceiroDTOResponse> createParceiro(
        @Valid @RequestBody ParceiroDTORequestToCreate parceiroRequest
    ) {
        try {
            return service.createParceiro(parceiroRequest);
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
    }

    @GetMapping
    public ResponseEntity<List<?>> readAllParceiro() {
        try {
            return service.readAllParceiro();
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
    }

    @PostMapping
    public ResponseEntity<?> updateParceiro(
        @PathVariable Long id, 
        @Valid @RequestBody ParceiroDTORequestToCreate parceiroRequest
    ) {
        try {
            return service.updateParceiro(parceiroRequest);
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
    }

    @DeleteMapping
    public Void deleteParceiro(
        @PathVariable Long id 
    ) {
        try {
            return service.deleteParceiro(id);
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
    }

    // Outros
}
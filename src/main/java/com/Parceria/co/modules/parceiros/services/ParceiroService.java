package com.Parceria.co.modules.parceiros.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToCreate;
import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToUpdate;
import com.Parceria.co.modules.parceiros.entities.Parceiro;
import com.Parceria.co.modules.parceiros.exceptions.ParceiroNotFoundException;
import com.Parceria.co.modules.parceiros.mappers.DtoToParceiroMapper;
import com.Parceria.co.modules.parceiros.repositories.ParceiroRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ParceiroService {

    private final ParceiroRepository repository;
    private final DtoToParceiroMapper updater;
    
    // private final ContactService contactService;

    public Parceiro createParceiro(ParceiroDTORequestToCreate dto) {


        // AQUI TEM QUE CRIAR TODOS ESSE OBJETO ANTES PARA RELACIONAR COM O USUARIO
        
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

        return repository.save(
            Parceiro.builder()
            .name(dto.name())
            .disponibility(false)
            .about("")
            .creationDate(LocalDateTime.now())
            .build()
        );
    }

    public List<Parceiro> readAllParceiro() {
        List<Parceiro> parceiros = repository.findAll( );
        
        if (parceiros.isEmpty()) throw new ParceiroNotFoundException("Parceiros not found");

        return parceiros;
    }

    public Parceiro updateParceiro(Long id, ParceiroDTORequestToUpdate dto) {
        Parceiro parceiro = repository.findById(id)
            .orElseThrow(() -> new ParceiroNotFoundException("Parceiro not found with id: "+ id));

        return repository.save(
            updater.map(parceiro, dto)
        );
    }

    public void deleteParceiro(Long id) {
        if (repository.existsById(id)) repository.deleteById(id); 

        else throw new ParceiroNotFoundException("Parceiro not found with id: "+ id);
    }

}

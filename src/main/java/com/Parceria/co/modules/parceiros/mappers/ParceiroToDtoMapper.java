package com.Parceria.co.modules.parceiros.mappers;

import org.springframework.stereotype.Component;
import com.Parceria.co.interfaces.Mapper;
import com.Parceria.co.modules.parceiros.dtos.ParceiroDTOResponse;
import com.Parceria.co.modules.parceiros.entities.Parceiro;

@Component
public class ParceiroToDtoMapper implements Mapper<Parceiro, ParceiroDTOResponse> {
    
    @Override
    public ParceiroDTOResponse map(Parceiro model) {
        return new ParceiroDTOResponse(
            // o id deve ser encriptado para ir e para voltar
            model.getId(),
            model.getName(),
            model.getDisponibility(),
            model.getAbout()
        );
    }

}
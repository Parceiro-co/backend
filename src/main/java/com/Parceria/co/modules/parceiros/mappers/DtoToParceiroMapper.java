package com.Parceria.co.modules.parceiros.mappers;

import org.springframework.stereotype.Component;

import com.Parceria.co.interfaces.Updater;
import com.Parceria.co.modules.parceiros.dtos.ParceiroDTORequestToUpdate;
import com.Parceria.co.modules.parceiros.entities.Parceiro;
import com.Parceria.co.modules.parceiros.exceptions.ParceiroIllegalArgumentException;

@Component
public class DtoToParceiroMapper implements Updater<Parceiro, ParceiroDTORequestToUpdate> {
    
    @Override
    public Parceiro map(Parceiro model, ParceiroDTORequestToUpdate dto) {
        if (dto == null || model == null) throw new ParceiroIllegalArgumentException("Params cannot be null");

        if (!dto.name().isBlank()) model.setName(dto.name());
        if (dto.disponibility() != null) model.setDisponibility(dto.disponibility());
        if (!dto.about().isBlank()) model.setAbout(dto.about()); 
        
        return model;
    }

}

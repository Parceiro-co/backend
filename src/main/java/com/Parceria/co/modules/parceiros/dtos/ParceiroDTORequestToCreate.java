package com.Parceria.co.modules.parceiros.dtos;

import jakarta.validation.constraints.NotBlank;

public record ParceiroDTORequestToCreate(
    
    @NotBlank(message = "Address cannot be blank")
    String address,

    @NotBlank(message = "Contact cannot be blank")
    String contact,

    @NotBlank(message = "Document cannot be blank")
    String document,
    
    @NotBlank(message = "Name cannot be blank")
    String name
    
) {}

package com.Parceria.co.modules.parceiros.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ParceiroNotFoundException extends RuntimeException {

    public ParceiroNotFoundException(String message) {
        super(message);
    }

    public ParceiroNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
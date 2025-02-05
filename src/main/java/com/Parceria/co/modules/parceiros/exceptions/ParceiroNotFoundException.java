package com.Parceria.co.modules.parceiros.exceptions;

public class ParceiroNotFoundException extends RuntimeException {

    public ParceiroNotFoundException(String message) {
        super(message);
    }

    public ParceiroNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
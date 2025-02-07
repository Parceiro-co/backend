package com.Parceria.co.modules.parceiros.exceptions;

public class ParceiroException extends RuntimeException {
    
    public ParceiroException(String message) {
        super(message);
    }

    public ParceiroException(String message, Throwable cause) {
        super(message, cause);
    }
}

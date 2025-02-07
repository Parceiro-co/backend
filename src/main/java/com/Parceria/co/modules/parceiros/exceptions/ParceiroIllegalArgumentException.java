package com.Parceria.co.modules.parceiros.exceptions;

public class ParceiroIllegalArgumentException extends RuntimeException {
    
    public ParceiroIllegalArgumentException(String message) {
        super(message);
    }

    public ParceiroIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}

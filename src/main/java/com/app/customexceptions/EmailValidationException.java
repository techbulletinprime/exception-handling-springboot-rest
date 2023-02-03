package com.app.customexceptions;

public class EmailValidationException extends RuntimeException {

    public EmailValidationException(String error) {
        super(error);

    }
}

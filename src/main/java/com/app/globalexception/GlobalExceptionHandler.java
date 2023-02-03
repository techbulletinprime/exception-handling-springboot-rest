package com.app.globalexception;

import com.app.customexceptions.FirstNameValidationException;
import com.app.errors.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = FirstNameValidationException.class)
    public ResponseEntity<Error> emailValidation(FirstNameValidationException exception) {
        Error error = new Error(1000, exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}

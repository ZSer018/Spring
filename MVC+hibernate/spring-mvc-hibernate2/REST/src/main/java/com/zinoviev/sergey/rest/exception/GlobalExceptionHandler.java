package com.zinoviev.sergey.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<IncorrectData> noEmployeeException(NoEmployeeException exception){
        IncorrectData incorrectData = new IncorrectData();
        incorrectData.setMessage(exception.getMessage());
        return new ResponseEntity<>(incorrectData, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<IncorrectData> anyException(Exception exception){
        IncorrectData incorrectData = new IncorrectData();
        incorrectData.setMessage(exception.getMessage());
        return new ResponseEntity<>(incorrectData, HttpStatus.NOT_FOUND);
    }
}

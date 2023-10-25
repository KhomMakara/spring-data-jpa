package com.raadev.java.cruddemo.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobeExceptionHandler {
    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<?> handlerApiException(ApiException e){

        ErrorResponse errorResponse = new ErrorResponse(e.getHttpStatus(),e.getMessage());

        return ResponseEntity.status(e.getHttpStatus()).body(errorResponse);
    }
}


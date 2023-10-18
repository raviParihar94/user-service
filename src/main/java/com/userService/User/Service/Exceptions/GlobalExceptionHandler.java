package com.userService.User.Service.Exceptions;

import com.userService.User.Service.payload.ApiResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResource> handleResourceNotFoundException( ResourceNotFoundException ex){

        String messge = ex.getMessage();
        ApiResource resp =  ApiResource.builder().message(messge).success(true).build();
        return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
    }
}

package com.example.demoPractice.exception;

import com.example.demoPractice.model.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandling {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> notValid(MethodArgumentNotValidException e, HttpServletRequest request){
        List<String> errorsList = new ArrayList<>();
        e.getAllErrors().forEach(err -> errorsList.add(err.getDefaultMessage()));

        return new ResponseEntity(new Response(errorsList, e.getMessage()), HttpStatus.MULTI_STATUS);
    }
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> exceptionHandle(NotFoundException e) {
        return new ResponseEntity(new Response(null, e.getMessage()), HttpStatus.I_AM_A_TEAPOT);
    }

    @ExceptionHandler(EmptyListException.class)
    public ResponseEntity<?> exceptionHandle(EmptyListException e) {
        return new ResponseEntity(new Response(e, e.getMessage()), HttpStatus.I_AM_A_TEAPOT);
    }
}



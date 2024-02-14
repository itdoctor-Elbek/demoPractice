package com.example.demoPractice.exception;

public class EmptyListException  extends RuntimeException{
    public EmptyListException(String massage){
        super(massage);
    }
}

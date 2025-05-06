package com.backend.terraLedger.exception;

public class DocumentNotFoundException extends RuntimeException{
    public DocumentNotFoundException (Long id){
        super("Couldn't find a Document with id "+id);
    }
}

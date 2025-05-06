package com.backend.terraLedger.exception;

public class DisputeNotFoundException extends RuntimeException{
    public DisputeNotFoundException (Long id){
        super("Couldn't find a Dispute with id "+id);
    }

}

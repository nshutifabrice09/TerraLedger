package com.backend.terraLedger.exception;

public class KYCNotFoundException extends RuntimeException{
    public KYCNotFoundException (Long id){
        super ("Couldn't find a KYC with id "+id);
    }
}

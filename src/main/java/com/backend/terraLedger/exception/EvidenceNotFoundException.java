package com.backend.terraLedger.exception;

public class EvidenceNotFoundException extends RuntimeException{
    public EvidenceNotFoundException (Long id){
        super ("Couldn't find an Evidence with id "+id);
    }
}

package com.backend.terraLedger.exception;

public class LandParcelNotFoundException extends RuntimeException{
    public LandParcelNotFoundException(Long id){
        super("Couldn't find a Land Parcel with id "+id);
    }
}

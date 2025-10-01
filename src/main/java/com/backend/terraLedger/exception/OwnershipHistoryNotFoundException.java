package com.backend.terraLedger.exception;

import com.backend.terraLedger.model.OwnershipHistory;

public class OwnershipHistoryNotFoundException extends RuntimeException{
    public OwnershipHistoryNotFoundException (Long id){
        super("Couldn't find an OwnerHistory with id "+id);
    }
}

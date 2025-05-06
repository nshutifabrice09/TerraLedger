package com.backend.terraLedger.exception;

public class AuditLogNotFoundException extends RuntimeException{
    public AuditLogNotFoundException (Long id){
        super("Couldn't find an AuditLog with id "+id);
    }
}

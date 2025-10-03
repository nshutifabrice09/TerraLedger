package com.backend.terraLedger.service;

import com.backend.terraLedger.model.AuditLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService{
    @Override
    public List<AuditLog> getAllAuditLogs() {
        return null;
    }

    @Override
    public AuditLog getAuiAuditLogById(Long id) {
        return null;
    }

    @Override
    public AuditLog saveAuditLog(AuditLog auditLog, Long actorId) {
        return null;
    }


    @Override
    public AuditLog updateAuditLog(Long id, AuditLog auditLog) {
        return null;
    }

    @Override
    public void deleteAuditLogById(Long id) {

    }
}

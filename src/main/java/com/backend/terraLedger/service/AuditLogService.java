package com.backend.terraLedger.service;


import com.backend.terraLedger.model.AuditLog;

import java.util.List;

public interface AuditLogService {
    List<AuditLog> getAllAuditLogs();
    AuditLog getAuiAuditLogById(Long id);
    AuditLog saveAuditLog(AuditLog auditLog);
    AuditLog updateAuditLog(Long id, AuditLog auditLog);
    void deleteAuditLogById(Long id);
}

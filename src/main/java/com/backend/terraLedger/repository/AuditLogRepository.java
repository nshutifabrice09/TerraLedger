package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository <AuditLog, Long> {
}

package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends JpaRepository <AuditLog, Long> {
}

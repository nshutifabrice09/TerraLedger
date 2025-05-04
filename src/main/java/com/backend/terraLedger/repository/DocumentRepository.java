package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository <Document, Long> {
}

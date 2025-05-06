package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository <Document, Long> {
}

package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.Evidence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvidenceRepository extends JpaRepository <Evidence, Long> {
}

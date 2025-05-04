package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.Dispute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisputeRepository extends JpaRepository <Dispute, Long> {
}

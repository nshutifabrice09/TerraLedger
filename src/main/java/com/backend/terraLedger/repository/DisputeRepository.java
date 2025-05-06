package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.Dispute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisputeRepository extends JpaRepository <Dispute, Long> {
}

package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.KYC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KYCRepository extends JpaRepository <KYC, Long> {
}

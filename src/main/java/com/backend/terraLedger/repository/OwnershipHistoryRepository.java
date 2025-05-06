package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.OwnershipHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnershipHistoryRepository extends JpaRepository <OwnershipHistory,Long > {
}

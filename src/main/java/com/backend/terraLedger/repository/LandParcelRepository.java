package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.LandParcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandParcelRepository extends JpaRepository <LandParcel, Long> {
}

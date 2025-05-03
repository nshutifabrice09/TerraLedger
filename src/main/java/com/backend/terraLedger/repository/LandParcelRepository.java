package com.backend.terraLedger.repository;

import com.backend.terraLedger.model.LandParcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandParcelRepository extends JpaRepository <LandParcel, Long> {
}

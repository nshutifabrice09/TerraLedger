package com.backend.terraLedger.service;

import com.backend.terraLedger.model.LandParcel;

import java.util.List;

public interface LandParcelService {
    List<LandParcel> getAllLandParcels();
    LandParcel getLandParcelById(Long id);
    LandParcel saveLandParcel(LandParcel landParcel, Long ownerId);
    LandParcel updateLandParcel(Long id, LandParcel landParcel);
    void deleteLandParcelById(Long id);
}

package com.backend.terraLedger.service;

import com.backend.terraLedger.model.KYC;

import java.util.List;

public interface KYCService {
    List<KYC> getAllKycs();
    KYC getKycById(Long id);
    KYC saveKyc(KYC kyc, Long userId);
    KYC updateKyc(Long id, KYC kyc);
    void deleteKycById(Long id);
}

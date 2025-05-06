package com.backend.terraLedger.service;

import com.backend.terraLedger.model.KYC;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KYCServiceImplementation implements KYCService{
    @Override
    public List<KYC> getAllKycs() {
        return null;
    }

    @Override
    public KYC getKycById(Long id) {
        return null;
    }

    @Override
    public KYC saveKyc(KYC kyc) {
        return null;
    }

    @Override
    public KYC updateKyc(Long id, KYC kyc) {
        return null;
    }

    @Override
    public void deleteKycById(Long id) {

    }
}

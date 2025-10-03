package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Evidence;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvidenceServiceImplementation implements EvidenceService{
    @Override
    public List<Evidence> getAllEvidences() {
        return null;
    }

    @Override
    public Evidence getEvidenceById(Long id) {
        return null;
    }

    @Override
    public Evidence saveEvidence(Evidence evidence, Long disputeId, Long uploadedById) {
        return null;
    }


    @Override
    public Evidence updateEvidence(Long id, Evidence evidence) {
        return null;
    }

    @Override
    public void deleteEvidenceById(Long id) {

    }
}

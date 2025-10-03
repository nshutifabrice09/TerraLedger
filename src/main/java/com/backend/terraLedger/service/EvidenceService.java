package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Evidence;

import java.util.List;

public interface EvidenceService {
    List<Evidence> getAllEvidences();
    Evidence getEvidenceById(Long id);
    Evidence saveEvidence(Evidence evidence, Long disputeId, Long uploadedById);
    Evidence updateEvidence(Long id, Evidence evidence);
    void deleteEvidenceById(Long id);
}

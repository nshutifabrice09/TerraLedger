package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Dispute;

import java.util.List;

public interface DisputeService {
    List<Dispute> getAllDisputes();
    Dispute getDisputeById(Long id);
    Dispute saveDispute(Dispute dispute);
    Dispute updateDispute(Long id, Dispute dispute);
}

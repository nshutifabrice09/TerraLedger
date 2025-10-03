package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Dispute;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisputeServiceImplementation implements DisputeService{
    @Override
    public List<Dispute> getAllDisputes() {
        return null;
    }

    @Override
    public Dispute getDisputeById(Long id) {
        return null;
    }

    @Override
    public Dispute saveDispute(Dispute dispute, Long landParcelId) {
        return null;
    }

    @Override
    public Dispute updateDispute(Long id, Dispute dispute) {
        return null;
    }

    @Override
    public void deleteDisputeById(Long id) {

    }
}

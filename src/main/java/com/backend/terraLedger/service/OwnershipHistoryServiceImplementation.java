package com.backend.terraLedger.service;

import com.backend.terraLedger.model.OwnershipHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnershipHistoryServiceImplementation implements OwnershipHistoryService{
    @Override
    public List<OwnershipHistory> getAlOwnershipHistories() {
        return null;
    }

    @Override
    public OwnershipHistory getOwnershipHistoryById(Long id) {
        return null;
    }

    @Override
    public OwnershipHistory saveOwnershipHistory(OwnershipHistory ownershipHistory) {
        return null;
    }

    @Override
    public OwnershipHistory updateOwnershipHistory(Long id, OwnershipHistory ownershipHistory) {
        return null;
    }

    @Override
    public void deleteOwnershipHistoryById(Long id) {

    }
}

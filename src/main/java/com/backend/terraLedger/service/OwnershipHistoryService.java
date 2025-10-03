package com.backend.terraLedger.service;

import com.backend.terraLedger.model.OwnershipHistory;

import java.util.List;

public interface OwnershipHistoryService {
    List<OwnershipHistory> getAlOwnershipHistories();
    OwnershipHistory getOwnershipHistoryById(Long id);
    OwnershipHistory saveOwnershipHistory(OwnershipHistory ownershipHistory, Long landParcelId, Long fromUserId, Long toUserId);
    OwnershipHistory updateOwnershipHistory(Long id, OwnershipHistory ownershipHistory);
    void deleteOwnershipHistoryById (Long id);
}

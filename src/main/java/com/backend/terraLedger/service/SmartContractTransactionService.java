package com.backend.terraLedger.service;

import com.backend.terraLedger.model.SmartContractTransaction;

import java.util.List;

public interface SmartContractTransactionService {
    List<SmartContractTransaction> getSmartContractTransactions();
    SmartContractTransaction getSmartContractTransaction(Long id);
    SmartContractTransaction saveSmartContractTransaction(SmartContractTransaction smartContractTransaction, Long landPracelId);
    SmartContractTransaction updateSmartContractTransaction(Long id, SmartContractTransaction smartContractTransaction);

    void delete(Long id);
}

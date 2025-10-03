package com.backend.terraLedger.service;

import com.backend.terraLedger.model.SmartContractTransaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartContractTransactionServiceIImplementation implements SmartContractTransactionService{
    @Override
    public List<SmartContractTransaction> getSmartContractTransactions() {
        return null;
    }

    @Override
    public SmartContractTransaction getSmartContractTransaction(Long id) {
        return null;
    }

    @Override
    public SmartContractTransaction saveSmartContractTransaction(SmartContractTransaction smartContractTransaction, Long landPracelId) {
        return null;
    }

    @Override
    public SmartContractTransaction updateSmartContractTransaction(Long id, SmartContractTransaction smartContractTransaction) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

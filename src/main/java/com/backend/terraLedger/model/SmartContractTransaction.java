package com.backend.terraLedger.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "smart_contract_transaction")
public class SmartContractTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contractAddress;
    private String transactionHash;
    private String action; //"OwnershipTransfer", "LandRegistration"
    private LocalDateTime timestamp;
    private boolean success;
    @ManyToOne
    private LandParcel landParcel;

}

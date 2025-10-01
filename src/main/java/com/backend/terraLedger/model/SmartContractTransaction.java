package com.backend.terraLedger.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "smart_contract_transaction")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    @JoinColumn(name = "landParcel_id")
    private LandParcel landParcel;

}

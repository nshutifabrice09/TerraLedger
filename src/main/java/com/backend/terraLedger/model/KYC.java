package com.backend.terraLedger.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kyc")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KYC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idDocumentUrl;
    private String proofOfResidenceUrl;

    @Enumerated(EnumType.STRING)
    private KYCStatus status;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}

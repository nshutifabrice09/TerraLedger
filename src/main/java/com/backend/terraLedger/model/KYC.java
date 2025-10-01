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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdDocumentUrl() {
        return idDocumentUrl;
    }

    public void setIdDocumentUrl(String idDocumentUrl) {
        this.idDocumentUrl = idDocumentUrl;
    }

    public String getProofOfResidenceUrl() {
        return proofOfResidenceUrl;
    }

    public void setProofOfResidenceUrl(String proofOfResidenceUrl) {
        this.proofOfResidenceUrl = proofOfResidenceUrl;
    }

    public KYCStatus getStatus() {
        return status;
    }

    public void setStatus(KYCStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

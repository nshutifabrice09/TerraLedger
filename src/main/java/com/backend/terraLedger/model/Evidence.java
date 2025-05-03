package com.backend.terraLedger.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "evidences")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Evidence {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Dispute dispute;

    @ManyToOne
    private User uploadedBy;

    private String fileUrl;
    private String fileType;
    private LocalDateTime timestamp;
}

package com.backend.terraLedger.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "disputes")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dispute {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private LandParcel landParcel;

    @ManyToMany
    private List<User> partiesInvolved;

    @Enumerated(EnumType.STRING)
    private DisputeStatus status;

    @Lob
    private String description;

    private LocalDate openedDate;
    private LocalDate resolvedDate;

    @OneToMany(mappedBy = "dispute", cascade = CascadeType.ALL)
    private List<Evidence> evidences;
}

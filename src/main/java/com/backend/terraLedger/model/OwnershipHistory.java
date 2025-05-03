package com.backend.terraLedger.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "ownership-histories")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OwnershipHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private LandParcel landParcel;

    @ManyToOne
    private User fromUser;

    @ManyToOne
    private User toUser;

    private LocalDate transferDate;
    private String contractHash;

}
